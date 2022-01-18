package de.dopebrot.stoneblock.listener;

import de.dopebrot.stoneblock.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeaveListener implements Listener {

    private Main plugin;
    public PlayerLeaveListener(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {

        if (e.getPlayer().getServer().getOnlinePlayers().size() < Main.playerToStart) {
            Main.enoughPlayersOnline = false;
        }

    }


}
