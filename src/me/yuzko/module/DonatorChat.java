package me.yuzko.module;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.yuzko.gitty.Base;

public class DonatorChat 
{

	private DonatorChat(String plugin)
	{
		super();
	}

	public static DonatorChat get()
	{
		if(instance == null)
			instance = new DonatorChat(Base.name);
		return instance;
	}

	public static void command(Player caller, String[] args)
	{
		
		String msg = args[0];
		
		if(args.length < 1)
		{
			caller.sendMessage(ChatColor.DARK_RED + "[DChat] " + ChatColor.RED 
					+ "Invalid command");
		}
		else
		{
			if(!(caller.hasPermission("donator.chat")))
			{
				caller.sendMessage(ChatColor.DARK_RED + "DChat " + ChatColor.RED 
						+ "You need to be a donator to use this command");
			}
			else
			{
				Player[] players = Bukkit.getOnlinePlayers();
				for(Player p : players)
				{
					if(!(p.hasPermission("donator.chat")))
					{
						//DO NOTHING
					}
					else
					{
						p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GRAY + "DChat"
								+ ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + msg);
					}
				}
			}
		}
	}

	public static DonatorChat instance = null;

}
