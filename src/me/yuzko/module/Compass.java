package me.yuzko.module;

import java.util.WeakHashMap;

import me.yuzko.gitty.Base;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Compass {

	private Compass(String plugin)
	{
		super();
	}


	public static Compass get()
	{
		if(instance == null)
			instance = new Compass(Base.name);
		return instance;
	}

	public static void command(Player caller, String[] args) 
	{

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
				if(!(caller.getInventory().getItemInHand().getTypeId() == 347))
				{
					caller.sendMessage(ChatColor.DARK_RED + "[Compass]" + ChatColor.RED 
							+ ChatColor.RED + "You need to be holding a compass to use this command");
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
	public static Compass instance = null;
}
