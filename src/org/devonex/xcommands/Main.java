package org.devonex.xcommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.devonex.xcommands.listeners.JoinQuitMassage;

public class Main extends JavaPlugin {
	
	private static Main instance;

	@Override
	public void onEnable() {
		instance = this;
		this.registerListener();
		Bukkit.getServer().getConsoleSender().sendMessage("§6xCommands §3| §aStarting...");
		saveDefaultConfig();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§6xCommands §3| §aStop");
	}
	
	public static Main getInst(){
		return instance;
	}
	
	private void registerListener(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new JoinQuitMassage(), this);
	}
}