package me.DJdur.ColorOP.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ColorOPListener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			p.setDisplayName(ChatColor.RED + "[OP] " + p.getName());
			p.setPlayerListName(ChatColor.RED + p.getName());
			e.setJoinMessage(ChatColor.RED + "[OP] " + p.getName() + ChatColor.YELLOW + " joined the game.");
		}
	} 
}
