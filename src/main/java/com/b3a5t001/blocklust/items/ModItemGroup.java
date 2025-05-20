package com.b3a5t001.blocklust.items;

import com.b3a5t001.blocklust.BlockLust;
import com.b3a5t001.blocklust.blocks.ModBlocks;
import com.b3a5t001.blocklust.blocks.ModMossBlocks;
import com.b3a5t001.blocklust.blocks.ModPlanks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup STONE_EXPANSION_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(BlockLust.MOD_ID, "stone_expansion"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ANDESITE_BRICKS))
                .displayName(Text.translatable("itemgroup.blocklust.stone_expansion"))
                .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.ANDESITE_BRICKS);
                    entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                    entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                    entries.add(ModBlocks.ANDESITE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_ANDESITE_BRICKS);
                    entries.add(ModBlocks.ANDESITE_TILES);
                    entries.add(ModBlocks.ANDESITE_TILE_STAIRS);
                    entries.add(ModBlocks.ANDESITE_TILE_SLAB);
                    entries.add(ModBlocks.ANDESITE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_TILES);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_ANDESITE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_ANDESITE_TILES);
                    entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                    
                    entries.add(ModBlocks.CUT_POLISHED_BASALT);
                    entries.add(ModBlocks.CUT_POLISHED_BASALT_STAIRS);
                    entries.add(ModBlocks.CUT_POLISHED_BASALT_SLAB);
                    entries.add(ModBlocks.CUT_POLISHED_BASALT_WALL);
                    entries.add(ModBlocks.BASALT_BRICKS);
                    entries.add(ModBlocks.BASALT_BRICK_STAIRS);
                    entries.add(ModBlocks.BASALT_BRICK_SLAB);
                    entries.add(ModBlocks.BASALT_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_BASALT_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_BASALT_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_BASALT_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_BASALT_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_BASALT_BRICKS);
                    entries.add(ModBlocks.BASALT_TILES);
                    entries.add(ModBlocks.BASALT_TILE_STAIRS);
                    entries.add(ModBlocks.BASALT_TILE_SLAB);
                    entries.add(ModBlocks.BASALT_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_BASALT_TILES);
                    entries.add(ModMossBlocks.MOSSY_BASALT_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_BASALT_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_BASALT_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_BASALT_TILES);
                    
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);
                    entries.add(ModBlocks.POLISHED_BLACKSTONE_TILES);
                    entries.add(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
                    entries.add(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
                    entries.add(ModBlocks.POLISHED_BLACKSTONE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
                    
                    entries.add(ModMossBlocks.MOSSY_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_BRICK_WALL);

                    entries.add(ModBlocks.CALCITE_STAIRS);
                    entries.add(ModBlocks.CALCITE_SLAB);
                    entries.add(ModBlocks.CALCITE_WALL);
                    entries.add(ModBlocks.POLISHED_CALCITE);
                    entries.add(ModBlocks.POLISHED_CALCITE_STAIRS);
                    entries.add(ModBlocks.POLISHED_CALCITE_SLAB);
                    entries.add(ModBlocks.POLISHED_CALCITE_WALL);
                    entries.add(ModBlocks.CALCITE_BRICKS);
                    entries.add(ModBlocks.CALCITE_BRICK_STAIRS);
                    entries.add(ModBlocks.CALCITE_BRICK_SLAB);
                    entries.add(ModBlocks.CALCITE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_CALCITE_BRICKS);
                    entries.add(ModBlocks.CALCITE_TILES);
                    entries.add(ModBlocks.CALCITE_TILE_STAIRS);
                    entries.add(ModBlocks.CALCITE_TILE_SLAB);
                    entries.add(ModBlocks.CALCITE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_TILES);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_CALCITE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_CALCITE_TILES);

                    entries.add(ModBlocks.DARK_PRISMARINE_WALL);
                    entries.add(ModBlocks.DARK_PRISMARINE_BRICKS);
                    entries.add(ModBlocks.DARK_PRISMARINE_BRICK_STAIRS);
                    entries.add(ModBlocks.DARK_PRISMARINE_BRICK_SLAB);
                    entries.add(ModBlocks.DARK_PRISMARINE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_DARK_PRISMARINE_BRICKS);
                    entries.add(ModBlocks.DARK_PRISMARINE_TILES);
                    entries.add(ModBlocks.DARK_PRISMARINE_TILE_STAIRS);
                    entries.add(ModBlocks.DARK_PRISMARINE_TILE_SLAB);
                    entries.add(ModBlocks.DARK_PRISMARINE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_DARK_PRISMARINE_TILES);

                    entries.add(ModBlocks.DRIPSTONE_STAIRS);
                    entries.add(ModBlocks.DRIPSTONE_SLAB);
                    entries.add(ModBlocks.DRIPSTONE_WALL);
                    entries.add(ModBlocks.POLISHED_DRIPSTONE);
                    entries.add(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
                    entries.add(ModBlocks.POLISHED_DRIPSTONE_SLAB);
                    entries.add(ModBlocks.POLISHED_DRIPSTONE_WALL);
                    entries.add(ModBlocks.DRIPSTONE_BRICKS);
                    entries.add(ModBlocks.DRIPSTONE_BRICK_STAIRS);
                    entries.add(ModBlocks.DRIPSTONE_BRICK_SLAB);
                    entries.add(ModBlocks.DRIPSTONE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_DRIPSTONE_BRICKS);
                    entries.add(ModBlocks.DRIPSTONE_TILES);
                    entries.add(ModBlocks.DRIPSTONE_TILE_STAIRS);
                    entries.add(ModBlocks.DRIPSTONE_TILE_SLAB);
                    entries.add(ModBlocks.DRIPSTONE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_TILES);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DRIPSTONE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_DRIPSTONE_TILES);

                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_TILES);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DEEPSLATE_TILE_WALL);
                    
                    entries.add(ModBlocks.DIORITE_BRICKS);
                    entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
                    entries.add(ModBlocks.DIORITE_BRICK_SLAB);
                    entries.add(ModBlocks.DIORITE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_DIORITE_BRICKS);
                    entries.add(ModBlocks.DIORITE_TILES);
                    entries.add(ModBlocks.DIORITE_TILE_STAIRS);
                    entries.add(ModBlocks.DIORITE_TILE_SLAB);
                    entries.add(ModBlocks.DIORITE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_TILES);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_DIORITE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_DIORITE_TILES);
                    entries.add(ModBlocks.POLISHED_DIORITE_WALL);

                    entries.add(ModBlocks.END_STONE_STAIRS);
                    entries.add(ModBlocks.END_STONE_SLAB);
                    entries.add(ModBlocks.END_STONE_WALL);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_END_STONE_BRICKS);
                    entries.add(ModBlocks.END_STONE_TILES);
                    entries.add(ModBlocks.END_STONE_TILE_STAIRS);
                    entries.add(ModBlocks.END_STONE_TILE_SLAB);
                    entries.add(ModBlocks.END_STONE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_TILES);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_END_STONE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_END_STONE_TILES);
                    
                    entries.add(ModBlocks.GRANITE_BRICKS);
                    entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
                    entries.add(ModBlocks.GRANITE_BRICK_SLAB);
                    entries.add(ModBlocks.GRANITE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_GRANITE_BRICKS);
                    entries.add(ModBlocks.GRANITE_TILES);
                    entries.add(ModBlocks.GRANITE_TILE_STAIRS);
                    entries.add(ModBlocks.GRANITE_TILE_SLAB);
                    entries.add(ModBlocks.GRANITE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_TILES);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_GRANITE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_GRANITE_TILES);
                    entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                    
                    entries.add(ModMossBlocks.MOSSY_MUD_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_MUD_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_MUD_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_MUD_BRICK_WALL);
                    
                    entries.add(ModMossBlocks.MOSSY_NETHER_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_NETHER_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_NETHER_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_NETHER_BRICK_WALL);

                    entries.add(ModBlocks.NETHERRACK_STAIRS);
                    entries.add(ModBlocks.NETHERRACK_SLAB);
                    entries.add(ModBlocks.NETHERRACK_WALL);
                    entries.add(ModBlocks.POLISHED_NETHERRACK);
                    entries.add(ModBlocks.POLISHED_NETHERRACK_STAIRS);
                    entries.add(ModBlocks.POLISHED_NETHERRACK_SLAB);
                    entries.add(ModBlocks.POLISHED_NETHERRACK_WALL);
                    entries.add(ModBlocks.NETHERRACK_BRICKS);
                    entries.add(ModBlocks.NETHERRACK_BRICK_STAIRS);
                    entries.add(ModBlocks.NETHERRACK_BRICK_SLAB);
                    entries.add(ModBlocks.NETHERRACK_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_NETHERRACK_BRICKS);
                    entries.add(ModBlocks.NETHERRACK_TILES);
                    entries.add(ModBlocks.NETHERRACK_TILE_STAIRS);
                    entries.add(ModBlocks.NETHERRACK_TILE_SLAB);
                    entries.add(ModBlocks.NETHERRACK_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_TILES);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_NETHERRACK_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_NETHERRACK_TILES);

                    entries.add(ModBlocks.PRISMARINE_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_PRISMARINE_BRICKS);
                    entries.add(ModBlocks.PRISMARINE_TILES);
                    entries.add(ModBlocks.PRISMARINE_TILE_STAIRS);
                    entries.add(ModBlocks.PRISMARINE_TILE_SLAB);
                    entries.add(ModBlocks.PRISMARINE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_TILES);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_PRISMARINE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_PRISMARINE_TILES);

                    entries.add(ModBlocks.PURPUR_WALL);
                    entries.add(ModBlocks.PURPUR_BRICKS);
                    entries.add(ModBlocks.PURPUR_BRICK_STAIRS);
                    entries.add(ModBlocks.PURPUR_BRICK_SLAB);
                    entries.add(ModBlocks.PURPUR_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_PURPUR_BRICKS);
                    entries.add(ModBlocks.PURPUR_TILES);
                    entries.add(ModBlocks.PURPUR_TILE_STAIRS);
                    entries.add(ModBlocks.PURPUR_TILE_SLAB);
                    entries.add(ModBlocks.PURPUR_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_TILES);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_PURPUR_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_PURPUR_TILES);

                    entries.add(ModBlocks.QUARTZ_WALL);
                    entries.add(ModBlocks.SMOOTH_QUARTZ_WALL);
                    entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
                    entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
                    entries.add(ModBlocks.QUARTZ_BRICK_WALL);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_QUARTZ_BRICKS);
                    entries.add(ModBlocks.QUARTZ_TILES);
                    entries.add(ModBlocks.QUARTZ_TILE_STAIRS);
                    entries.add(ModBlocks.QUARTZ_TILE_SLAB);
                    entries.add(ModBlocks.QUARTZ_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_TILES);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_QUARTZ_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_QUARTZ_TILES);

                    entries.add(ModMossBlocks.MOSSY_RED_NETHER_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_RED_NETHER_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_RED_NETHER_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_RED_NETHER_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_RED_NETHER_BRICKS);

                    entries.add(ModMossBlocks.MOSSY_TUFF_BRICKS);
                    entries.add(ModMossBlocks.MOSSY_TUFF_BRICK_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_TUFF_BRICK_SLAB);
                    entries.add(ModMossBlocks.MOSSY_TUFF_BRICK_WALL);
                    entries.add(ModBlocks.CRACKED_TUFF_BRICKS);
                    entries.add(ModBlocks.TUFF_TILES);
                    entries.add(ModBlocks.TUFF_TILE_STAIRS);
                    entries.add(ModBlocks.TUFF_TILE_SLAB);
                    entries.add(ModBlocks.TUFF_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_TUFF_TILES);
                    entries.add(ModMossBlocks.MOSSY_TUFF_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_TUFF_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_TUFF_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_TUFF_TILES);
                    
                    entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                    entries.add(ModBlocks.SMOOTH_STONE_WALL);
                    entries.add(ModBlocks.STONE_WALL);
                    entries.add(ModBlocks.STONE_TILES);
                    entries.add(ModBlocks.STONE_TILE_STAIRS);
                    entries.add(ModBlocks.STONE_TILE_SLAB);
                    entries.add(ModBlocks.STONE_TILE_WALL);
                    entries.add(ModMossBlocks.MOSSY_STONE_TILES);
                    entries.add(ModMossBlocks.MOSSY_STONE_TILE_STAIRS);
                    entries.add(ModMossBlocks.MOSSY_STONE_TILE_SLAB);
                    entries.add(ModMossBlocks.MOSSY_STONE_TILE_WALL);
                    entries.add(ModBlocks.CRACKED_STONE_TILES);
                }).build());

    public static final ItemGroup WOOD_EXPANSION_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlockLust.MOD_ID, "wood_expansion"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModPlanks.CACTUS_PLANKS))
                    .displayName(Text.translatable("itemgroup.blocklust.wood_expansion"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModPlanks.CACTUS_FRAME);
                        entries.add(ModPlanks.CACTUS_PLANKS);
                        entries.add(ModPlanks.CACTUS_STAIRS);
                        entries.add(ModPlanks.CACTUS_SLAB);
                        entries.add(ModPlanks.CACTUS_BUTTON);
                        entries.add(ModPlanks.CACTUS_PRESSURE_PLATE);
                        entries.add(ModPlanks.CACTUS_FENCE);
                        entries.add(ModPlanks.CACTUS_FENCE_GATE);
                        entries.add(ModPlanks.CACTUS_DOOR);
                        entries.add(ModPlanks.CACTUS_TRAPDOOR);
                        entries.add(ModPlanks.MOSSY_ACACIA_PLANKS);
                        entries.add(ModPlanks.MOSSY_ACACIA_STAIRS);
                        entries.add(ModPlanks.MOSSY_ACACIA_SLAB);
                        entries.add(ModPlanks.MOSSY_ACACIA_FENCE);
                        entries.add(ModPlanks.MOSSY_ACACIA_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_BAMBOO_PLANKS);
                        entries.add(ModPlanks.MOSSY_BAMBOO_STAIRS);
                        entries.add(ModPlanks.MOSSY_BAMBOO_SLAB);
                        entries.add(ModPlanks.MOSSY_BAMBOO_FENCE);
                        entries.add(ModPlanks.MOSSY_BAMBOO_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_BAMBOO_MOSAIC);
                        entries.add(ModPlanks.MOSSY_BAMBOO_MOSAIC_STAIRS);
                        entries.add(ModPlanks.MOSSY_BAMBOO_MOSAIC_SLAB);
                        entries.add(ModPlanks.MOSSY_BIRCH_PLANKS);
                        entries.add(ModPlanks.MOSSY_BIRCH_STAIRS);
                        entries.add(ModPlanks.MOSSY_BIRCH_SLAB);
                        entries.add(ModPlanks.MOSSY_BIRCH_FENCE);
                        entries.add(ModPlanks.MOSSY_BIRCH_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_CACTUS_PLANKS);
                        entries.add(ModPlanks.MOSSY_CACTUS_STAIRS);
                        entries.add(ModPlanks.MOSSY_CACTUS_SLAB);
                        entries.add(ModPlanks.MOSSY_CACTUS_FENCE);
                        entries.add(ModPlanks.MOSSY_CACTUS_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_CHERRY_PLANKS);
                        entries.add(ModPlanks.MOSSY_CHERRY_STAIRS);
                        entries.add(ModPlanks.MOSSY_CHERRY_SLAB);
                        entries.add(ModPlanks.MOSSY_CHERRY_FENCE);
                        entries.add(ModPlanks.MOSSY_CHERRY_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_CRIMSON_PLANKS);
                        entries.add(ModPlanks.MOSSY_CRIMSON_STAIRS);
                        entries.add(ModPlanks.MOSSY_CRIMSON_SLAB);
                        entries.add(ModPlanks.MOSSY_CRIMSON_FENCE);
                        entries.add(ModPlanks.MOSSY_CRIMSON_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_DARK_OAK_PLANKS);
                        entries.add(ModPlanks.MOSSY_DARK_OAK_STAIRS);
                        entries.add(ModPlanks.MOSSY_DARK_OAK_SLAB);
                        entries.add(ModPlanks.MOSSY_DARK_OAK_FENCE);
                        entries.add(ModPlanks.MOSSY_DARK_OAK_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_JUNGLE_PLANKS);
                        entries.add(ModPlanks.MOSSY_JUNGLE_STAIRS);
                        entries.add(ModPlanks.MOSSY_JUNGLE_SLAB);
                        entries.add(ModPlanks.MOSSY_JUNGLE_FENCE);
                        entries.add(ModPlanks.MOSSY_JUNGLE_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_MANGROVE_PLANKS);
                        entries.add(ModPlanks.MOSSY_MANGROVE_STAIRS);
                        entries.add(ModPlanks.MOSSY_MANGROVE_SLAB);
                        entries.add(ModPlanks.MOSSY_MANGROVE_FENCE);
                        entries.add(ModPlanks.MOSSY_MANGROVE_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_OAK_PLANKS);
                        entries.add(ModPlanks.MOSSY_OAK_STAIRS);
                        entries.add(ModPlanks.MOSSY_OAK_SLAB);
                        entries.add(ModPlanks.MOSSY_OAK_FENCE);
                        entries.add(ModPlanks.MOSSY_OAK_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_SPRUCE_PLANKS);
                        entries.add(ModPlanks.MOSSY_SPRUCE_STAIRS);
                        entries.add(ModPlanks.MOSSY_SPRUCE_SLAB);
                        entries.add(ModPlanks.MOSSY_SPRUCE_FENCE);
                        entries.add(ModPlanks.MOSSY_SPRUCE_FENCE_GATE);
                        entries.add(ModPlanks.MOSSY_WARPED_PLANKS);
                        entries.add(ModPlanks.MOSSY_WARPED_STAIRS);
                        entries.add(ModPlanks.MOSSY_WARPED_SLAB);
                        entries.add(ModPlanks.MOSSY_WARPED_FENCE);
                        entries.add(ModPlanks.MOSSY_WARPED_FENCE_GATE);

                    }).build());
    public static final ItemGroup ORE_EXPANSION_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlockLust.MOD_ID, "ore_expansion"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CALCITE_DIAMOND_ORE))
                    .displayName(Text.translatable("itemgroup.blocklust.ore_expansion"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANDESITE_COAL_ORE);
                        entries.add(ModBlocks.ANDESITE_COPPER_ORE);
                        entries.add(ModBlocks.ANDESITE_IRON_ORE);
                        entries.add(ModBlocks.ANDESITE_GOLD_ORE);
                        entries.add(ModBlocks.ANDESITE_LAPIS_ORE);
                        entries.add(ModBlocks.ANDESITE_REDSTONE_ORE);
                        entries.add(ModBlocks.ANDESITE_DIAMOND_ORE);
                        entries.add(ModBlocks.ANDESITE_EMERALD_ORE);
                        
                        entries.add(ModBlocks.BASALT_GOLD_ORE);
                        entries.add(ModBlocks.BASALT_QUARTZ_ORE);
                        entries.add(ModBlocks.BLACKSTONE_QUARTZ_ORE);

                        entries.add(ModBlocks.CALCITE_COAL_ORE);
                        entries.add(ModBlocks.CALCITE_COPPER_ORE);
                        entries.add(ModBlocks.CALCITE_IRON_ORE);
                        entries.add(ModBlocks.CALCITE_GOLD_ORE);
                        entries.add(ModBlocks.CALCITE_LAPIS_ORE);
                        entries.add(ModBlocks.CALCITE_REDSTONE_ORE);
                        entries.add(ModBlocks.CALCITE_DIAMOND_ORE);
                        entries.add(ModBlocks.CALCITE_EMERALD_ORE);
                        
                        entries.add(ModBlocks.DIORITE_COAL_ORE);
                        entries.add(ModBlocks.DIORITE_COPPER_ORE);
                        entries.add(ModBlocks.DIORITE_IRON_ORE);
                        entries.add(ModBlocks.DIORITE_GOLD_ORE);
                        entries.add(ModBlocks.DIORITE_LAPIS_ORE);
                        entries.add(ModBlocks.DIORITE_REDSTONE_ORE);
                        entries.add(ModBlocks.DIORITE_DIAMOND_ORE);
                        entries.add(ModBlocks.DIORITE_EMERALD_ORE);

                        entries.add(ModBlocks.DRIPSTONE_COAL_ORE);
                        entries.add(ModBlocks.DRIPSTONE_COPPER_ORE);
                        entries.add(ModBlocks.DRIPSTONE_IRON_ORE);
                        entries.add(ModBlocks.DRIPSTONE_GOLD_ORE);
                        entries.add(ModBlocks.DRIPSTONE_LAPIS_ORE);
                        entries.add(ModBlocks.DRIPSTONE_REDSTONE_ORE);
                        entries.add(ModBlocks.DRIPSTONE_DIAMOND_ORE);
                        entries.add(ModBlocks.DRIPSTONE_EMERALD_ORE);
                        
                        entries.add(ModBlocks.GRANITE_COAL_ORE);
                        entries.add(ModBlocks.GRANITE_COPPER_ORE);
                        entries.add(ModBlocks.GRANITE_IRON_ORE);
                        entries.add(ModBlocks.GRANITE_GOLD_ORE);
                        entries.add(ModBlocks.GRANITE_LAPIS_ORE);
                        entries.add(ModBlocks.GRANITE_REDSTONE_ORE);
                        entries.add(ModBlocks.GRANITE_DIAMOND_ORE);
                        entries.add(ModBlocks.GRANITE_EMERALD_ORE);
                        
                        entries.add(ModBlocks.MOSSY_COAL_ORE);
                        entries.add(ModBlocks.MOSSY_COPPER_ORE);
                        entries.add(ModBlocks.MOSSY_IRON_ORE);
                        entries.add(ModBlocks.MOSSY_GOLD_ORE);
                        entries.add(ModBlocks.MOSSY_LAPIS_ORE);
                        entries.add(ModBlocks.MOSSY_REDSTONE_ORE);
                        entries.add(ModBlocks.MOSSY_DIAMOND_ORE);
                        entries.add(ModBlocks.MOSSY_EMERALD_ORE);

                        entries.add(ModBlocks.TUFF_COAL_ORE);
                        entries.add(ModBlocks.TUFF_COPPER_ORE);
                        entries.add(ModBlocks.TUFF_IRON_ORE);
                        entries.add(ModBlocks.TUFF_GOLD_ORE);
                        entries.add(ModBlocks.TUFF_LAPIS_ORE);
                        entries.add(ModBlocks.TUFF_REDSTONE_ORE);
                        entries.add(ModBlocks.TUFF_DIAMOND_ORE);
                        entries.add(ModBlocks.TUFF_EMERALD_ORE);
                    }).build());

    public static void registerItemGroups() {
        BlockLust.LOGGER.info("Registering Item Groups for " + BlockLust.MOD_ID);
    }
}

