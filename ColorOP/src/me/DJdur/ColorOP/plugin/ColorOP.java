package me.DJdur.ColorOP.plugin;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorOP extends JavaPlugin implements Listener {
	
	Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		log.info("[ColorOP] Disabled!");
	}
	
	@Override
	public void onEnable() {
		log.info("[ColorOP] Enabled!");
		log.info("[ColorOP] Made by DJdur!");
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		player.setDisplayName(ChatColor.RED + "[OP] " + player.getName());
		player.setPlayerListName(ChatColor.RED + player.getName());
	}
}
