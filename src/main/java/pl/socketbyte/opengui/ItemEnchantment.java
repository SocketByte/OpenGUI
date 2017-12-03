package pl.socketbyte.opengui;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.enchantments.Enchantment;

@Getter
@Setter
public class ItemEnchantment {

    private Enchantment enchantment;
    private int level;
    private boolean unsafe;

    public ItemEnchantment(Enchantment enchantment, int level, boolean unsafe) {
        this.enchantment = enchantment;
        this.level = level;
        this.unsafe = unsafe;
    }

    public ItemEnchantment(Enchantment enchantment, int level) {
        this.enchantment = enchantment;
        this.level = level;
        this.unsafe = true;
    }

}
