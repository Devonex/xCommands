package org.devonex.xcommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§6xCommands §3| §aStarting...");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§6xCommands §3| §aStop");
	}
}
