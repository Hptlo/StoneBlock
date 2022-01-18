package de.dopebrot.stoneblock.commands;

import de.dopebrot.stoneblock.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SkillTreeCommand implements CommandExecutor {

    private Main plugin;
    public SkillTreeCommand(Main plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {



        return false;
    }
}
