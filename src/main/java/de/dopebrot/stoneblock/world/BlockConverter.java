package de.dopebrot.stoneblock.world;

import de.dopebrot.stoneblock.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class BlockConverter {

    private BukkitTask bukkitTask;
    private Main plugin;

    public BlockConverter(Main plugin) {
        this.plugin = plugin;
    }

    public void convert(Item item, Material toMaterial, int time) {
        start(item, toMaterial, time);
    }

    private int a = 0;

    private void start(Item item, Material toMaterial, int time) {
        bukkitTask = Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, new BukkitRunnable() {
            @Override
            public void run() {
                if (item != null) {
                    if (item.getTicksLived() > time) {
                        item.getLocation().getWorld().dropItem(item.getLocation(), new ItemStack(toMaterial, item.getItemStack().getAmount()));
                        item.remove();
                        item.setItemStack(new ItemStack(Material.AIR));
                        stop();
                    }
                } else {
                    stop();
                }
                a++;
            }
        }, 1, 1);


    }

    private void stop() {
        bukkitTask.cancel();
    }


}
