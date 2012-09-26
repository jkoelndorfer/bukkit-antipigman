package com.github.jkoelndorfer.bukkit;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class AntiPigman extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
	}

	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e) {
		EntityType creatureType = e.getEntityType();
		if (!(creatureType.getTypeId() == EntityType.PIG_ZOMBIE.getTypeId())) return;
		Block b = e.getLocation().getBlock();
		if (b.getTypeId() == Material.NETHERRACK.getId() ||
		    b.getTypeId() == Material.SOUL_SAND.getId()) {
			return;
		}
		if (b.getLightLevel() > 7) { e.setCancelled(true); }
	}
}
