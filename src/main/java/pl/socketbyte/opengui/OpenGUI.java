package pl.socketbyte.opengui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import pl.socketbyte.opengui.event.ElementResponse;
import pl.socketbyte.opengui.event.WindowResponse;

import java.util.HashMap;
import java.util.Map;

public class OpenGUI  {

    protected static Plugin instance;
    protected static Plugin getInstance() {
        return instance;
    }

    private static Map<Integer, GUIExtender> guiMap = new HashMap<>();

    public static Map<Integer, GUIExtender> getGUIs() {
        return guiMap;
    }

    public static GUIExtender getGUI(int id) {
        return guiMap.get(id);
    }

    public static void register(Plugin instance) {
        OpenGUI.instance = instance;
    }

}
