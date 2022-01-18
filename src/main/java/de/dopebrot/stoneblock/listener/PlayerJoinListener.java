package de.dopebrot.stoneblock.listener;

import de.dopebrot.stoneblock.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class PlayerJoinListener implements Listener {
    private Main plugin;

    public PlayerJoinListener(Main plugin) {
        this.plugin = plugin;
    }

    private BukkitTask taskID;

    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore()) {
            e.getPlayer().teleport(new Location(e.getPlayer().getLocation().getWorld(), 8, 124, 8));
            start(e.getPlayer());
        } else {
            e.getPlayer().sendTitle("§aWelcome Back!","§a" + e.getPlayer().getName());
            e.getPlayer().playSound(e.getPlayer().getLocation(),Sound.VILLAGER_YES,2f,1f);
        }
        if (e.getPlayer().getServer().getOnlinePlayers().size() > Main.playerToStart) {
            Main.enoughPlayersOnline = true;
        }
    }

    private int a = 0;

    private void start(Player p) {
        taskID = Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, new BukkitRunnable() {
            @Override
            public void run() {
                switch (a) {
                    case 0:
                        for (int i = 0; i < 100; i++) {
                            p.sendMessage("§c");
                        }
                        p.sendMessage("§aHello! and Welcome to StoneBlock,");
                        p.sendMessage("§aSince you are new use \"/StoneBlock Help\" for more info");
                        p.sendTitle("§c", "§aStoneBlock");
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1f, 1f);
                        break;
                    case 1:
                        p.getInventory().addItem(new ItemStack(Material.BREAD, 3));
                        p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1f, 1f);
                        break;
                    case 2:
                        p.getInventory().addItem(new ItemStack(Material.TORCH));
                        p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1f, 1f);
                        break;
                    case 3:
                        stop();
                        break;
                }
                a++;
            }
        }, 0, 25);
    }

    private void stop() {
        taskID.cancel();
    }


}