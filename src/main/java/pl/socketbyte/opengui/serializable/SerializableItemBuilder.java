package pl.socketbyte.opengui.serializable;

import org.bukkit.Material;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.socketbyte.opengui.ColorUtil;
import pl.socketbyte.opengui.ItemBuilder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class SerializableItemBuilder extends ItemBuilder implements ConfigurationSerializable {

    public SerializableItemBuilder(ItemBuilder itemBuilder) {
        super(itemBuilder.getItem());
    }

    public SerializableItemBuilder(Map<String, Object> data) {
        Material material = Material.matchMaterial(data.get("material").toString());
        int amount = (int) data.get("amount");
        short durability = (short) data.get("durability");
        String name = ColorUtil.fixColor(data.get("name").toString());
        List<String> lore = ColorUtil.fixColor((List<String>) data.get("lore"));
        //Map<Enchantment, Integer> enchants = (Map<Enchantment, Integer>) data.get("enchants");

        setItem(material, amount, durability);
        //setEnchantments(enchants);
        setLore(lore);
        setName(name);

    }

    @Override
    public Map<String, Object> serialize() {
        ItemStack item = getItem();
        ItemMeta meta = getMeta();

        Map<String, Object> data = new LinkedHashMap<>();
        data.put("material", item.getType().toString());
        data.put("amount", item.getAmount());
        data.put("durability", item.getDurability());
        data.put("name", meta.getDisplayName() == null ? null
                : meta.getDisplayName().replace("§", "&"));
        data.put("lore", meta.getLore());
        //data.put("enchants", meta.getEnchants());
        return data;
    }
}
