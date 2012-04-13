package me.DJdur.ColorOP.plugin;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorOP extends JavaPlugin implements Listener {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public ColorOPListener Listener = new ColorOPListener();
	
	@Override
	public void onDisable() {
		log.info("[ColorOP] Disabled!");
	}
	
	@Override
	public void onEnable() {
		log.info("[ColorOP] Enabled!");
		log.info("[ColorOP] Made by DJdur!");
		getServer().getPluginManager().registerEvents(Listener, this); 
	}
}
