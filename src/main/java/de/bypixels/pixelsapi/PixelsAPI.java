package de.bypixels.pixelsapi;

import de.bypixels.pixelsapi.util.FileManagement;
import de.bypixels.pixelsapi.util.FileManager;
import de.bypixels.pixelsapi.util.LocationManager;
import de.bypixels.pixelsapi.util.Utility;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PixelsAPI  {


    public PixelsAPI(JavaPlugin plugin) {
        this.plugin = plugin;
        start(Bukkit.getPluginManager());
    }

    
    private static JavaPlugin plugin;

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    Utility Utility = new Utility(plugin);

    private static void start(PluginManager pluginManager) {

    }
}
