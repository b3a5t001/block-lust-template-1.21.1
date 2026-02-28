package com.b3a5t001.blocklust.blocks;

import com.b3a5t001.blocklust.BlockLust;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModMossBlocks {
    private static final ThreadLocal<RegistryKey<Block>> CURRENT_BLOCK_KEY = new ThreadLocal<>();

    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = registerBlock("mossy_andesite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = registerBlock("mossy_andesite_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_ANDESITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_BRICK_WALL = registerBlock("mossy_andesite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_TILES = registerBlock("mossy_andesite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_TILE_SLAB = registerBlock("mossy_andesite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_TILE_STAIRS = registerBlock("mossy_andesite_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_ANDESITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_ANDESITE_TILE_WALL = registerBlock("mossy_andesite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));

    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_BRICK_SLAB = registerBlock("mossy_granite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_BRICK_STAIRS = registerBlock("mossy_granite_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_GRANITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_BRICK_WALL = registerBlock("mossy_granite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_TILES = registerBlock("mossy_granite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_TILE_SLAB = registerBlock("mossy_granite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_TILE_STAIRS = registerBlock("mossy_granite_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_GRANITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_GRANITE_TILE_WALL = registerBlock("mossy_granite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    
    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_BRICK_SLAB = registerBlock("mossy_diorite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_BRICK_STAIRS = registerBlock("mossy_diorite_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DIORITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_BRICK_WALL = registerBlock("mossy_diorite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_TILES = registerBlock("mossy_diorite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_TILE_SLAB = registerBlock("mossy_diorite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_TILE_STAIRS = registerBlock("mossy_diorite_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DIORITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_DIORITE_TILE_WALL = registerBlock("mossy_diorite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));

    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_STONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));

    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(keyedCopy(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_STAIRS = registerBlock("mossy_bricks_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_BRICKS.getDefaultState(),keyedCopy(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_SLAB = registerBlock("mossy_bricks_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_WALL = registerBlock("mossy_bricks_wall",
            () -> new WallBlock(keyedCopy(Blocks.BRICKS)));

    public static final Block MOSSY_NETHER_BRICKS = registerBlock("mossy_nether_bricks",
            () -> new Block(keyedCopy(Blocks.NETHER_BRICKS)));
    public static final Block MOSSY_NETHER_BRICK_STAIRS = registerBlock("mossy_nether_bricks_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_NETHER_BRICKS.getDefaultState(),keyedCopy(Blocks.NETHER_BRICKS)));
    public static final Block MOSSY_NETHER_BRICK_SLAB = registerBlock("mossy_nether_bricks_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHER_BRICKS)));
    public static final Block MOSSY_NETHER_BRICK_WALL = registerBlock("mossy_nether_bricks_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHER_BRICKS)));

    public static final Block MOSSY_RED_NETHER_BRICKS = registerBlock("mossy_red_nether_bricks",
            () -> new Block(keyedCopy(Blocks.RED_NETHER_BRICKS)));
    public static final Block MOSSY_RED_NETHER_BRICK_STAIRS = registerBlock("mossy_red_nether_bricks_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_RED_NETHER_BRICKS.getDefaultState(),keyedCopy(Blocks.RED_NETHER_BRICKS)));
    public static final Block MOSSY_RED_NETHER_BRICK_SLAB = registerBlock("mossy_red_nether_bricks_slab",
            () -> new SlabBlock(keyedCopy(Blocks.RED_NETHER_BRICKS)));
    public static final Block MOSSY_RED_NETHER_BRICK_WALL = registerBlock("mossy_red_nether_bricks_wall",
            () -> new WallBlock(keyedCopy(Blocks.RED_NETHER_BRICKS)));

    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            () -> new Block(keyedCopy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_bricks_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_MUD_BRICKS.getDefaultState(),keyedCopy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_bricks_slab",
            () -> new SlabBlock(keyedCopy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_bricks_wall",
            () -> new WallBlock(keyedCopy(Blocks.MUD_BRICKS)));
    
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICK_STAIRS = registerBlock("mossy_calcite_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_CALCITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICK_SLAB = registerBlock("mossy_calcite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICK_WALL = registerBlock("mossy_calcite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_TILES = registerBlock("mossy_calcite_tiles",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_TILE_STAIRS = registerBlock("mossy_calcite_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_CALCITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_TILE_SLAB = registerBlock("mossy_calcite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_TILE_WALL = registerBlock("mossy_calcite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.CALCITE)));

    public static final Block MOSSY_NETHERRACK_BRICKS = registerBlock("mossy_netherrack_bricks",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_BRICK_STAIRS = registerBlock("mossy_netherrack_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_NETHERRACK_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_BRICK_SLAB = registerBlock("mossy_netherrack_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_BRICK_WALL = registerBlock("mossy_netherrack_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_TILES = registerBlock("mossy_netherrack_tiles",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_TILE_STAIRS = registerBlock("mossy_netherrack_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_NETHERRACK_TILES.getDefaultState(),
                    keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_TILE_SLAB = registerBlock("mossy_netherrack_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block MOSSY_NETHERRACK_TILE_WALL = registerBlock("mossy_netherrack_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHERRACK)));

    public static final Block MOSSY_END_STONE_BRICKS = registerBlock("mossy_end_stone_bricks",
            () -> new Block(keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_BRICK_STAIRS = registerBlock("mossy_end_stone_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_END_STONE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_BRICK_SLAB = registerBlock("mossy_end_stone_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_BRICK_WALL = registerBlock("mossy_end_stone_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_TILES = registerBlock("mossy_end_stone_tiles",
            () -> new Block(keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_TILE_STAIRS = registerBlock("mossy_end_stone_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_END_STONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_TILE_SLAB = registerBlock("mossy_end_stone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block MOSSY_END_STONE_TILE_WALL = registerBlock("mossy_end_stone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.END_STONE)));
    
    public static final Block MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DRIPSTONE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_TILES = registerBlock("mossy_dripstone_tiles",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_TILE_STAIRS = registerBlock("mossy_dripstone_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DRIPSTONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_TILE_SLAB = registerBlock("mossy_dripstone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block MOSSY_DRIPSTONE_TILE_WALL = registerBlock("mossy_dripstone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    
    public static final Block MOSSY_QUARTZ_BRICKS = registerBlock("mossy_quartz_bricks",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_BRICK_STAIRS = registerBlock("mossy_quartz_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_QUARTZ_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_BRICK_SLAB = registerBlock("mossy_quartz_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_BRICK_WALL = registerBlock("mossy_quartz_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_TILES = registerBlock("mossy_quartz_tiles",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_TILE_STAIRS = registerBlock("mossy_quartz_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_QUARTZ_TILES.getDefaultState(),
                    keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_TILE_SLAB = registerBlock("mossy_quartz_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block MOSSY_QUARTZ_TILE_WALL = registerBlock("mossy_quartz_ticle_wall",
            () -> new WallBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    
    public static final Block MOSSY_PURPUR_BRICKS = registerBlock("mossy_purpur_bricks",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_BRICK_STAIRS = registerBlock("mossy_purpur_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_PURPUR_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_BRICK_SLAB = registerBlock("mossy_purpur_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_BRICK_WALL = registerBlock("mossy_purpur_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_TILES = registerBlock("mossy_purpur_tiles",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_TILE_STAIRS = registerBlock("mossy_purpur_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_PURPUR_TILES.getDefaultState(),
                    keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_TILE_SLAB = registerBlock("mossy_purpur_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block MOSSY_PURPUR_TILE_WALL = registerBlock("mossy_purpur_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.PURPUR_BLOCK)));

    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(keyedCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(keyedCopy(Blocks.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DEEPSLATE_TILES.getDefaultState(),
                    keyedCopy(Blocks.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.DEEPSLATE_TILES)));

    public static final Block MOSSY_BASALT_BRICKS = registerBlock("mossy_basalt_bricks",
            () -> new Block(keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_BRICK_STAIRS = registerBlock("mossy_basalt_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_BASALT_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_BRICK_SLAB = registerBlock("mossy_basalt_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_BRICK_WALL = registerBlock("mossy_basalt_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_TILES = registerBlock("mossy_basalt_tiles",
            () -> new Block(keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_TILE_STAIRS = registerBlock("mossy_basalt_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_BASALT_TILES.getDefaultState(),
                    keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_TILE_SLAB = registerBlock("mossy_basalt_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BASALT)));
    public static final Block MOSSY_BASALT_TILE_WALL = registerBlock("mossy_basalt_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.BASALT)));

    public static final Block MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            () -> new Block(keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_TUFF_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_TILES = registerBlock("mossy_tuff_tiles",
            () -> new Block(keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_TILE_STAIRS = registerBlock("mossy_tuff_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_TUFF_TILES.getDefaultState(),
                    keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_TILE_SLAB = registerBlock("mossy_tuff_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.TUFF)));
    public static final Block MOSSY_TUFF_TILE_WALL = registerBlock("mossy_tuff_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.TUFF)));

    public static final Block MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",
            () -> new Block(keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_prismarine_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_PRISMARINE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_BRICK_SLAB = registerBlock("mossy_prismarine_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_BRICK_WALL = registerBlock("mossy_prismarine_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_TILES = registerBlock("mossy_prismarine_tiles",
            () -> new Block(keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_TILE_STAIRS = registerBlock("mossy_prismarine_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_PRISMARINE_TILES.getDefaultState(),
                    keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_TILE_SLAB = registerBlock("mossy_prismarine_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PRISMARINE)));
    public static final Block MOSSY_PRISMARINE_TILE_WALL = registerBlock("mossy_prismarine_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.PRISMARINE)));

    public static final Block MOSSY_DARK_PRISMARINE_BRICKS = registerBlock("mossy_dark_prismarine_bricks",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_BRICK_STAIRS = registerBlock("mossy_dark_prismarine_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_BRICK_SLAB = registerBlock("mossy_dark_prismarine_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_BRICK_WALL = registerBlock("mossy_dark_prismarine_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_TILES = registerBlock("mossy_dark_prismarine_tiles",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_TILE_STAIRS = registerBlock("mossy_dark_prismarine_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES.getDefaultState(),
                    keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_TILE_SLAB = registerBlock("mossy_dark_prismarine_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block MOSSY_DARK_PRISMARINE_TILE_WALL = registerBlock("mossy_dark_prismarine_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.DARK_PRISMARINE)));

    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("mossy_polished_blackstone_bricks",
            () -> new Block(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("mossy_polished_blackstone_brick_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("mossy_polished_blackstone_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("mossy_polished_blackstone_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_TILES = registerBlock("mossy_polished_blackstone_tiles",
            () -> new Block(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("mossy_polished_blackstone_tile_stairs",
            () -> new StairsBlock(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("mossy_polished_blackstone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_TILE_WALL = registerBlock("mossy_polished_blackstone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.BLACKSTONE)));
    
    private static Block registerBlock(String name, Supplier<? extends Block> blockFactory) {
        Identifier id = Identifier.of(BlockLust.MOD_ID, name);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        CURRENT_BLOCK_KEY.set(blockKey);
        Block block;
        try {
            block = blockFactory.get();
        } finally {
            CURRENT_BLOCK_KEY.remove();
        }
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, id, block);
    }

    private static AbstractBlock.Settings keyedCopy(Block block) {
        return keyedSettings(AbstractBlock.Settings.copy(block));
    }

    private static AbstractBlock.Settings keyedSettings(AbstractBlock.Settings settings) {
        RegistryKey<Block> blockKey = CURRENT_BLOCK_KEY.get();
        if (blockKey == null) {
            throw new IllegalStateException("No block key in registration context");
        }
        return settings.registryKey(blockKey);
    }

    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(BlockLust.MOD_ID, name);
        Registry.register(Registries.ITEM, id,
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, id)).useBlockPrefixedTranslationKey()));
    }

    public static void registerModMossBlocks() {
        BlockLust.LOGGER.info("Registering Mod Blocks for " + BlockLust.MOD_ID);
    }
}





