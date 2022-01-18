package de.dopebrot.stoneblock.listener;

import de.dopebrot.stoneblock.Main;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerStoneClick implements Listener {

    private Main plugin;

    public PlayerStoneClick(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onRClick(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (e.getClickedBlock().getType() == Material.STONE) {
                if (e.getPlayer().getItemInHand().getType() == Material.AIR) {
                    e.getPlayer().getWorld().dropItem(e.getPlayer().getLocation(), new ItemStack(Material.COBBLESTONE, 1));
                    e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ITEM_PICKUP, 0.1f, 1f);
                }
            }
        }
    }

}
