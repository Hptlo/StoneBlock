package de.dopebrot.stoneblock.commands;

import de.dopebrot.stoneblock.Main;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {

    private Main plugin;

    public HelpCommand(Main plugin) {
        this.plugin = plugin;
        System.out.println("Help Command Loaded!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player p = ((Player) sender).getPlayer();
            switch (args.length) {
                case 1:
                    switch (args[0].toLowerCase()) {
                        case "1":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage1(p);
                            break;
                        case "2":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage2(p);
                            break;
                        case "3":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage3(p);
                            break;
                        case "4":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage4(p);
                            break;
                        case "5":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage5(p);
                            break;
                        case "6":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage6(p);
                            break;
                        case "7":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage7(p);
                            break;
                        case "8":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage8(p);
                            break;
                        case "9":
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1f, 1f);
                            helpPage9(p);
                            break;
                    }
                    break;
                default:
                    helpPage1(p);
                    break;
            }
        }
        return false;
    }


    private void helpPage1(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §61§8/§815 §8==");
        p.sendMessage("§6StoneBlock §acovered from top to bottom with stone");
        p.sendMessage("§aand the bottom and top are out of bedrock");
        p.sendMessage("§ato get stone you need to §6right click§a with an §6empty hand§a on a stone block");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage2(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §62§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage3(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §63§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage4(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §64§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage5(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §65§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage6(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §66§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage7(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §67§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage8(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §68§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }

    private void helpPage9(Player p) {
        p.sendMessage("§8======= §6StoneBlock §2Help §69§8/§815 §8==");
        p.sendMessage("§8======= §6StoneBlock §2Help §8=======");
    }


}
