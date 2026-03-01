package com.b3a5t001.blocklust.datagen;

import com.b3a5t001.blocklust.blocks.ModBlocks;
import com.b3a5t001.blocklust.blocks.ModMossBlocks;
import com.b3a5t001.blocklust.blocks.ModPlanks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool andesiteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        andesiteBricksPool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricksPool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricksPool.wall(ModBlocks.ANDESITE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyAndesiteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_ANDESITE_BRICKS);
        mossyAndesiteBricksPool.slab(ModMossBlocks.MOSSY_ANDESITE_BRICK_SLAB);
        mossyAndesiteBricksPool.stairs(ModMossBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
        mossyAndesiteBricksPool.wall(ModMossBlocks.MOSSY_ANDESITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool andesiteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_TILES);
        andesiteTilesPool.slab(ModBlocks.ANDESITE_TILE_SLAB);
        andesiteTilesPool.stairs(ModBlocks.ANDESITE_TILE_STAIRS);
        andesiteTilesPool.wall(ModBlocks.ANDESITE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyAndesiteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_ANDESITE_TILES);
        mossyAndesiteTilesPool.slab(ModMossBlocks.MOSSY_ANDESITE_TILE_SLAB);
        mossyAndesiteTilesPool.stairs(ModMossBlocks.MOSSY_ANDESITE_TILE_STAIRS);
        mossyAndesiteTilesPool.wall(ModMossBlocks.MOSSY_ANDESITE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ANDESITE_TILES);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ANDESITE);
        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool graniteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        graniteBricksPool.slab(ModBlocks.GRANITE_BRICK_SLAB);
        graniteBricksPool.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        graniteBricksPool.wall(ModBlocks.GRANITE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyGraniteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_GRANITE_BRICKS);
        mossyGraniteBricksPool.slab(ModMossBlocks.MOSSY_GRANITE_BRICK_SLAB);
        mossyGraniteBricksPool.stairs(ModMossBlocks.MOSSY_GRANITE_BRICK_STAIRS);
        mossyGraniteBricksPool.wall(ModMossBlocks.MOSSY_GRANITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool graniteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_TILES);
        graniteTilesPool.slab(ModBlocks.GRANITE_TILE_SLAB);
        graniteTilesPool.stairs(ModBlocks.GRANITE_TILE_STAIRS);
        graniteTilesPool.wall(ModBlocks.GRANITE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyGraniteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_GRANITE_TILES);
        mossyGraniteTilesPool.slab(ModMossBlocks.MOSSY_GRANITE_TILE_SLAB);
        mossyGraniteTilesPool.stairs(ModMossBlocks.MOSSY_GRANITE_TILE_STAIRS);
        mossyGraniteTilesPool.wall(ModMossBlocks.MOSSY_GRANITE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_GRANITE_TILES);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRANITE);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool dioriteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        dioriteBricksPool.slab(ModBlocks.DIORITE_BRICK_SLAB);
        dioriteBricksPool.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricksPool.wall(ModBlocks.DIORITE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDioriteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DIORITE_BRICKS);
        mossyDioriteBricksPool.slab(ModMossBlocks.MOSSY_DIORITE_BRICK_SLAB);
        mossyDioriteBricksPool.stairs(ModMossBlocks.MOSSY_DIORITE_BRICK_STAIRS);
        mossyDioriteBricksPool.wall(ModMossBlocks.MOSSY_DIORITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool dioriteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_TILES);
        dioriteTilesPool.slab(ModBlocks.DIORITE_TILE_SLAB);
        dioriteTilesPool.stairs(ModBlocks.DIORITE_TILE_STAIRS);
        dioriteTilesPool.wall(ModBlocks.DIORITE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDioriteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DIORITE_TILES);
        mossyDioriteTilesPool.slab(ModMossBlocks.MOSSY_DIORITE_TILE_SLAB);
        mossyDioriteTilesPool.stairs(ModMossBlocks.MOSSY_DIORITE_TILE_STAIRS);
        mossyDioriteTilesPool.wall(ModMossBlocks.MOSSY_DIORITE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DIORITE_TILES);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DIORITE);
        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothStonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STONE);
        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(ModBlocks.SMOOTH_STONE_WALL);
        BlockStateModelGenerator.BlockTexturePool stoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_TILES);
        stoneTilesPool.slab(ModBlocks.STONE_TILE_SLAB);
        stoneTilesPool.stairs(ModBlocks.STONE_TILE_STAIRS);
        stoneTilesPool.wall(ModBlocks.STONE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyStoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_STONE_TILES);
        mossyStoneTilesPool.slab(ModMossBlocks.MOSSY_STONE_TILE_SLAB);
        mossyStoneTilesPool.stairs(ModMossBlocks.MOSSY_STONE_TILE_STAIRS);
        mossyStoneTilesPool.wall(ModMossBlocks.MOSSY_STONE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool stonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        stonePool.wall(ModBlocks.STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool calcitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CALCITE);
        polishedCalcitePool.slab(ModBlocks.POLISHED_CALCITE_SLAB);
        polishedCalcitePool.stairs(ModBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.wall(ModBlocks.POLISHED_CALCITE_WALL);
        BlockStateModelGenerator.BlockTexturePool calciteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        calciteBricksPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBricksPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBricksPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyCalciteBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_CALCITE_BRICKS);
        mossyCalciteBricksPool.slab(ModMossBlocks.MOSSY_CALCITE_BRICK_SLAB);
        mossyCalciteBricksPool.stairs(ModMossBlocks.MOSSY_CALCITE_BRICK_STAIRS);
        mossyCalciteBricksPool.wall(ModMossBlocks.MOSSY_CALCITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool calciteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_TILES);
        calciteTilesPool.slab(ModBlocks.CALCITE_TILE_SLAB);
        calciteTilesPool.stairs(ModBlocks.CALCITE_TILE_STAIRS);
        calciteTilesPool.wall(ModBlocks.CALCITE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyCalciteTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_CALCITE_TILES);
        mossyCalciteTilesPool.slab(ModMossBlocks.MOSSY_CALCITE_TILE_SLAB);
        mossyCalciteTilesPool.stairs(ModMossBlocks.MOSSY_CALCITE_TILE_STAIRS);
        mossyCalciteTilesPool.wall(ModMossBlocks.MOSSY_CALCITE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CALCITE_TILES);
        
        BlockStateModelGenerator.BlockTexturePool netherrackPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHERRACK);
        netherrackPool.wall(ModBlocks.NETHERRACK_WALL);
        netherrackPool.stairs(ModBlocks.NETHERRACK_STAIRS);
        netherrackPool.slab(ModBlocks.NETHERRACK_SLAB);
        BlockStateModelGenerator.BlockTexturePool polishedNetherrackPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_NETHERRACK);
        polishedNetherrackPool.slab(ModBlocks.POLISHED_NETHERRACK_SLAB);
        polishedNetherrackPool.stairs(ModBlocks.POLISHED_NETHERRACK_STAIRS);
        polishedNetherrackPool.wall(ModBlocks.POLISHED_NETHERRACK_WALL);
        BlockStateModelGenerator.BlockTexturePool netherrackBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHERRACK_BRICKS);
        netherrackBricksPool.slab(ModBlocks.NETHERRACK_BRICK_SLAB);
        netherrackBricksPool.stairs(ModBlocks.NETHERRACK_BRICK_STAIRS);
        netherrackBricksPool.wall(ModBlocks.NETHERRACK_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyNetherrackBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_NETHERRACK_BRICKS);
        mossyNetherrackBricksPool.slab(ModMossBlocks.MOSSY_NETHERRACK_BRICK_SLAB);
        mossyNetherrackBricksPool.stairs(ModMossBlocks.MOSSY_NETHERRACK_BRICK_STAIRS);
        mossyNetherrackBricksPool.wall(ModMossBlocks.MOSSY_NETHERRACK_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_NETHERRACK_BRICKS);
        BlockStateModelGenerator.BlockTexturePool netherrackTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHERRACK_TILES);
        netherrackTilesPool.slab(ModBlocks.NETHERRACK_TILE_SLAB);
        netherrackTilesPool.stairs(ModBlocks.NETHERRACK_TILE_STAIRS);
        netherrackTilesPool.wall(ModBlocks.NETHERRACK_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyNetherrackTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_NETHERRACK_TILES);
        mossyNetherrackTilesPool.slab(ModMossBlocks.MOSSY_NETHERRACK_TILE_SLAB);
        mossyNetherrackTilesPool.stairs(ModMossBlocks.MOSSY_NETHERRACK_TILE_STAIRS);
        mossyNetherrackTilesPool.wall(ModMossBlocks.MOSSY_NETHERRACK_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_NETHERRACK_TILES);
        
        BlockStateModelGenerator.BlockTexturePool endStonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE);
        endStonePool.wall(ModBlocks.END_STONE_WALL);
        endStonePool.stairs(ModBlocks.END_STONE_STAIRS);
        endStonePool.slab(ModBlocks.END_STONE_SLAB);
        BlockStateModelGenerator.BlockTexturePool mossyEndStoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_END_STONE_BRICKS);
        mossyEndStoneBricksPool.slab(ModMossBlocks.MOSSY_END_STONE_BRICK_SLAB);
        mossyEndStoneBricksPool.stairs(ModMossBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        mossyEndStoneBricksPool.wall(ModMossBlocks.MOSSY_END_STONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_END_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool endStoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE_TILES);
        endStoneTilesPool.slab(ModBlocks.END_STONE_TILE_SLAB);
        endStoneTilesPool.stairs(ModBlocks.END_STONE_TILE_STAIRS);
        endStoneTilesPool.wall(ModBlocks.END_STONE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyEndStoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_END_STONE_TILES);
        mossyEndStoneTilesPool.slab(ModMossBlocks.MOSSY_END_STONE_TILE_SLAB);
        mossyEndStoneTilesPool.stairs(ModMossBlocks.MOSSY_END_STONE_TILE_STAIRS);
        mossyEndStoneTilesPool.wall(ModMossBlocks.MOSSY_END_STONE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_END_STONE_TILES);
        
        BlockStateModelGenerator.BlockTexturePool quartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ);
        quartzPool.wall(ModBlocks.QUARTZ_WALL);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_QUARTZ);
        smoothQuartzPool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
        BlockStateModelGenerator.BlockTexturePool quartzBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_BRICKS);
        quartzBricksPool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        quartzBricksPool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBricksPool.wall(ModBlocks.QUARTZ_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyQuartzBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_QUARTZ_BRICKS);
        mossyQuartzBricksPool.slab(ModMossBlocks.MOSSY_QUARTZ_BRICK_SLAB);
        mossyQuartzBricksPool.stairs(ModMossBlocks.MOSSY_QUARTZ_BRICK_STAIRS);
        mossyQuartzBricksPool.wall(ModMossBlocks.MOSSY_QUARTZ_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_TILES);
        quartzTilesPool.slab(ModBlocks.QUARTZ_TILE_SLAB);
        quartzTilesPool.stairs(ModBlocks.QUARTZ_TILE_STAIRS);
        quartzTilesPool.wall(ModBlocks.QUARTZ_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyQuartzTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_QUARTZ_TILES);
        mossyQuartzTilesPool.slab(ModMossBlocks.MOSSY_QUARTZ_TILE_SLAB);
        mossyQuartzTilesPool.stairs(ModMossBlocks.MOSSY_QUARTZ_TILE_STAIRS);
        mossyQuartzTilesPool.wall(ModMossBlocks.MOSSY_QUARTZ_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_QUARTZ_TILES);

        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_PRISMARINE);
        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        BlockStateModelGenerator.BlockTexturePool darkPrismarineBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_PRISMARINE_BRICKS);
        darkPrismarineBricksPool.slab(ModBlocks.DARK_PRISMARINE_BRICK_SLAB);
        darkPrismarineBricksPool.stairs(ModBlocks.DARK_PRISMARINE_BRICK_STAIRS);
        darkPrismarineBricksPool.wall(ModBlocks.DARK_PRISMARINE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDarkPrismarineBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS);
        mossyDarkPrismarineBricksPool.slab(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_SLAB);
        mossyDarkPrismarineBricksPool.stairs(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_STAIRS);
        mossyDarkPrismarineBricksPool.wall(ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DARK_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkPrismarineTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_PRISMARINE_TILES);
        darkPrismarineTilesPool.slab(ModBlocks.DARK_PRISMARINE_TILE_SLAB);
        darkPrismarineTilesPool.stairs(ModBlocks.DARK_PRISMARINE_TILE_STAIRS);
        darkPrismarineTilesPool.wall(ModBlocks.DARK_PRISMARINE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDarkPrismarineTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES);
        mossyDarkPrismarineTilesPool.slab(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_SLAB);
        mossyDarkPrismarineTilesPool.stairs(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_STAIRS);
        mossyDarkPrismarineTilesPool.wall(ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DARK_PRISMARINE_TILES);
        
        BlockStateModelGenerator.BlockTexturePool dripstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE);
        dripstonePool.wall(ModBlocks.DRIPSTONE_WALL);
        dripstonePool.stairs(ModBlocks.DRIPSTONE_STAIRS);
        dripstonePool.slab(ModBlocks.DRIPSTONE_SLAB);
        BlockStateModelGenerator.BlockTexturePool polishedDripstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRIPSTONE);
        polishedDripstonePool.slab(ModBlocks.POLISHED_DRIPSTONE_SLAB);
        polishedDripstonePool.stairs(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        polishedDripstonePool.wall(ModBlocks.POLISHED_DRIPSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool dripstoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_BRICKS);
        dripstoneBricksPool.slab(ModBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBricksPool.stairs(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        dripstoneBricksPool.wall(ModBlocks.DRIPSTONE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDripstoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DRIPSTONE_BRICKS);
        mossyDripstoneBricksPool.slab(ModMossBlocks.MOSSY_DRIPSTONE_BRICK_SLAB);
        mossyDripstoneBricksPool.stairs(ModMossBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS);
        mossyDripstoneBricksPool.wall(ModMossBlocks.MOSSY_DRIPSTONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DRIPSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool dripstoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_TILES);
        dripstoneTilesPool.slab(ModBlocks.DRIPSTONE_TILE_SLAB);
        dripstoneTilesPool.stairs(ModBlocks.DRIPSTONE_TILE_STAIRS);
        dripstoneTilesPool.wall(ModBlocks.DRIPSTONE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDripstoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DRIPSTONE_TILES);
        mossyDripstoneTilesPool.slab(ModMossBlocks.MOSSY_DRIPSTONE_TILE_SLAB);
        mossyDripstoneTilesPool.stairs(ModMossBlocks.MOSSY_DRIPSTONE_TILE_STAIRS);
        mossyDripstoneTilesPool.wall(ModMossBlocks.MOSSY_DRIPSTONE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DRIPSTONE_TILES);
        
        BlockStateModelGenerator.BlockTexturePool purpurPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPUR_BLOCK);
        purpurPool.wall(ModBlocks.PURPUR_WALL);
        BlockStateModelGenerator.BlockTexturePool purpurBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPUR_BRICKS);
        purpurBricksPool.slab(ModBlocks.PURPUR_BRICK_SLAB);
        purpurBricksPool.stairs(ModBlocks.PURPUR_BRICK_STAIRS);
        purpurBricksPool.wall(ModBlocks.PURPUR_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyPurpurBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_PURPUR_BRICKS);
        mossyPurpurBricksPool.slab(ModMossBlocks.MOSSY_PURPUR_BRICK_SLAB);
        mossyPurpurBricksPool.stairs(ModMossBlocks.MOSSY_PURPUR_BRICK_STAIRS);
        mossyPurpurBricksPool.wall(ModMossBlocks.MOSSY_PURPUR_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_PURPUR_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpurTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPUR_TILES);
        purpurTilesPool.slab(ModBlocks.PURPUR_TILE_SLAB);
        purpurTilesPool.stairs(ModBlocks.PURPUR_TILE_STAIRS);
        purpurTilesPool.wall(ModBlocks.PURPUR_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyPurpurTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_PURPUR_TILES);
        mossyPurpurTilesPool.slab(ModMossBlocks.MOSSY_PURPUR_TILE_SLAB);
        mossyPurpurTilesPool.stairs(ModMossBlocks.MOSSY_PURPUR_TILE_STAIRS);
        mossyPurpurTilesPool.wall(ModMossBlocks.MOSSY_PURPUR_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_PURPUR_TILES);
        
        BlockStateModelGenerator.BlockTexturePool mossyPolishedBlackstoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        mossyPolishedBlackstoneBricksPool.slab(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
        mossyPolishedBlackstoneBricksPool.stairs(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
        mossyPolishedBlackstoneBricksPool.wall(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedBlackstoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BLACKSTONE_TILES);
        polishedBlackstoneTilesPool.slab(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        polishedBlackstoneTilesPool.stairs(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        polishedBlackstoneTilesPool.wall(ModBlocks.POLISHED_BLACKSTONE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedBlackstoneTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);
        mossyPolishedBlackstoneTilesPool.slab(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_SLAB);
        mossyPolishedBlackstoneTilesPool.stairs(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_STAIRS);
        mossyPolishedBlackstoneTilesPool.wall(ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        
        BlockStateModelGenerator.BlockTexturePool cactusPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.CACTUS_PLANKS);
        cactusPool.slab(ModPlanks.CACTUS_SLAB);
        cactusPool.stairs(ModPlanks.CACTUS_STAIRS);
        cactusPool.fence(ModPlanks.CACTUS_FENCE);
        cactusPool.fenceGate(ModPlanks.CACTUS_FENCE_GATE);
        cactusPool.button(ModPlanks.CACTUS_BUTTON);
        cactusPool.pressurePlate(ModPlanks.CACTUS_PRESSURE_PLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModPlanks.CACTUS_FRAME);
        blockStateModelGenerator.registerDoor(ModPlanks.CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModPlanks.CACTUS_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool mossyCactusPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_CACTUS_PLANKS);
        mossyCactusPool.slab(ModPlanks.MOSSY_CACTUS_SLAB);
        mossyCactusPool.stairs(ModPlanks.MOSSY_CACTUS_STAIRS);
        mossyCactusPool.fence(ModPlanks.MOSSY_CACTUS_FENCE);
        mossyCactusPool.fenceGate(ModPlanks.MOSSY_CACTUS_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyAcaciaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_ACACIA_PLANKS);
        mossyAcaciaPool.slab(ModPlanks.MOSSY_ACACIA_SLAB);
        mossyAcaciaPool.stairs(ModPlanks.MOSSY_ACACIA_STAIRS);
        mossyAcaciaPool.fence(ModPlanks.MOSSY_ACACIA_FENCE);
        mossyAcaciaPool.fenceGate(ModPlanks.MOSSY_ACACIA_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyBambooPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_BAMBOO_PLANKS);
        mossyBambooPool.slab(ModPlanks.MOSSY_BAMBOO_SLAB);
        mossyBambooPool.stairs(ModPlanks.MOSSY_BAMBOO_STAIRS);
        mossyBambooPool.fence(ModPlanks.MOSSY_BAMBOO_FENCE);
        mossyBambooPool.fenceGate(ModPlanks.MOSSY_BAMBOO_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyBambooMosaicPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_BAMBOO_MOSAIC);
        mossyBambooMosaicPool.slab(ModPlanks.MOSSY_BAMBOO_MOSAIC_SLAB);
        mossyBambooMosaicPool.stairs(ModPlanks.MOSSY_BAMBOO_MOSAIC_STAIRS);

        BlockStateModelGenerator.BlockTexturePool mossyBirchPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_BIRCH_PLANKS);
        mossyBirchPool.slab(ModPlanks.MOSSY_BIRCH_SLAB);
        mossyBirchPool.stairs(ModPlanks.MOSSY_BIRCH_STAIRS);
        mossyBirchPool.fence(ModPlanks.MOSSY_BIRCH_FENCE);
        mossyBirchPool.fenceGate(ModPlanks.MOSSY_BIRCH_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyCherryPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_CHERRY_PLANKS);
        mossyCherryPool.slab(ModPlanks.MOSSY_CHERRY_SLAB);
        mossyCherryPool.stairs(ModPlanks.MOSSY_CHERRY_STAIRS);
        mossyCherryPool.fence(ModPlanks.MOSSY_CHERRY_FENCE);
        mossyCherryPool.fenceGate(ModPlanks.MOSSY_CHERRY_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyCrimsonPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_CRIMSON_PLANKS);
        mossyCrimsonPool.slab(ModPlanks.MOSSY_CRIMSON_SLAB);
        mossyCrimsonPool.stairs(ModPlanks.MOSSY_CRIMSON_STAIRS);
        mossyCrimsonPool.fence(ModPlanks.MOSSY_CRIMSON_FENCE);
        mossyCrimsonPool.fenceGate(ModPlanks.MOSSY_CRIMSON_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyDarkOakPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_DARK_OAK_PLANKS);
        mossyDarkOakPool.slab(ModPlanks.MOSSY_DARK_OAK_SLAB);
        mossyDarkOakPool.stairs(ModPlanks.MOSSY_DARK_OAK_STAIRS);
        mossyDarkOakPool.fence(ModPlanks.MOSSY_DARK_OAK_FENCE);
        mossyDarkOakPool.fenceGate(ModPlanks.MOSSY_DARK_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyJunglePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_JUNGLE_PLANKS);
        mossyJunglePool.slab(ModPlanks.MOSSY_JUNGLE_SLAB);
        mossyJunglePool.stairs(ModPlanks.MOSSY_JUNGLE_STAIRS);
        mossyJunglePool.fence(ModPlanks.MOSSY_JUNGLE_FENCE);
        mossyJunglePool.fenceGate(ModPlanks.MOSSY_JUNGLE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyMangrovePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_MANGROVE_PLANKS);
        mossyMangrovePool.slab(ModPlanks.MOSSY_MANGROVE_SLAB);
        mossyMangrovePool.stairs(ModPlanks.MOSSY_MANGROVE_STAIRS);
        mossyMangrovePool.fence(ModPlanks.MOSSY_MANGROVE_FENCE);
        mossyMangrovePool.fenceGate(ModPlanks.MOSSY_MANGROVE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossySprucePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_SPRUCE_PLANKS);
        mossySprucePool.slab(ModPlanks.MOSSY_SPRUCE_SLAB);
        mossySprucePool.stairs(ModPlanks.MOSSY_SPRUCE_STAIRS);
        mossySprucePool.fence(ModPlanks.MOSSY_SPRUCE_FENCE);
        mossySprucePool.fenceGate(ModPlanks.MOSSY_SPRUCE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyOakPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_OAK_PLANKS);
        mossyOakPool.slab(ModPlanks.MOSSY_OAK_SLAB);
        mossyOakPool.stairs(ModPlanks.MOSSY_OAK_STAIRS);
        mossyOakPool.fence(ModPlanks.MOSSY_OAK_FENCE);
        mossyOakPool.fenceGate(ModPlanks.MOSSY_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyWarpedPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModPlanks.MOSSY_WARPED_PLANKS);
        mossyWarpedPool.slab(ModPlanks.MOSSY_WARPED_SLAB);
        mossyWarpedPool.stairs(ModPlanks.MOSSY_WARPED_STAIRS);
        mossyWarpedPool.fence(ModPlanks.MOSSY_WARPED_FENCE);
        mossyWarpedPool.fenceGate(ModPlanks.MOSSY_WARPED_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_BRICKS);
        mossyBricksPool.slab(ModMossBlocks.MOSSY_BRICK_SLAB);
        mossyBricksPool.stairs(ModMossBlocks.MOSSY_BRICK_STAIRS);
        mossyBricksPool.wall(ModMossBlocks.MOSSY_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyNetherBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_NETHER_BRICKS);
        mossyNetherBricksPool.slab(ModMossBlocks.MOSSY_NETHER_BRICK_SLAB);
        mossyNetherBricksPool.stairs(ModMossBlocks.MOSSY_NETHER_BRICK_STAIRS);
        mossyNetherBricksPool.wall(ModMossBlocks.MOSSY_NETHER_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyRedNetherBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_RED_NETHER_BRICKS);
        mossyRedNetherBricksPool.slab(ModMossBlocks.MOSSY_RED_NETHER_BRICK_SLAB);
        mossyRedNetherBricksPool.stairs(ModMossBlocks.MOSSY_RED_NETHER_BRICK_STAIRS);
        mossyRedNetherBricksPool.wall(ModMossBlocks.MOSSY_RED_NETHER_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_RED_NETHER_BRICKS);

        BlockStateModelGenerator.BlockTexturePool mossyMudBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_MUD_BRICKS);
        mossyMudBricksPool.slab(ModMossBlocks.MOSSY_MUD_BRICK_SLAB);
        mossyMudBricksPool.stairs(ModMossBlocks.MOSSY_MUD_BRICK_STAIRS);
        mossyMudBricksPool.wall(ModMossBlocks.MOSSY_MUD_BRICK_WALL);
        
        BlockStateModelGenerator.BlockTexturePool cutPolishedBasaltPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_POLISHED_BASALT);
        cutPolishedBasaltPool.slab(ModBlocks.CUT_POLISHED_BASALT_SLAB);
        cutPolishedBasaltPool.stairs(ModBlocks.CUT_POLISHED_BASALT_STAIRS);
        cutPolishedBasaltPool.wall(ModBlocks.CUT_POLISHED_BASALT_WALL);
        BlockStateModelGenerator.BlockTexturePool basaltBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BASALT_BRICKS);
        basaltBricksPool.slab(ModBlocks.BASALT_BRICK_SLAB);
        basaltBricksPool.stairs(ModBlocks.BASALT_BRICK_STAIRS);
        basaltBricksPool.wall(ModBlocks.BASALT_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyBasaltBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_BASALT_BRICKS);
        mossyBasaltBricksPool.slab(ModMossBlocks.MOSSY_BASALT_BRICK_SLAB);
        mossyBasaltBricksPool.stairs(ModMossBlocks.MOSSY_BASALT_BRICK_STAIRS);
        mossyBasaltBricksPool.wall(ModMossBlocks.MOSSY_BASALT_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BASALT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool basaltTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BASALT_TILES);
        basaltTilesPool.slab(ModBlocks.BASALT_TILE_SLAB);
        basaltTilesPool.stairs(ModBlocks.BASALT_TILE_STAIRS);
        basaltTilesPool.wall(ModBlocks.BASALT_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyBasaltTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_BASALT_TILES);
        mossyBasaltTilesPool.slab(ModMossBlocks.MOSSY_BASALT_TILE_SLAB);
        mossyBasaltTilesPool.stairs(ModMossBlocks.MOSSY_BASALT_TILE_STAIRS);
        mossyBasaltTilesPool.wall(ModMossBlocks.MOSSY_BASALT_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BASALT_TILES);

        BlockStateModelGenerator.BlockTexturePool mossyDeepslateBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DEEPSLATE_BRICKS);
        mossyDeepslateBricksPool.slab(ModMossBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
        mossyDeepslateBricksPool.stairs(ModMossBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossyDeepslateBricksPool.wall(ModMossBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyDeepslateTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_DEEPSLATE_TILES);
        mossyDeepslateTilesPool.slab(ModMossBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
        mossyDeepslateTilesPool.stairs(ModMossBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
        mossyDeepslateTilesPool.wall(ModMossBlocks.MOSSY_DEEPSLATE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyTuffBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_TUFF_BRICKS);
        mossyTuffBricksPool.slab(ModMossBlocks.MOSSY_TUFF_BRICK_SLAB);
        mossyTuffBricksPool.stairs(ModMossBlocks.MOSSY_TUFF_BRICK_STAIRS);
        mossyTuffBricksPool.wall(ModMossBlocks.MOSSY_TUFF_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_TUFF_BRICKS);
        BlockStateModelGenerator.BlockTexturePool tuffTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TUFF_TILES);
        tuffTilesPool.slab(ModBlocks.TUFF_TILE_SLAB);
        tuffTilesPool.stairs(ModBlocks.TUFF_TILE_STAIRS);
        tuffTilesPool.wall(ModBlocks.TUFF_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyTuffTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_TUFF_TILES);
        mossyTuffTilesPool.slab(ModMossBlocks.MOSSY_TUFF_TILE_SLAB);
        mossyTuffTilesPool.stairs(ModMossBlocks.MOSSY_TUFF_TILE_STAIRS);
        mossyTuffTilesPool.wall(ModMossBlocks.MOSSY_TUFF_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_TUFF_TILES);

        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_BRICKS);
        prismarineBrickPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyPrismarineBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_PRISMARINE_BRICKS);
        mossyPrismarineBricksPool.slab(ModMossBlocks.MOSSY_PRISMARINE_BRICK_SLAB);
        mossyPrismarineBricksPool.stairs(ModMossBlocks.MOSSY_PRISMARINE_BRICK_STAIRS);
        mossyPrismarineBricksPool.wall(ModMossBlocks.MOSSY_PRISMARINE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool prismarineTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_TILES);
        prismarineTilesPool.slab(ModBlocks.PRISMARINE_TILE_SLAB);
        prismarineTilesPool.stairs(ModBlocks.PRISMARINE_TILE_STAIRS);
        prismarineTilesPool.wall(ModBlocks.PRISMARINE_TILE_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyPrismarineTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModMossBlocks.MOSSY_PRISMARINE_TILES);
        mossyPrismarineTilesPool.slab(ModMossBlocks.MOSSY_PRISMARINE_TILE_SLAB);
        mossyPrismarineTilesPool.stairs(ModMossBlocks.MOSSY_PRISMARINE_TILE_STAIRS);
        mossyPrismarineTilesPool.wall(ModMossBlocks.MOSSY_PRISMARINE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_PRISMARINE_TILES);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BASALT_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BASALT_QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACKSTONE_QUARTZ_ORE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
