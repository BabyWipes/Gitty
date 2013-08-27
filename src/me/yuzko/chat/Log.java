package me.yuzko.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class Log implements Listener 
{
	public void onJoin(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();
		String name = p.getName();

		if(!(p.hasPlayedBefore()))
		{
			p.sendMessage(ChatColor.DARK_GRAY + "[Join] " + ChatColor.GRAY + 
					"Welcome back!");
		}
		else
			Bukkit.broadcastMessage(ChatColor.BLUE + "[Welcome] " + ChatColor.LIGHT_PURPLE
					+ name + ChatColor.AQUA + " joined the server for the first time!");
		p.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
		p.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
		p.getInventory().addItem(new ItemStack(Material.STONE_PICKAXE, 1));
		p.getInventory().addItem(new ItemStack(Material.COOKED_CHICKEN, 5));
	}

}
