package com.ShingWong08.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GamemodePluginVersionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("gamemodepluginversion")) {
            if (sender instanceof Player p) {
                if (p.hasPermission("Gamemode.Gma") || (p.hasPermission("Gamemode.Gmc") || (p.hasPermission("Gamemode.Gms") || (p.hasPermission("Gamemode.Gmsp"))))) {
                    sender.sendMessage(ChatColor.WHITE + "Gamemode Command Version: " + ChatColor.GREEN + "1.0.1 " + ChatColor.AQUA + "Beta");
                } else {
                    sender.sendMessage(ChatColor.RED + "You Don't Have Permission To Run This Command!");
                }
            } else if (sender instanceof ConsoleCommandSender Console) {
                Console.sendMessage(ChatColor.WHITE + "Gamemode Command Version: " + ChatColor.GREEN + "1.0.1 " + ChatColor.AQUA + "Beta");
            }
        }
        return true;
    }
}