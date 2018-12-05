package com.vk2gpz.nomorehunger;
import org.bukkit.event.*;
public class NoMoreHunger extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler(priority = EventPriority.MONITOR)
	public void onHunger(org.bukkit.event.entity.FoodLevelChangeEvent e) {
		if (e.getEntity().hasPermission("nomorehunger")) {
			e.setFoodLevel(20);  // set it full, in case...
			e.setCancelled(true);
		}
	}
}