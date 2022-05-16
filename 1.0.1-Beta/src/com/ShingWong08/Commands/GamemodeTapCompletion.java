package com.ShingWong08.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GamemodeTapCompletion implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> Args = new ArrayList<>();
            Args.add("survival");
            Args.add("creative");
            Args.add("adventure");
            Args.add("spectator");
            Args.add("version");
            return Args;
        } else if (args.length == 2) {
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
