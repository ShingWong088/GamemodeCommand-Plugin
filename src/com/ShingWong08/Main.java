package com.ShingWong08;

import com.ShingWong08.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Gamemode Plugin Enabled!");
        getCommand("gmc").setExecutor(new GmcCommand());
        getCommand("gms").setExecutor(new GmsCommand());
        getCommand("gma").setExecutor(new GmaCommand());
        getCommand("gmsp").setExecutor(new GmspCommand());
        getCommand("gamemode").setExecutor(new GamemodeCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("Gamemode Plugin Disabled!");
    }
}