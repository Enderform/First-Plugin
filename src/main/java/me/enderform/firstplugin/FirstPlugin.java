package me.enderform.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Hello Universe!");
    }

}
