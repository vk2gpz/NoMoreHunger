package com.vk2gpz.nomorehunger;
public class NoMoreHunger extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
	public void onHunger(org.bukkit.event.entity.FoodLevelChangeEvent e) {
		if (e.getEntity().hasPermission("nomorehunger")) {
			e.setFoodLevel(20);  // set it full, in case...
			e.setCancelled(true);
		}
	}
}