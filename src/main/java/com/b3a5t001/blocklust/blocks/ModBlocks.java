package com.b3a5t001.blocklust.blocks;

import com.b3a5t001.blocklust.BlockLust;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Supplier;

public class ModBlocks {
    private static final ThreadLocal<RegistryKey<Block>> CURRENT_BLOCK_KEY = new ThreadLocal<>();

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_TILE_SLAB = registerBlock("andesite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_TILE_STAIRS = registerBlock("andesite_tile_stairs",
            () -> new StairsBlock(ModBlocks.ANDESITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block ANDESITE_TILE_WALL = registerBlock("andesite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_ANDESITE_TILES = registerBlock("cracked_andesite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block PHANTOM_POLISHED_ANDESITE = registerBlock("phantom_polished_andesite",
            () -> new Block(keyedCreate()));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_TILE_SLAB = registerBlock("granite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_TILE_STAIRS = registerBlock("granite_tile_stairs",
            () -> new StairsBlock(ModBlocks.GRANITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block GRANITE_TILE_WALL = registerBlock("granite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_GRANITE_TILES = registerBlock("cracked_granite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block PHANTOM_POLISHED_GRANITE = registerBlock("phantom_polished_granite",
            () -> new Block(keyedCreate()));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_TILE_SLAB = registerBlock("diorite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_TILE_STAIRS = registerBlock("diorite_tile_stairs",
            () -> new StairsBlock(ModBlocks.DIORITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block DIORITE_TILE_WALL = registerBlock("diorite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_DIORITE_TILES = registerBlock("cracked_diorite_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block PHANTOM_POLISHED_DIORITE = registerBlock("phantom_polished_diorite",
            () -> new Block(keyedCreate()));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    
    public static final Block PHANTOM_SMOOTH_STONE = registerBlock("phantom_smooth_stone",
            () -> new Block(keyedCreate()));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block PHANTOM_STONE = registerBlock("phantom_stone",
            () -> new Block(keyedCreate()));
    public static final Block STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairsBlock(ModBlocks.PHANTOM_SMOOTH_STONE.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.STONE)));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairsBlock(ModBlocks.STONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.STONE)));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.STONE)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(keyedCopy(Blocks.STONE)));

    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            () -> new Block(keyedCopy(Blocks.RED_NETHER_BRICKS)));

    public static final Block ANDESITE_COAL_ORE = registerBlock("andesite_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.COAL_ORE)));
    public static final Block ANDESITE_COPPER_ORE = registerBlock("andesite_copper_ore",
            () -> new Block(keyedCopy(Blocks.COPPER_ORE)));
    public static final Block ANDESITE_IRON_ORE = registerBlock("andesite_iron_ore",
            () -> new Block(keyedCopy(Blocks.IRON_ORE)));
    public static final Block ANDESITE_GOLD_ORE = registerBlock("andesite_gold_ore",
            () -> new Block(keyedCopy(Blocks.GOLD_ORE)));
    public static final Block ANDESITE_LAPIS_ORE = registerBlock("andesite_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.LAPIS_ORE)));
    public static final Block ANDESITE_DIAMOND_ORE = registerBlock("andesite_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.DIAMOND_ORE)));
    public static final Block ANDESITE_REDSTONE_ORE = registerBlock("andesite_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.REDSTONE_ORE)));
    public static final Block ANDESITE_EMERALD_ORE = registerBlock("andesite_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.EMERALD_ORE)));
    
    public static final Block GRANITE_COAL_ORE = registerBlock("granite_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.COAL_ORE)));
    public static final Block GRANITE_COPPER_ORE = registerBlock("granite_copper_ore",
            () -> new Block(keyedCopy(Blocks.COPPER_ORE)));
    public static final Block GRANITE_IRON_ORE = registerBlock("granite_iron_ore",
            () -> new Block(keyedCopy(Blocks.IRON_ORE)));
    public static final Block GRANITE_GOLD_ORE = registerBlock("granite_gold_ore",
            () -> new Block(keyedCopy(Blocks.GOLD_ORE)));
    public static final Block GRANITE_LAPIS_ORE = registerBlock("granite_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.LAPIS_ORE)));
    public static final Block GRANITE_DIAMOND_ORE = registerBlock("granite_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.DIAMOND_ORE)));
    public static final Block GRANITE_REDSTONE_ORE = registerBlock("granite_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.REDSTONE_ORE)));
    public static final Block GRANITE_EMERALD_ORE = registerBlock("granite_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.EMERALD_ORE)));
    
    public static final Block DIORITE_COAL_ORE = registerBlock("diorite_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.COAL_ORE)));
    public static final Block DIORITE_COPPER_ORE = registerBlock("diorite_copper_ore",
            () -> new Block(keyedCopy(Blocks.COPPER_ORE)));
    public static final Block DIORITE_IRON_ORE = registerBlock("diorite_iron_ore",
            () -> new Block(keyedCopy(Blocks.IRON_ORE)));
    public static final Block DIORITE_GOLD_ORE = registerBlock("diorite_gold_ore",
            () -> new Block(keyedCopy(Blocks.GOLD_ORE)));
    public static final Block DIORITE_LAPIS_ORE = registerBlock("diorite_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.LAPIS_ORE)));
    public static final Block DIORITE_DIAMOND_ORE = registerBlock("diorite_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.DIAMOND_ORE)));
    public static final Block DIORITE_REDSTONE_ORE = registerBlock("diorite_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.REDSTONE_ORE)));
    public static final Block DIORITE_EMERALD_ORE = registerBlock("diorite_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.EMERALD_ORE)));
    
    public static final Block CALCITE_COAL_ORE = registerBlock("calcite_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.COAL_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COPPER_ORE = registerBlock("calcite_copper_ore",
            () -> new Block(keyedCopy(Blocks.COPPER_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_IRON_ORE = registerBlock("calcite_iron_ore",
            () -> new Block(keyedCopy(Blocks.IRON_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_GOLD_ORE = registerBlock("calcite_gold_ore",
            () -> new Block(keyedCopy(Blocks.GOLD_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_LAPIS_ORE = registerBlock("calcite_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.LAPIS_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_DIAMOND_ORE = registerBlock("calcite_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_REDSTONE_ORE = registerBlock("calcite_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.REDSTONE_ORE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_EMERALD_ORE = registerBlock("calcite_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.CALCITE)));
    
    public static final Block DRIPSTONE_COAL_ORE = registerBlock("dripstone_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.COAL_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COPPER_ORE = registerBlock("dripstone_copper_ore",
            () -> new Block(keyedCopy(Blocks.COPPER_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_IRON_ORE = registerBlock("dripstone_iron_ore",
            () -> new Block(keyedCopy(Blocks.IRON_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_GOLD_ORE = registerBlock("dripstone_gold_ore",
            () -> new Block(keyedCopy(Blocks.GOLD_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_LAPIS_ORE = registerBlock("dripstone_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.LAPIS_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_DIAMOND_ORE = registerBlock("dripstone_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_REDSTONE_ORE = registerBlock("dripstone_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.REDSTONE_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_EMERALD_ORE = registerBlock("dripstone_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    
    public static final Block TUFF_COAL_ORE = registerBlock("tuff_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.COAL_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_COPPER_ORE = registerBlock("tuff_copper_ore",
            () -> new Block(keyedCopy(Blocks.COPPER_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            () -> new Block(keyedCopy(Blocks.IRON_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_GOLD_ORE = registerBlock("tuff_gold_ore",
            () -> new Block(keyedCopy(Blocks.GOLD_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_LAPIS_ORE = registerBlock("tuff_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.LAPIS_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_DIAMOND_ORE = registerBlock("tuff_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_REDSTONE_ORE = registerBlock("tuff_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.REDSTONE_ORE).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_EMERALD_ORE = registerBlock("tuff_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.TUFF)));
    
    public static final Block MOSSY_COAL_ORE = registerBlock("mossy_coal_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(0,2),
                    keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_COPPER_ORE = registerBlock("mossy_copper_ore",
            () -> new Block(keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_IRON_ORE = registerBlock("mossy_iron_ore",
            () -> new Block(keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_GOLD_ORE = registerBlock("mossy_gold_ore",
            () -> new Block(keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_LAPIS_ORE = registerBlock("mossy_lapis_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_DIAMOND_ORE = registerBlock("mossy_diamond_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_REDSTONE_ORE = registerBlock("mossy_redstone_ore",
            () -> new RedstoneOreBlock(keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));
    public static final Block MOSSY_EMERALD_ORE = registerBlock("mossy_emerald_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    keyedCopy(Blocks.MOSS_BLOCK).strength(2f)));

    public static final Block BASALT_QUARTZ_ORE = registerBlock("basalt_quartz_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_GOLD_ORE = registerBlock("basalt_gold_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(1,3),
                    keyedCopy(Blocks.BASALT)));
    public static final Block BLACKSTONE_QUARTZ_ORE = registerBlock("blackstone_quartz_ore",
            () -> new ExperienceDroppingBlock(UniformIntProvider.create(1,3),
                    keyedCopy(Blocks.BLACKSTONE)));

    public static final Block PHANTOM_CALCITE = registerBlock("phantom_calcite",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairsBlock(ModBlocks.PHANTOM_CALCITE.getDefaultState(),
                    keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    keyedCopy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            () -> new WallBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            () -> new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            () -> new Block(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            () -> new StairsBlock(ModBlocks.CALCITE_TILES.getDefaultState(),
                    keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.CALCITE)));
    public static final Block CRACKED_CALCITE_TILES = registerBlock("cracked_calcite_tiles",
            () -> new Block(keyedCopy(Blocks.CALCITE)));

    public static final Block PHANTOM_NETHERRACK = registerBlock("phantom_netherrack",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairsBlock(ModBlocks.PHANTOM_NETHERRACK.getDefaultState(),
                    keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block POLISHED_NETHERRACK = registerBlock("polished_netherrack",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block POLISHED_NETHERRACK_STAIRS = registerBlock("polished_netherrack_stairs",
            () -> new StairsBlock(ModBlocks.POLISHED_NETHERRACK.getDefaultState(),
                    keyedCopy(Blocks.NETHERRACK)));
    public static final Block POLISHED_NETHERRACK_SLAB = registerBlock("polished_netherrack_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block POLISHED_NETHERRACK_WALL = registerBlock("polished_netherrack_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_BRICK_STAIRS = registerBlock("netherrack_brick_stairs",
            () -> new StairsBlock(ModBlocks.NETHERRACK_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block CRACKED_NETHERRACK_BRICKS = registerBlock("cracked_netherrack_bricks",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_TILES = registerBlock("netherrack_tiles",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_TILE_STAIRS = registerBlock("netherrack_tile_stairs",
            () -> new StairsBlock(ModBlocks.NETHERRACK_TILES.getDefaultState(),
                    keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_TILE_SLAB = registerBlock("netherrack_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_TILE_WALL = registerBlock("netherrack_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.NETHERRACK)));
    public static final Block CRACKED_NETHERRACK_TILES = registerBlock("cracked_netherrack_tiles",
            () -> new Block(keyedCopy(Blocks.NETHERRACK)));

    public static final Block PHANTOM_END_STONE = registerBlock("phantom_end_stone",
            () -> new Block(keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairsBlock(ModBlocks.PHANTOM_END_STONE.getDefaultState(),
                    keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            () -> new Block(keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            () -> new StairsBlock(ModBlocks.END_STONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.END_STONE)));
    public static final Block CRACKED_END_STONE_TILES = registerBlock("cracked_end_stone_tiles",
            () -> new Block(keyedCopy(Blocks.END_STONE)));

    public static final Block PHANTOM_DRIPSTONE = registerBlock("phantom_dripstone",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairsBlock(ModBlocks.PHANTOM_DRIPSTONE.getDefaultState(),
                    keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairsBlock(ModBlocks.POLISHED_DRIPSTONE.getDefaultState(),
                    keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            () -> new WallBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairsBlock(ModBlocks.DRIPSTONE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs",
            () -> new StairsBlock(ModBlocks.DRIPSTONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_DRIPSTONE_TILES = registerBlock("cracked_dripstone_tiles",
            () -> new Block(keyedCopy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block PHANTOM_QUARTZ = registerBlock("phantom_quartz",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block PHANTOM_SMOOTH_QUARTZ = registerBlock("phantom_smooth_quartz",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block PHANTOM_QUARTZ_BRICKS = registerBlock("phantom_quartz_bricks",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs",
            () -> new StairsBlock(ModBlocks.QUARTZ_TILES.getDefaultState(),
                    keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_WALL = registerBlock("quartz_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.QUARTZ_BLOCK)));
    public static final Block CRACKED_QUARTZ_TILES = registerBlock("cracked_quartz_tiles",
            () -> new Block(keyedCopy(Blocks.QUARTZ_BLOCK)));
    
    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            () -> new Block(keyedCopy(Blocks.TUFF)));
    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            () -> new Block(keyedCopy(Blocks.TUFF)));
    public static final Block TUFF_TILE_STAIRS = registerBlock("tuff_tile_stairs",
            () -> new StairsBlock(ModBlocks.TUFF_TILES.getDefaultState(),
                    keyedCopy(Blocks.TUFF)));
    public static final Block TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.TUFF)));
    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.TUFF)));
    public static final Block CRACKED_TUFF_TILES = registerBlock("cracked_tuff_tiles",
            () -> new Block(keyedCopy(Blocks.TUFF)));
    
    public static final Block PHANTOM_PRISMARINE_BRICKS = registerBlock("phantom_prismarine_bricks",
            () -> new Block(keyedCopy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_bricks_wall",
            () -> new WallBlock(keyedCopy(Blocks.PRISMARINE)));
    public static final Block CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            () -> new Block(keyedCopy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_TILES = registerBlock("prismarine_tiles",
            () -> new Block(keyedCopy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_TILE_STAIRS = registerBlock("prismarine_tile_stairs",
            () -> new StairsBlock(ModBlocks.PRISMARINE_TILES.getDefaultState(),
                    keyedCopy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_TILE_SLAB = registerBlock("prismarine_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_TILE_WALL = registerBlock("prismarine_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.PRISMARINE)));
    public static final Block CRACKED_PRISMARINE_TILES = registerBlock("cracked_prismarine_tiles",
            () -> new Block(keyedCopy(Blocks.PRISMARINE)));
    
    public static final Block PHANTOM_DARK_PRISMARINE = registerBlock("phantom_dark_prismarine",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICKS = registerBlock("dark_prismarine_bricks",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_STAIRS = registerBlock("dark_prismarine_brick_stairs",
            () -> new StairsBlock(ModBlocks.DARK_PRISMARINE_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_SLAB = registerBlock("dark_prismarine_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_WALL = registerBlock("dark_prismarine_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block CRACKED_DARK_PRISMARINE_BRICKS = registerBlock("cracked_dark_prismarine_bricks",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILES = registerBlock("dark_prismarine_tiles",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_STAIRS = registerBlock("dark_prismarine_tile_stairs",
            () -> new StairsBlock(ModBlocks.DARK_PRISMARINE_TILES.getDefaultState(),
                    keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_SLAB = registerBlock("dark_prismarine_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_WALL = registerBlock("dark_prismarine_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.DARK_PRISMARINE)));
    public static final Block CRACKED_DARK_PRISMARINE_TILES = registerBlock("cracked_dark_prismarine_tiles",
            () -> new Block(keyedCopy(Blocks.DARK_PRISMARINE)));
    
    public static final Block CUT_POLISHED_BASALT = registerBlock("cut_polished_basalt",
            () -> new Block(keyedCopy(Blocks.BASALT)));
    public static final Block CUT_POLISHED_BASALT_STAIRS = registerBlock("cut_polished_basalt_stairs",
            () -> new StairsBlock(ModBlocks.CUT_POLISHED_BASALT.getDefaultState(),
                    keyedCopy(Blocks.BASALT)));
    public static final Block CUT_POLISHED_BASALT_SLAB = registerBlock("cut_polished_basalt_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BASALT)));
    public static final Block CUT_POLISHED_BASALT_WALL = registerBlock("cut_polished_basalt_wall",
            () -> new WallBlock(keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            () -> new Block(keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            () -> new StairsBlock(ModBlocks.BASALT_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.BASALT)));
    public static final Block CRACKED_BASALT_BRICKS = registerBlock("cracked_basalt_bricks",
            () -> new Block(keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_TILES = registerBlock("basalt_tiles",
            () -> new Block(keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_TILE_STAIRS = registerBlock("basalt_tile_stairs",
            () -> new StairsBlock(ModBlocks.BASALT_TILES.getDefaultState(),
                    keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_TILE_SLAB = registerBlock("basalt_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BASALT)));
    public static final Block BASALT_TILE_WALL = registerBlock("basalt_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.BASALT)));
    public static final Block CRACKED_BASALT_TILES = registerBlock("cracked_basalt_tiles",
            () -> new Block(keyedCopy(Blocks.BASALT)));

    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            () -> new Block(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            () -> new StairsBlock(ModBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    keyedCopy(Blocks.BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.BLACKSTONE)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            () -> new Block(keyedCopy(Blocks.BLACKSTONE)));
    
    public static final Block PHANTOM_PURPUR_BLOCK = registerBlock("phantom_purpur_block",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs",
            () -> new StairsBlock(ModBlocks.PURPUR_BRICKS.getDefaultState(),
                    keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            () -> new WallBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block CRACKED_PURPUR_BRICKS = registerBlock("cracked_purpur_bricks",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TILES = registerBlock("purpur_tiles",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TILE_STAIRS = registerBlock("purpur_tile_stairs",
            () -> new StairsBlock(ModBlocks.PURPUR_TILES.getDefaultState(),
                    keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TILE_SLAB = registerBlock("purpur_tile_slab",
            () -> new SlabBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TILE_WALL = registerBlock("purpur_tile_wall",
            () -> new WallBlock(keyedCopy(Blocks.PURPUR_BLOCK)));
    public static final Block CRACKED_PURPUR_TILES = registerBlock("cracked_purpur_tiles",
            () -> new Block(keyedCopy(Blocks.PURPUR_BLOCK)));
    

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

    private static AbstractBlock.Settings keyedCreate() {
        return keyedSettings(AbstractBlock.Settings.create());
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

    public static void registerModBlocks() {
        BlockLust.LOGGER.info("Registering Mod Blocks for " + BlockLust.MOD_ID);
    }
}




