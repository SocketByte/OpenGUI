package pl.socketbyte.opengui;

import lombok.Getter;
import org.bukkit.inventory.ItemStack;
import pl.socketbyte.opengui.event.ElementResponse;

@Getter
public class GUIElement {

    private int slot;
    private ElementResponse elementResponse;
    private GUIExtenderItem guiExtenderItem;
    private boolean pullable;

    public GUIElement() {

    }

    public GUIElement(int slot) {
        this.slot = slot;
    }

    public GUIElement(int slot, boolean pullable) {
        this.slot = slot;
        this.pullable = pullable;
    }

    public void addElementResponse(int slot, ElementResponse elementResponse) {
        this.slot = slot;
        this.elementResponse = elementResponse;
        this.pullable = false;
    }

    public void addElementResponse(int slot, boolean pullable, ElementResponse elementResponse) {
        this.slot = slot;
        this.elementResponse = elementResponse;
        this.pullable = pullable;
    }

    public void addElementResponse(int slot, GUIExtenderItem guiExtenderItem) {
        this.slot = slot;
        this.pullable = guiExtenderItem.isPullable();
        this.guiExtenderItem = guiExtenderItem;
    }

    @Override
    public String toString() {
        return "[" + slot + "] " + elementResponse.hashCode();
    }
}
