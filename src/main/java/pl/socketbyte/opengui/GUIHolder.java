package pl.socketbyte.opengui;

import lombok.Getter;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

@Getter
public class GUIHolder implements InventoryHolder {

    private final Inventory inventory;
    private final GUI gui;

    public GUIHolder(GUI gui, Inventory inventory) {
        this.inventory = inventory;
        this.gui = gui;
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
