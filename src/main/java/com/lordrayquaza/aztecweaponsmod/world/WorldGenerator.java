package com.lordrayquaza.aztecweaponsmod.world;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Eric on 5/21/2016.
 */
public class WorldGenerator {

    public static WorldGeneratorOre oreGen;
    public static WorldGeneratorAztecChests chestGen;

    public static void init() {
        oreGen = new WorldGeneratorOre();
        chestGen = new WorldGeneratorAztecChests();
        GameRegistry.registerWorldGenerator(oreGen, 10);
        GameRegistry.registerWorldGenerator(chestGen, 10);
    }

}
