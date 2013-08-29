package me.yuzko.gitty;

import me.yuzko.module.Compass;
import me.yuzko.module.DonatorChat;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class Commands {
	
	public Commands()
	{
	}

	public static boolean method(Player caller, Command cmd, String arg, String args[])
	{
		if(arg.equalsIgnoreCase("search") || arg.equals("find"))
		{
			Compass.command(caller, args);
		}
		else
		{
			if(arg.equalsIgnoreCase("dc") || arg.equalsIgnoreCase("dm"))
			{
				DonatorChat.command(caller, args);
			}
		}
		return false;
	}

}
