package com.b3a5t001.blocklust;

import com.b3a5t001.blocklust.blocks.ModBlocks;
import com.b3a5t001.blocklust.blocks.ModMossBlocks;
import com.b3a5t001.blocklust.blocks.ModPlanks;
import com.b3a5t001.blocklust.datagen.ModWorldGenerator;
import com.b3a5t001.blocklust.items.ModItemGroup;
import com.b3a5t001.blocklust.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockLust implements ModInitializer {
	public static final String MOD_ID = "blocklust";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FuelRegistry.INSTANCE.add(ModPlanks.CACTUS_FRAME.asItem(),75);

		ModBlocks.registerModBlocks();
		ModPlanks.registerModPlanks();
		ModMossBlocks.registerModMossBlocks();
		ModItemGroup.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();

	}
}