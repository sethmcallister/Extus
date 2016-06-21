package xyz.mcallister.extus.packets;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.PlayerInventory;
import xyz.mcallister.extus.handlers.Alerts;

/**
 * Created by sethm on 20/06/2016.
 */
public class InventoryMove implements Listener
{
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event)
    {
        if(event.getPlayer().getOpenInventory() != event.getPlayer().getInventory())
        {
            Alerts.newAlert(event.getPlayer(), "No Inventory Move", 1);
        }
    }
}
