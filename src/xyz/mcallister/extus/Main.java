package xyz.mcallister.extus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.mcallister.extus.packets.InventoryMove;

/**
 * Created by sethm on 20/06/2016.
 */
public class Main extends JavaPlugin
{
    Plugin plugin;
    private static Main instance;

    public void onEnable()
    {
        plugin = this;
        instance = this;
        regListeners();
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Your server is now protected by Extus.");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "View the project here: https://github.com/sethmcallister/Extus");
    }

    public static Main getInstance()
    {
        return instance;
    }

    private void regListeners()
    {
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryMove(), this);
    }
}
