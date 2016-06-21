package xyz.mcallister.extus.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created by sethm on 20/06/2016.
 */
public class Ban
{
    public void Ban(Player player, String hack)
    {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/ban " + player.getName() + " " + hack);
        Bukkit.broadcastMessage(ChatColor.YELLOW + player.getName() + ChatColor.GREEN + " has been removed from the server by Extus.");
    }
}
