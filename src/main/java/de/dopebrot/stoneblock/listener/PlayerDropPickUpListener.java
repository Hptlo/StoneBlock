package de.dopebrot.stoneblock.listener;

import de.dopebrot.stoneblock.Main;
import de.dopebrot.stoneblock.world.BlockConverter;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDropPickUpListener implements Listener {


    private final Main plugin;
    private final BlockConverter blockConverter;

    public PlayerDropPickUpListener(Main plugin) {
        this.plugin = plugin;
        blockConverter = new BlockConverter(plugin);
    }

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent e) {
        e.getPlayer().sendMessage("" + e.getItemDrop().getTicksLived());
        Item item = e.getItemDrop();
        if (item.getItemStack().getType().equals(Material.COBBLESTONE)) {
            blockConverter.convert(item, Material.DIRT, 150);
        }

    }


}
