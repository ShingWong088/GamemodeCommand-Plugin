package com.ShingWong08.Commands;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class GmTapCompletion implements TabCompleter {
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            List<String> PlayerNames =new ArrayList<>();
            Player[] p = new Player[Bukkit.getOnlinePlayers().size()];
            Bukkit.getOnlinePlayers().toArray(p);
            for (int i = 0; i < p.length; i ++) {
                PlayerNames.add(p[i].getName());
            }
            return PlayerNames;
        }
        return null;
    }
}