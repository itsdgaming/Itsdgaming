package me.itsdgaming.itsdgaming.commands;

import me.itsdgaming.itsdgaming.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TestCommands implements CommandExecutor {
    private final Main main;

    public TestCommands(Main main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof  Player) {
            Player player = (Player) sender;

            if (player.hasPermission("test"))
                player.sendMessage(ChatColor.GREEN + "Test");
                return true;


        }else {
            main.getLogger().info("je hebt geen permision om deze command uit te voeren vraag het aan een staff");

            return true;

        }
    }
}
