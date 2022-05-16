package com.ShingWong08;

import com.ShingWong08.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Gamemode Plugin Enabled!");
        getCommand("gmc").setExecutor(new GmcCommand());
        getCommand("gmc").setTabCompleter(new GmTapCompletion());
        getCommand("gms").setExecutor(new GmsCommand());
        getCommand("gms").setTabCompleter(new GmTapCompletion());
        getCommand("gma").setExecutor(new GmaCommand());
        getCommand("gma").setTabCompleter(new GmTapCompletion());
        getCommand("gmsp").setExecutor(new GmspCommand());
        getCommand("gmsp").setTabCompleter(new GmTapCompletion());
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("gamemode").setTabCompleter(new GamemodeTapCompletion());
        getCommand("gamemodepluginversion").setExecutor(new GamemodePluginVersionCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("Gamemode Plugin Disabled!");
    }
}