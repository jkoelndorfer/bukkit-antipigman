package com.github.jkoelndorfer.bukkit;

// Copyright (C) 2012 John Koelndorfer
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

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
