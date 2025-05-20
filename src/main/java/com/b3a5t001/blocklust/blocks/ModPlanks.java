package com.b3a5t001.blocklust.blocks;

import com.b3a5t001.blocklust.BlockLust;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModPlanks {

    public static final Block CACTUS_FRAME = registerBlock("cactus_frame",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.MANGROVE_ROOTS)
                    .nonOpaque().burnable()));
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CACTUS_STAIRS = registerBlock("cactus_stairs",
            new StairsBlock(ModPlanks.CACTUS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CACTUS_SLAB = registerBlock("cactus_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CACTUS_FENCE = registerBlock("cactus_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CACTUS_FENCE_GATE = registerBlock("cactus_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CACTUS_PRESSURE_PLATE = registerBlock("cactus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CACTUS_BUTTON = registerBlock("cactus_button",
            new ButtonBlock(BlockSetType.OAK, 20,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    public static final Block MOSSY_CACTUS_PLANKS = registerBlock("mossy_cactus_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CACTUS_STAIRS = registerBlock("mossy_cactus_stairs",
            new StairsBlock(ModPlanks.MOSSY_CACTUS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CACTUS_SLAB = registerBlock("mossy_cactus_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CACTUS_FENCE = registerBlock("mossy_cactus_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CACTUS_FENCE_GATE = registerBlock("mossy_cactus_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_OAK_PLANKS = registerBlock("mossy_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_OAK_STAIRS = registerBlock("mossy_oak_stairs",
            new StairsBlock(ModPlanks.MOSSY_OAK_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_OAK_SLAB = registerBlock("mossy_oak_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_OAK_FENCE = registerBlock("mossy_oak_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_OAK_FENCE_GATE = registerBlock("mossy_oak_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_BIRCH_PLANKS = registerBlock("mossy_birch_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BIRCH_STAIRS = registerBlock("mossy_birch_stairs",
            new StairsBlock(ModPlanks.MOSSY_BIRCH_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BIRCH_SLAB = registerBlock("mossy_birch_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BIRCH_FENCE = registerBlock("mossy_birch_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BIRCH_FENCE_GATE = registerBlock("mossy_birch_fence_gate",
            new FenceGateBlock(WoodType.BIRCH,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_JUNGLE_PLANKS = registerBlock("mossy_jungle_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_JUNGLE_STAIRS = registerBlock("mossy_jungle_stairs",
            new StairsBlock(ModPlanks.MOSSY_JUNGLE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_JUNGLE_SLAB = registerBlock("mossy_jungle_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_JUNGLE_FENCE = registerBlock("mossy_jungle_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_JUNGLE_FENCE_GATE = registerBlock("mossy_jungle_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_SPRUCE_PLANKS = registerBlock("mossy_spruce_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_SPRUCE_STAIRS = registerBlock("mossy_spruce_stairs",
            new StairsBlock(ModPlanks.MOSSY_SPRUCE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_SPRUCE_SLAB = registerBlock("mossy_spruce_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_SPRUCE_FENCE = registerBlock("mossy_spruce_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_SPRUCE_FENCE_GATE = registerBlock("mossy_spruce_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_BAMBOO_PLANKS = registerBlock("mossy_bamboo_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BAMBOO_STAIRS = registerBlock("mossy_bamboo_stairs",
            new StairsBlock(ModPlanks.MOSSY_BAMBOO_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BAMBOO_SLAB = registerBlock("mossy_bamboo_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BAMBOO_FENCE = registerBlock("mossy_bamboo_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BAMBOO_FENCE_GATE = registerBlock("mossy_bamboo_fence_gate",
            new FenceGateBlock(WoodType.BAMBOO,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_BAMBOO_MOSAIC = registerBlock("mossy_bamboo_mosaic",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BAMBOO_MOSAIC_STAIRS = registerBlock("mossy_bamboo_mosaic_stairs",
            new StairsBlock(ModPlanks.MOSSY_BAMBOO_MOSAIC.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_BAMBOO_MOSAIC_SLAB = registerBlock("mossy_bamboo_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_ACACIA_PLANKS = registerBlock("mossy_acacia_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_ACACIA_STAIRS = registerBlock("mossy_acacia_stairs",
            new StairsBlock(ModPlanks.MOSSY_ACACIA_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_ACACIA_SLAB = registerBlock("mossy_acacia_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_ACACIA_FENCE = registerBlock("mossy_acacia_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_ACACIA_FENCE_GATE = registerBlock("mossy_acacia_fence_gate",
            new FenceGateBlock(WoodType.ACACIA,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_MANGROVE_PLANKS = registerBlock("mossy_mangrove_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_MANGROVE_STAIRS = registerBlock("mossy_mangrove_stairs",
            new StairsBlock(ModPlanks.MOSSY_MANGROVE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_MANGROVE_SLAB = registerBlock("mossy_mangrove_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_MANGROVE_FENCE = registerBlock("mossy_mangrove_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_MANGROVE_FENCE_GATE = registerBlock("mossy_mangrove_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_CRIMSON_PLANKS = registerBlock("mossy_crimson_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CRIMSON_STAIRS = registerBlock("mossy_crimson_stairs",
            new StairsBlock(ModPlanks.MOSSY_CRIMSON_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CRIMSON_SLAB = registerBlock("mossy_crimson_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CRIMSON_FENCE = registerBlock("mossy_crimson_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CRIMSON_FENCE_GATE = registerBlock("mossy_crimson_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_WARPED_PLANKS = registerBlock("mossy_warped_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_WARPED_STAIRS = registerBlock("mossy_warped_stairs",
            new StairsBlock(ModPlanks.MOSSY_WARPED_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_WARPED_SLAB = registerBlock("mossy_warped_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_WARPED_FENCE = registerBlock("mossy_warped_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_WARPED_FENCE_GATE = registerBlock("mossy_warped_fence_gate",
            new FenceGateBlock(WoodType.WARPED,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_CHERRY_PLANKS = registerBlock("mossy_cherry_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CHERRY_STAIRS = registerBlock("mossy_cherry_stairs",
            new StairsBlock(ModPlanks.MOSSY_CHERRY_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CHERRY_SLAB = registerBlock("mossy_cherry_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CHERRY_FENCE = registerBlock("mossy_cherry_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_CHERRY_FENCE_GATE = registerBlock("mossy_cherry_fence_gate",
            new FenceGateBlock(WoodType.CHERRY,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block MOSSY_DARK_OAK_PLANKS = registerBlock("mossy_dark_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_DARK_OAK_STAIRS = registerBlock("mossy_dark_oak_stairs",
            new StairsBlock(ModPlanks.MOSSY_DARK_OAK_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_DARK_OAK_SLAB = registerBlock("mossy_dark_oak_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_DARK_OAK_FENCE = registerBlock("mossy_dark_oak_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MOSSY_DARK_OAK_FENCE_GATE = registerBlock("mossy_dark_oak_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK,
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD).burnable()));

    private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(BlockLust.MOD_ID, name), block);
}

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BlockLust.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModPlanks() {
        BlockLust.LOGGER.info("Registering Mod Blocks for " + BlockLust.MOD_ID);
    }
}

