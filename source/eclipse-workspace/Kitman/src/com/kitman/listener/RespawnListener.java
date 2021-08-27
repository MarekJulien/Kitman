package com.kitman.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {

	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent e) {

		Player p = e.getPlayer();
		p.sendMessage("Test 1234");

	}

}
