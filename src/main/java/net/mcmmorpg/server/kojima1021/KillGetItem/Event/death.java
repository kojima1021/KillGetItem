package net.mcmmorpg.server.kojima1021.KillGetItem.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class death implements Listener {

	@EventHandler
    public void DeathEvent(PlayerDeathEvent e) {
	ItemStack[] item = e.getEntity().getInventory().getContents();
	for (ItemStack itemstack : item) {
		 if (itemstack != null)
			 if (e.getEntity().getKiller() != null)
		  e.getEntity().getKiller().getInventory().addItem(itemstack);
		  e.getEntity().getInventory().clear();
		}

    }

}