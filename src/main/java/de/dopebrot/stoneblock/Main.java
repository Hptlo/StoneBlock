package de.dopebrot.stoneblock;

import de.dopebrot.stoneblock.commands.HelpCommand;
import de.dopebrot.stoneblock.listener.PlayerDropPickUpListener;
import de.dopebrot.stoneblock.listener.PlayerJoinListener;
import de.dopebrot.stoneblock.listener.PlayerLeaveListener;
import de.dopebrot.stoneblock.listener.PlayerStoneClick;
import org.bukkit.Bukkit;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class Main extends JavaPlugin {

    public static final int playerToStart = 1;
    public static boolean enoughPlayersOnline = false;

    private BukkitTask bukkitTask;


    @Override
    public void onEnable() {
        getCommand("help").setExecutor(new HelpCommand(this));
//        getCommand("skill").setExecutor(new SkillTreeCommand(this));/
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerLeaveListener(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerStoneClick(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerDropPickUpListener(this), this);
        if (Bukkit.getWorld("world") != null) {
            Bukkit.getWorld("world").setSpawnLocation(24, 124, 24);
        }

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new WorldGeneration();
    }


    private void start() {
        bukkitTask = Bukkit.getScheduler().runTaskTimerAsynchronously(this, new BukkitRunnable() {
            @Override
            public void run() {
                if (enoughPlayersOnline) {




                }
            }
        }, 0, 5);
    }
}
