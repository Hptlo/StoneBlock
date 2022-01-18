package de.dopebrot.stoneblock;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class WorldGeneration extends ChunkGenerator {
    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        ChunkData chunkData = createChunkData(world);
        // bottom
        // mid section
        for (int Ix = 0; Ix < 16; Ix++) {
            for (int Iz = 0; Iz < 16; Iz++) {
                for (int Iy = 1; Iy < 255; Iy++) {
                    chunkData.setBlock(Ix, Iy, Iz, Material.STONE);
                }
            }
        }
        // top
        for (int Ix = 0; Ix < 16; Ix++) {
            for (int Iz = 0; Iz < 16; Iz++) {
                chunkData.setBlock(Ix, 0, Iz, Material.BEDROCK);
            }
        }
        for (int Ix = 0; Ix < 16; Ix++) {
            for (int Iz = 0; Iz < 16; Iz++) {
                chunkData.setBlock(Ix, 255, Iz, Material.BEDROCK);
            }
        }
        // spawn room
        if (z == 0) {
            if (x == 0) {
                System.out.println("z found");
                System.out.println("x found");
                for (int Ix = 4; Ix <= 12; Ix++) {
                    for (int Iy = 124; Iy <= 132; Iy++) {
                        for (int Iz = 4; Iz <= 12; Iz++) {
                            chunkData.setBlock(Ix, Iy, Iz, Material.AIR);
                            chunkData.setBlock(8, 124, 8, Material.TORCH);
                        }
                    }
                }
            }
        }


        return chunkData;
    }


}
