package me.DJdur.ColorOP.plugin;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
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
	FileConfiguration config = plugin.getConfig();
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			p.setDisplayName(config.getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + config.getString("Tag") + " " + p.getName());
			p.setPlayerListName(config.getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + p.getName());
			e.setJoinMessage(config.getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + config.getString("Tag") + " " + p.getName() + ChatColor.YELLOW + " joined the game.");
		}
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			e.setQuitMessage(config.getString("Color").replaceAll("&([0-9a-fk-or])", "\u00A7$1") + config.getString("Tag") + " " + p.getName() + ChatColor.YELLOW + " left the game.");
		}
	}
}
