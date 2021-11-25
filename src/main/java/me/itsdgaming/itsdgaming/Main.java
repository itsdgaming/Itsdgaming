package me.itsdgaming.itsdgaming;

import me.itsdgaming.itsdgaming.commands.TestCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginCommand("test").setExecutor(new TestCommands(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
