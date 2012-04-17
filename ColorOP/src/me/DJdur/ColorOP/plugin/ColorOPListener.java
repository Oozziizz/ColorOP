package me.DJdur.ColorOP.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class ColorOPListener implements Listener {
	
	Plugin plugin;
	
	public ColorOPListener(ColorOP main) {
		plugin = main;
	}
	
	@EventHandler(priority = EventPriority.HIGHEST) // kk
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			p.setDisplayName(plugin.getConfig().getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + plugin.getConfig().getString("Tag") + " " + p.getName());
			p.setPlayerListName(plugin.getConfig().getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + p.getName());
			e.setJoinMessage(plugin.getConfig().getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + plugin.getConfig().getString("Tag") + " " + p.getName() + ChatColor.YELLOW + " joined the game.");
		}
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			e.setQuitMessage(ChatColor.RED + "[OP] " + p.getName() + ChatColor.YELLOW + " left the game.");
		}
	}
}
