package net.frozencraft;

import net.fabricmc.api.ModInitializer;

import net.frozencraft.block.ModBlocks;
import net.frozencraft.item.ModItemGroups;
import net.frozencraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Frozencraft implements ModInitializer {
	public static final String MOD_ID = "frozencraft";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}