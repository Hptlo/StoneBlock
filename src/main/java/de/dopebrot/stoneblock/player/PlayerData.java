package de.dopebrot.stoneblock.player;

import de.dopebrot.dpu.config.ConfigHelper;

import java.io.IOException;
import java.util.UUID;

public class PlayerData {

    private final String file;
    private final ConfigHelper configHelper;
    private UUID playerID;

    private final String valuePath_skillpoints = "skilltree.skillpoints";
    private final String valuePath_deathcount = "deathcount";

    public PlayerData(UUID playerID) throws IOException {
        configHelper = new ConfigHelper();
        this.playerID = playerID;
        file = "plugins/stoneblock/playerdata/" + playerID;
        if (!configHelper.checkConfig(file)) createDefaults();
    }

    private void createDefaults() throws IOException {
        configHelper.setInteger(file, valuePath_skillpoints, 1);
        configHelper.setInteger(file,valuePath_deathcount,0);

    }

    public Integer getDeaths() throws IOException{
        return configHelper.getInteger(file,valuePath_deathcount);
    }

    public Integer getSkillPoints() throws IOException {
        return configHelper.getInteger(file,valuePath_skillpoints);
    }


}
