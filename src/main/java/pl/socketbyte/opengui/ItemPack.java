package pl.socketbyte.opengui;

import lombok.Getter;
import lombok.Setter;
import pl.socketbyte.opengui.event.ElementResponse;

@Getter
@Setter
public class ItemPack {

    private int slot;
    private ItemBuilder itemBuilder;
    private ElementResponse elementResponse;

    public ItemPack(int slot, ItemBuilder itemBuilder) {
        this.itemBuilder = itemBuilder;
        this.slot = slot;
    }

    public ItemPack(int slot, ItemBuilder itemBuilder, ElementResponse elementResponse) {
        this.itemBuilder = itemBuilder;
        this.slot = slot;
        this.elementResponse = elementResponse;
    }

    public ItemPack(ItemBuilder itemBuilder) {
        this.itemBuilder = itemBuilder;
    }

    public ItemPack(ItemBuilder itemBuilder, ElementResponse elementResponse) {
        this.itemBuilder = itemBuilder;
        this.elementResponse = elementResponse;
    }

}
