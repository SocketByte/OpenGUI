package pl.socketbyte.opengui;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import pl.socketbyte.opengui.event.ElementResponse;
import pl.socketbyte.opengui.event.WindowResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public abstract class GUIExtender implements Listener, WindowResponse {

    private final int id;

    private final List<FinalItemJob> jobs = new ArrayList<>();
    private final Map<Integer, GUIElement> elements = new HashMap<>();
    private GUISettings guiSettings;
    private GUI gui;
    private WindowResponse windowResponse;

    public GUIExtender(GUI gui) {
        this.gui = gui;
        this.id = OpenGUI.INSTANCE.getGUIs().size();
        OpenGUI.INSTANCE.getGUIs().put(id, this);

        this.guiSettings = new GUISettings();
        this.guiSettings.setCanEnterItems(false);
        this.guiSettings.setCanDrag(false);

        Bukkit.getPluginManager().registerEvents(this, OpenGUI.INSTANCE.getInstance());
    }

    public void addEmptyElementResponse(int slot, boolean pullable) {
        GUIElement guiElement = new GUIElement(slot, pullable);
        elements.put(slot, guiElement);
    }

    public void addElementResponse(int slot, ElementResponse elementResponse) {
        GUIElement guiElement = new GUIElement(slot);
        guiElement.addElementResponse(slot, elementResponse);
        elements.put(slot, guiElement);
    }

    public void addElementResponse(int slot, boolean pullable, ElementResponse elementResponse) {
        GUIElement guiElement = new GUIElement(slot);
        guiElement.addElementResponse(slot, pullable, elementResponse);
        elements.put(slot, guiElement);
    }

    public void addElementResponse(int slot, GUIExtenderItem guiExtenderItem) {
        GUIElement guiElement = new GUIElement(slot);
        guiElement.addElementResponse(slot, guiExtenderItem.isPullable(), guiExtenderItem);
        elements.put(slot, guiElement);
    }

    private void addEmptyElementResponse(int slot) {
        GUIElement guiElement = new GUIElement(slot);
        elements.put(slot, guiElement);
    }

    public void addWindowResponse(WindowResponse windowResponse) {
        this.windowResponse = windowResponse;
    }


    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        if (event.getView().getTopInventory().equals(getBukkitInventory())
                && !guiSettings.isCanDrag())
            event.setCancelled(true);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView() == null
                || event.getView().getTopInventory() == null
                || event.getView().getBottomInventory() == null
                || event.getClickedInventory() == null)
            return;

        if (event.getView().getTopInventory().equals(getBukkitInventory())
                && !guiSettings.isCanEnterItems()) {
            if (event.isShiftClick() &&
                    !event.getClickedInventory().equals(getBukkitInventory())) {
                event.setCancelled(true);
                return;
            }
            else if (!event.isShiftClick() &&
                    event.getClickedInventory().equals(getBukkitInventory())
                    && (event.getCurrentItem() == null || event.getCurrentItem().getType().equals(Material.AIR))) {
                event.setCancelled(true);
                return;
            }
            else if (!event.isShiftClick() &&
                    event.getClickedInventory().equals(getBukkitInventory())) {
                checkElements(event);
                return;
            }
            else if (event.isShiftClick() &&
                    event.getClickedInventory().equals(getBukkitInventory())) {
                checkElements(event);
                return;
            }
            event.setCancelled(false);
            return;
        }
        checkElements(event);
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
        if (e.getView().getTopInventory().equals(getBukkitInventory())) {
            if (windowResponse != null)
                windowResponse.onOpen(e);
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e) {
        if (e.getView().getTopInventory().equals(getBukkitInventory())) {
            if (windowResponse != null)
                windowResponse.onClose(e);
        }
    }

    public void setItem(ItemPack... itemPacks) {
        for (ItemPack itemPack : itemPacks) {
            ItemBuilder itemBuilder = itemPack.getItemBuilder();
            int slot = itemPack.getSlot();

            if (itemPack.getElementResponse() != null)
                addElementResponse(slot, itemPack.getElementResponse());
            else addEmptyElementResponse(slot);

            gui.setItem(slot, itemBuilder);
            updateInventory();
        }
    }

    public void setItem(int slot, ItemBuilder itemBuilder) {
        gui.setItem(slot, itemBuilder);
        addEmptyElementResponse(slot);
        updateInventory();
    }

    public void setItem(int slot, ItemBuilder itemBuilder, ElementResponse elementResponse) {
        gui.setItem(slot, itemBuilder);
        addElementResponse(slot, elementResponse);
        updateInventory();
    }

    public void setItem(int slot, GUIExtenderItem guiExtenderItem) {
        jobs.add(new FinalItemJob(slot, guiExtenderItem));
    }

    public int addItem(ItemBuilder itemBuilder) {
        int index = gui.addItem(itemBuilder);
        addEmptyElementResponse(index);
        updateInventory();
        return index;
    }

    public int addItem(ItemBuilder itemBuilder, ElementResponse elementResponse) {
        int index = gui.addItem(itemBuilder);
        addElementResponse(index, elementResponse);
        updateInventory();
        return index;
    }

    public void addItem(GUIExtenderItem guiExtenderItem) {
        jobs.add(new FinalItemJob(guiExtenderItem));
    }

    public void removeItem(int slot) {
        gui.removeItem(slot);
    }

    public void openInventory(Player player) {
        if (!jobs.isEmpty()) {
            for (FinalItemJob finalItemJob : jobs) {
                if (finalItemJob.getSlot() == -1) {
                    addExtenderItem(finalItemJob.getGuiExtenderItem(),
                                    player);
                }
                else setExtenderItem(finalItemJob.getSlot(),
                                    finalItemJob.getGuiExtenderItem(),
                                    player);
            }
            jobs.clear();
        }

        player.openInventory(getBukkitInventory());
    }

    public Inventory getBukkitInventory() {
        return gui.getInventory();
    }

    public void updateInventory() {
        getBukkitInventory().getViewers().forEach(viewer -> ((Player)viewer).updateInventory());
    }

    private void setExtenderItem(int slot, GUIExtenderItem guiExtenderItem, Player player) {
        gui.setItem(slot, guiExtenderItem.getItemBuilder(player));
        addElementResponse(slot, guiExtenderItem);
        updateInventory();
    }

    private void addExtenderItem(GUIExtenderItem guiExtenderItem, Player player) {
        int index = gui.addItem(guiExtenderItem.getItemBuilder(player));
        addElementResponse(index, guiExtenderItem);
        updateInventory();
    }

    private void checkElements(InventoryClickEvent event) {
        elements.values().stream()
                .filter(slot -> slot.getSlot() == event.getSlot())
                .filter(slot -> event.getClickedInventory().equals(getBukkitInventory()))
                .filter(slot -> event.getView().getTopInventory().equals(getBukkitInventory()))
                .forEach(slot -> {
                    event.setCancelled(!slot.isPullable());
                    if (slot.getElementResponse() != null)
                        slot.getElementResponse().onClick(event);
                    else if (slot.getGuiExtenderItem() != null)
                        slot.getGuiExtenderItem().onClick(event);
                });

    }


}
