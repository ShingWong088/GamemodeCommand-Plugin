package com.ShingWong08.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GmsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                if (p.hasPermission("Gamemode.Gms")) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
                } else {
                    sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (p.hasPermission("Gamemode.GmsOtherPlayer")) {
                    if (target != null) {
                        target.setGameMode(GameMode.SURVIVAL);
                        target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + sender.getName() + ChatColor.WHITE + ".");
                        sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
                    } else {
                        sender.sendMessage(ChatColor.RED + "That Player Is Not Online!");
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else {
                if (p.hasPermission("Gamemode.GmsOtherPlayer")) {
                    sender.sendMessage(ChatColor.RED + "Please Provide Only 1 Player!");
                }
            }
        } else if (sender instanceof ConsoleCommandSender) {
            ConsoleCommandSender Console = Bukkit.getConsoleSender();
            if (args.length == 0) {
                Console.sendMessage(ChatColor.WHITE + "Please Provide A Player.");
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    target.setGameMode(GameMode.SURVIVAL);
                    target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + Console.getName() + ChatColor.WHITE + ".");
                    Console.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Survival Mode" + ChatColor.WHITE + ".");
                } else {
                    sender.sendMessage(ChatColor.RED + "That Player Is Not Online!");
                }
            } else {
                Console.sendMessage(ChatColor.RED + "Please Provide Only 1 Player!");
            }
        }
        return true;
    }
}