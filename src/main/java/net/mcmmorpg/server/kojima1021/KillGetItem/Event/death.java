package net.mcmmorpg.server.kojima1021.KillGetItem.Event;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;


public class death implements Listener {

	@EventHandler
    public void DeathEvent(PlayerDeathEvent e) {
	String prefix = ChatColor.YELLOW + "["+  ChatColor.DARK_RED + "ForceServer" + ChatColor.YELLOW + "]" + ChatColor.RESET;
	ItemStack[] item = e.getEntity().getInventory().getContents();
	for (ItemStack itemstack : item) {
		 if (itemstack != null){
			 if (e.getEntity().getKiller() != null){
			     e.getEntity().getInventory().clear();
		         Location pos =e.getEntity().getKiller().getLocation();
		         e.getEntity().getKiller().getWorld().dropItem(pos,new ItemStack(itemstack));
		
		}
		 }
	}
}
}