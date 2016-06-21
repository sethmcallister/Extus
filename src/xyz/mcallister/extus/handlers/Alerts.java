package xyz.mcallister.extus.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created by sethm on 20/06/2016.
 */
public class Alerts
{
    public static void newAlert(Player player, String cheat, int level)
    {
        Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " may be using " + cheat + ChatColor.YELLOW + "[" + level + "]");
        Bukkit.broadcast(ChatColor.GREEN + player.getName() + " may be using " + cheat + ChatColor.YELLOW + "[" + level + "]", "extus.alerts");
    }
}
