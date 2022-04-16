package com.ShingWong08.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GmaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (p.hasPermission("Gamemode.Gma")) {
                if (args.length == 0) {
                    p.setGameMode(GameMode.ADVENTURE);
                    p.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
                } else {
                    Player target = Bukkit.getPlayer(args[0]);
                    if (target != null) {
                        target.setGameMode(GameMode.ADVENTURE);
                        target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Adventure Mode " + ChatColor.WHITE + "By " + sender.getName() + ChatColor.WHITE + ".");
                        sender.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
                    } else {
                        sender.sendMessage(ChatColor.RED + "That Player Is Not Online!");
                    }
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
            }
        } else if (sender instanceof ConsoleCommandSender) {
            ConsoleCommandSender console = Bukkit.getConsoleSender();
            if (args.length == 0) {
                console.sendMessage(ChatColor.WHITE + "'Please Provide A Player.");
            } else {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    target.setGameMode(GameMode.ADVENTURE);
                    target.sendMessage(ChatColor.WHITE + "Your Gamemode Have Been Updated To " + ChatColor.GREEN + "Survival Mode " + ChatColor.WHITE + "By " + console.getName() + ChatColor.WHITE + ".");
                    console.sendMessage(ChatColor.WHITE + "Set " + target.getName() + ChatColor.WHITE + " To " + ChatColor.GREEN + "Adventure Mode" + ChatColor.WHITE + ".");
                } else {
                    sender.sendMessage(ChatColor.RED + "That Player Is Not Online!");
                }
            }
        }
        return true;
    }
}