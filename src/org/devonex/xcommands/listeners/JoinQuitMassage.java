package org.devonex.xcommands.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.devonex.xcommands.Main;
import org.devonex.xcommands.utils.StringUtils;

public class JoinQuitMassage implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		if(Main.getInst().getConfig().getBoolean("enable-massage")){
			e.setJoinMessage(Main.getInst().getConfig().getString("join-massage"));
		}
	}
	
	public void onQuit(PlayerQuitEvent e){
		if(Main.getInst().getConfig().getBoolean("enable-massage")){
			e.setQuitMessage(Main.getInst().getConfig().getString("quit-massage"));
		}
	}
}
