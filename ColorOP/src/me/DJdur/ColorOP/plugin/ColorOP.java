package me.DJdur.ColorOP.plugin;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorOP extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public ColorOPListener Listener = new ColorOPListener(this);
	
	FileConfiguration config; 
	
	@Override
	public void onDisable() {
		log.info("[ColorOP] Disabled!");
	}
	
	@Override
	public void onEnable() {
		config = getConfig();
		log.info("[ColorOP] Enabled!");
		log.info("[ColorOP] Made by DJdur!");
		getServer().getPluginManager().registerEvents(Listener, this);
		config.options().header("Welcome to ColorOP config. \nColor is the color for tag and your name, Tag is for the awesome tag before your name!");
		config.options().copyDefaults(true);
		config.addDefault("Color", "&c");
		config.addDefault("Tag", "[OP]");
		saveConfig();
	}
}
