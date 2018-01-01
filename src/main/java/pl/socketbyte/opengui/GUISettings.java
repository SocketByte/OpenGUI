package pl.socketbyte.opengui;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import pl.socketbyte.opengui.event.NotEnterableItemResponse;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GUISettings {

    private boolean canEnterItems;
    private boolean canDrag;
    private final List<ItemStack> enterableItems = new ArrayList<>();
    private NotEnterableItemResponse notEnterableItemResponse;

    public void addEnterableItem(Material material) {
        this.enterableItems.add(new ItemStack(material));
    }

    public void addEnterableItem(Material material, short data) {
        this.enterableItems.add(new ItemStack(material, 1, data));
    }

    public void addEnterableItem(Material material, int data) {
        this.enterableItems.add(new ItemStack(material, 1, (short) data));
    }
}
