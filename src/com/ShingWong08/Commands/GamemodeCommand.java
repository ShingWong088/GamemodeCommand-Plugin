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
				if (p.hasPermission("Gamemode.Gamemode")) {
					p.sendMessage(ChatColor.WHITE + "Please Choose A Gamemode." + ChatColor.GREEN + "/Gm 0, 1, 2, 3 Or /Gm S, C, A, SP");
				} else {
					sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
				}
			} else if (args.length == 1) {
				if (args[0].equalsIgnoreCase("0") || (args[0].equalsIgnoreCase("s"))) {
					if (p.hasPermission("Gamemode.Gms")) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else if (args[0].equalsIgnoreCase("1") || (args[0].equalsIgnoreCase("c"))) {
					if (p.hasPermission("Gamemode.Gmc")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Creative Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else if (args[0].equalsIgnoreCase("2") || (args[0].equalsIgnoreCase("a"))) {
					if (p.hasPermission("Gamemode.Gma")) {
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else if (args[0].equalsIgnoreCase("3") || (args[0].equalsIgnoreCase("sp"))) {
					if (p.hasPermission("Gamemode.Gmsp")) {
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Spectator Mode" + ChatColor.WHITE + ".");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				} else {
					if (p.hasPermission("Gamemode.Gamemode")) {
						p.sendMessage(ChatColor.WHITE + "Please Choose A Gamemode." + ChatColor.GREEN + "/Gm 0, 1, 2, 3 Or /Gm S, C, A, SP");
					} else {
						sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
					}
				}
			} else if (args.length == 2) {
				Player target = Bukkit.getPlayer(args[1]);
				if (target != null) {
					if (args[0].equalsIgnoreCase("0") || (args[0].equalsIgnoreCase("s"))) {
						if (p.hasPermission("Gamemode.Gms")) {
							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else if (args[0].equalsIgnoreCase("1") || (args[0].equalsIgnoreCase("c"))) {
						if (p.hasPermission("Gamemode.Gmc")) {
							target.setGameMode(GameMode.CREATIVE);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Creative Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Creative Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else if (args[0].equalsIgnoreCase("2") || (args[0].equalsIgnoreCase("a"))) {
						if (p.hasPermission("Gamemode.Gma")) {
							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else if (args[0].equalsIgnoreCase("3") || (args[0].equalsIgnoreCase("sp"))) {
						if (p.hasPermission("Gamemode.Gmsp")) {
							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Spectator Mode " + ChatColor.WHITE + "By " + sender.getName());
							sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Spectator Mode" + ChatColor.WHITE + ".");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					} else {
						if (p.hasPermission("Gamemode.Gamemode")) {
							p.sendMessage(ChatColor.WHITE + "Please Choose A Gamemode For That Player." + ChatColor.GREEN + "/Gm 0, 1, 2, 3 Or /Gm S, C, A, SP");
						} else {
							sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
						}
					}
				} else {
					sender.sendMessage(ChatColor.RED + "That Player Is Not Online!");
				}
			}
		} else if (sender instanceof ConsoleCommandSender) {
			ConsoleCommandSender consle = Bukkit.getConsoleSender();
			if (args.length == 0) {
				consle.sendMessage(ChatColor.WHITE + "Please Provide A Player.");
			} else if (args.length == 1) {
				consle.sendMessage(ChatColor.WHITE + "Please Provide A Player.");
			} else if (args.length == 2) {
				Player target = Bukkit.getPlayer(args[1]);
				if (target != null) {
					if (args[0].equalsIgnoreCase("0") || (args[0].equalsIgnoreCase("s"))) {
						target.setGameMode(GameMode.SURVIVAL);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + consle.getName());
						consle.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
					} else if (args[0].equalsIgnoreCase("1") || (args[0].equalsIgnoreCase("c"))) {
						target.setGameMode(GameMode.CREATIVE);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Creative Mode " + ChatColor.WHITE + "By " + consle.getName());
						consle.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Creative Mode" + ChatColor.WHITE + ".");
					} else if (args[0].equalsIgnoreCase("2") || (args[0].equalsIgnoreCase("a"))) {
						target.setGameMode(GameMode.ADVENTURE);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode " + ChatColor.WHITE + "By " + consle.getName());
						consle.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
					} else if (args[0].equalsIgnoreCase("3") || (args[0].equalsIgnoreCase("sp"))) {
						target.setGameMode(GameMode.SPECTATOR);
						target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Spectator Mode " + ChatColor.WHITE + "By " + consle.getName());
						consle.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Spectator Mode" + ChatColor.WHITE + ".");
					} else {
						consle.sendMessage(ChatColor.WHITE + "Please Choose A Gamemode For That Player." + ChatColor.GREEN + "/Gm 0, 1, 2, 3 Or /Gm S, C, A, SP");
					}
				} else {
					consle.sendMessage(ChatColor.RED + "That Player Is Not Online!");
				}
			}
		}
		return true;
	}
}