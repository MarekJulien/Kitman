package com.kitman.program;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.kitman.listener.RespawnListener;

public class Main extends JavaPlugin {

	public void onCreate() {

		// Register listeners
		PluginManager pluginMan = Bukkit.getPluginManager();
		pluginMan.registerEvents(new RespawnListener(), this);

	}

}
