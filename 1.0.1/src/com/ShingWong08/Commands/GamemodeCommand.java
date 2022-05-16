package com.ShingWong08.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player p) {
			if (args.length == 0) {
				if (p.hasPermission("Gamemode.Gma") || (p.hasPermission("Gamemode.Gmc") || (p.hasPermission("Gamemode.Gms") || (p.hasPermission("Gamemode.Gmsp")) || (p.hasPermission("Gamemode.GmaOtherPlayer") || (p.hasPermission("Gamemode.GmcOtherPlayer") || (p.hasPermission("Gamemode.GmsOtherPlayer") || (p.hasPermission("Gamemode.GmspOtherPlayer")))))))) {
					p.sendMessage(ChatColor.WHITE + "Please Provide A Gamemode!");
				} else {
					sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
				}
			} else if (args.length == 1) {
				if (args[0].equalsIgnoreCase("0") || (args[0].equalsIgnoreCase("s") || (args[0].equalsIgnoreCase("survival")))) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
				} else if (args[0].equalsIgnoreCase("1") || (args[0].equalsIgnoreCase("c") || (args[0].equalsIgnoreCase("creative")))) {
					if (p.hasPermission("Gamemode.Gmc")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Creative Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else if (args[0].equalsIgnoreCase("2") || (args[0].equalsIgnoreCase("a") || (args[0].equalsIgnoreCase("adventure")))) {
					if (p.hasPermission("Gamemode.Gma")) {
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else if (args[0].equalsIgnoreCase("3") || (args[0].equalsIgnoreCase("sp") || (args[0].equalsIgnoreCase("spectator")))) {
					if (p.hasPermission("Gamemode.Gmsp")) {
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Spectator Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else if (args[0].equalsIgnoreCase("version") || (args[0].equalsIgnoreCase("ver"))) {
					if (p.hasPermission("Gamemode.Gma") || (p.hasPermission("Gamemode.Gmc") || (p.hasPermission("Gamemode.Gms") || (p.hasPermission("Gamemode.Gmsp"))))) {
						sender.sendMessage(ChatColor.WHITE + "Gamemode Command Version: " + ChatColor.GREEN + "1.0.1 " + ChatColor.AQUA + "Beta");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else {
					if (p.hasPermission("Gamemode.Gma") || (p.hasPermission("Gamemode.Gmc") || (p.hasPermission("Gamemode.Gms") || (p.hasPermission("Gamemode.Gmsp"))))) {
						sender.sendMessage(ChatColor.WHITE + "Please Provide A Correct Gamemode!");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				}
			} else if (args.length == 2) {
				Player target = Bukkit.getPlayer(args[1]);
				if (target != null) {
					if (args[0].equalsIgnoreCase("0") || (args[0].equalsIgnoreCase("s") || (args[0].equalsIgnoreCase("survival")))) {
						if (p.hasPermission("Gamemode.GmsOtherPlayer")) {
							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else if (args[0].equalsIgnoreCase("1") || (args[0].equalsIgnoreCase("c") || (args[0].equalsIgnoreCase("creative")))) {
						if (p.hasPermission("Gamemode.GmcOtherPlayer")) {
							target.setGameMode(GameMode.CREATIVE);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Creative Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Creative Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else if (args[0].equalsIgnoreCase("2") || (args[0].equalsIgnoreCase("a") || (args[0].equalsIgnoreCase("adventure")))) {
						if (p.hasPermission("Gamemode.GmaOtherPlayer")) {
							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else if (args[0].equalsIgnoreCase("3") || (args[0].equalsIgnoreCase("sp") || (args[0].equalsIgnoreCase("spectator")))) {
						if (p.hasPermission("Gamemode.GmspOtherPlayer")) {
							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Spectator Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Spectator Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else {
						if (p.hasPermission("Gamemode.GmaOtherPlayer") || (p.hasPermission("Gamemode.GmcOtherPlayer") || (p.hasPermission("Gamemode.GmsOtherPlayer") || (p.hasPermission("Gamemode.GmspOtherPlayer"))))) {
							sender.sendMessage(ChatColor.WHITE + "Please Provide A Correct Gamemode!");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					}
				} else {
					if (p.hasPermission("Gamemode.GmaOtherPlayer") || (p.hasPermission("Gamemode.GmcOtherPlayer") || (p.hasPermission("Gamemode.GmsOtherPlayer") || (p.hasPermission("Gamemode.GmspOtherPlayer"))))) {
						sender.sendMessage(ChatColor.RED + "That Player Is Not Online!");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				}
			} else {
				sender.sendMessage(ChatColor.RED + "Please Provide Only 1 Player!");
			}
		} else if (sender instanceof ConsoleCommandSender) {
			ConsoleCommandSender Console = Bukkit.getConsoleSender();
			if (args.length == 0) {
				Console.sendMessage(ChatColor.WHITE + "Please Provide A Player.");
			} else if (args.length == 1) {
				if (args[0].equalsIgnoreCase("version") || (args[0].equalsIgnoreCase("ver"))) {
					Console.sendMessage(ChatColor.WHITE + "Gamemode Command Version: " + ChatColor.GREEN + "1.0.1 " + ChatColor.AQUA + "Beta");
				} else {
					Console.sendMessage(ChatColor.WHITE + "Please Provide A Player.");
				}
			} else if (args.length == 2) {
				Player target = Bukkit.getPlayer(args[1]);
				if (target != null) {
					if (args[0].equalsIgnoreCase("0") || (args[0].equalsIgnoreCase("s") || (args[0].equalsIgnoreCase("survival")))) {
						target.setGameMode(GameMode.SURVIVAL);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + Console.getName());
						Console.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
					} else if (args[0].equalsIgnoreCase("1") || (args[0].equalsIgnoreCase("c") || (args[0].equalsIgnoreCase("creative")))) {
						target.setGameMode(GameMode.CREATIVE);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Creative Mode " + ChatColor.WHITE + "By " + Console.getName());
						Console.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Creative Mode" + ChatColor.WHITE + ".");
					} else if (args[0].equalsIgnoreCase("2") || (args[0].equalsIgnoreCase("a") || (args[0].equalsIgnoreCase("adventure")))) {
						target.setGameMode(GameMode.ADVENTURE);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode " + ChatColor.WHITE + "By " + Console.getName());
						Console.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
					} else if (args[0].equalsIgnoreCase("3") || (args[0].equalsIgnoreCase("sp") || (args[0].equalsIgnoreCase("spectator")))) {
						target.setGameMode(GameMode.SPECTATOR);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Spectator Mode " + ChatColor.WHITE + "By " + Console.getName());
						Console.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Spectator Mode" + ChatColor.WHITE + ".");
					} else {
						Console.sendMessage(ChatColor.WHITE + "Please Choose A Gamemode For That Player." + ChatColor.GREEN + "/Gm 0, 1, 2, 3 Or /Gm S, C, A, SP");
					}
				} else {
					Console.sendMessage(ChatColor.RED + "That Player Is Not Online!");
				}
			} else {
				Console.sendMessage(ChatColor.RED + "Please Provide Only 1 Player!");
			}
		}
		return true;
	}
}
