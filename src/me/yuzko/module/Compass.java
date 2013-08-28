package me.yuzko.module;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Compass {

	public Compass
	{
	}

	public static void command(Player caller, String[] args) {
		if(args.length < 1)
		{
			caller.sendMessage(ChatColor.DARK_RED + "[Compass] " + ChatColor.RED 
					+ "Invalid command");
		}
		else
		{
			if(Bukkit.getPlayer(args[0]) == null)
			{
				caller.sendMessage(ChatColor.DARK_RED + "[Compass]" + ChatColor.RED + 
						" Target is not online");
			}
			else
			{

				int x = Bukkit.getPlayer(args[0]).getLocation().getBlockX();
				int y = Bukkit.getPlayer(args[0]).getLocation().getBlockY();
				int z = Bukkit.getPlayer(args[0]).getLocation().getBlockZ();
				caller.sendMessage(ChatColor.DARK_RED + "[Compass] " + ChatColor.LIGHT_PURPLE
						+ args[0] + ChatColor.GREEN + " is located at; " + ChatColor.DARK_GREEN + x 
						+ ChatColor.GREEN + ", " + ChatColor.DARK_GREEN + y + ChatColor.GREEN + 
						", " + ChatColor.DARK_GREEN + z);
			}
		}
	}

}
