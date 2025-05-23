package de.lulkas_.tutorial_mod_fabric;

import de.lulkas_.tutorial_mod_fabric.block.ModBlocks;
import de.lulkas_.tutorial_mod_fabric.item.ModItemGroups;
import de.lulkas_.tutorial_mod_fabric.item.ModItems;
import de.lulkas_.tutorial_mod_fabric.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialModFabric implements ModInitializer {
	public static final String MOD_ID = "tutorial_mod_fabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}