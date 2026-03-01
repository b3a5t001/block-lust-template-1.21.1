package com.b3a5t001.blocklust.datagen.recipeproviders;

import com.b3a5t001.blocklust.datagen.ModRecipeProvider;
import com.b3a5t001.blocklust.blocks.ModBlocks;
import com.b3a5t001.blocklust.blocks.ModMossBlocks;
import com.b3a5t001.blocklust.util.ModItemTags;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;


public class MossyStoneCraftingRecipes extends RecipeGenerator {
    public MossyStoneCraftingRecipes(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate(){

        createShapeless(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_ANDESITE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.ANDESITE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_andesite_bricks",conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModMossBlocks.MOSSY_ANDESITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_ANDESITE_BRICK_WALL, ModMossBlocks.MOSSY_ANDESITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModMossBlocks.MOSSY_ANDESITE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_ANDESITE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.ANDESITE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_andesite_tiles",conditionsFromItem(ModBlocks.ANDESITE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_ANDESITE_TILE_SLAB, ModMossBlocks.MOSSY_ANDESITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_ANDESITE_TILE_WALL, ModMossBlocks.MOSSY_ANDESITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_ANDESITE_TILE_STAIRS, ModMossBlocks.MOSSY_ANDESITE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_GRANITE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.GRANITE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_granite_bricks",conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_GRANITE_BRICK_SLAB, ModMossBlocks.MOSSY_GRANITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_GRANITE_BRICK_WALL, ModMossBlocks.MOSSY_GRANITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModMossBlocks.MOSSY_GRANITE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_GRANITE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.GRANITE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_granite_tiles",conditionsFromItem(ModBlocks.GRANITE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_GRANITE_TILE_SLAB, ModMossBlocks.MOSSY_GRANITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_GRANITE_TILE_WALL, ModMossBlocks.MOSSY_GRANITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_GRANITE_TILE_STAIRS, ModMossBlocks.MOSSY_GRANITE_TILES);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DIORITE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.DIORITE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_diorite_bricks",conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DIORITE_BRICK_SLAB, ModMossBlocks.MOSSY_DIORITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DIORITE_BRICK_WALL, ModMossBlocks.MOSSY_DIORITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModMossBlocks.MOSSY_DIORITE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DIORITE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.DIORITE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_diorite_tiles",conditionsFromItem(ModBlocks.DIORITE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DIORITE_TILE_SLAB, ModMossBlocks.MOSSY_DIORITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DIORITE_TILE_WALL, ModMossBlocks.MOSSY_DIORITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DIORITE_TILE_STAIRS, ModMossBlocks.MOSSY_DIORITE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_STONE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.STONE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_stone_tiles",conditionsFromItem(ModBlocks.STONE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_STONE_TILE_SLAB, ModMossBlocks.MOSSY_STONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_STONE_TILE_WALL, ModMossBlocks.MOSSY_STONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_STONE_TILE_STAIRS, ModMossBlocks.MOSSY_STONE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_CALCITE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.CALCITE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_calcite_bricks",conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_CALCITE_BRICK_SLAB, ModMossBlocks.MOSSY_CALCITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_CALCITE_BRICK_WALL, ModMossBlocks.MOSSY_CALCITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_CALCITE_BRICK_STAIRS, ModMossBlocks.MOSSY_CALCITE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_CALCITE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.CALCITE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_calcite_tiles",conditionsFromItem(ModBlocks.CALCITE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_CALCITE_TILE_SLAB, ModMossBlocks.MOSSY_CALCITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_CALCITE_TILE_WALL, ModMossBlocks.MOSSY_CALCITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_CALCITE_TILE_STAIRS, ModMossBlocks.MOSSY_CALCITE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHERRACK_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.NETHERRACK_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_netherrack_bricks",conditionsFromItem(ModBlocks.NETHERRACK_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_NETHERRACK_BRICK_SLAB, ModMossBlocks.MOSSY_NETHERRACK_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHERRACK_BRICK_WALL, ModMossBlocks.MOSSY_NETHERRACK_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_NETHERRACK_BRICK_STAIRS, ModMossBlocks.MOSSY_NETHERRACK_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHERRACK_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.NETHERRACK_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_netherrack_tiles",conditionsFromItem(ModBlocks.NETHERRACK_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_NETHERRACK_TILE_SLAB, ModMossBlocks.MOSSY_NETHERRACK_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHERRACK_TILE_WALL, ModMossBlocks.MOSSY_NETHERRACK_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_NETHERRACK_TILE_STAIRS, ModMossBlocks.MOSSY_NETHERRACK_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_END_STONE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.END_STONE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_end_stone_bricks",conditionsFromItem(Items.END_STONE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_END_STONE_BRICK_SLAB, ModMossBlocks.MOSSY_END_STONE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_END_STONE_BRICK_WALL, ModMossBlocks.MOSSY_END_STONE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_END_STONE_BRICK_STAIRS, ModMossBlocks.MOSSY_END_STONE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_END_STONE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.END_STONE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_end_stone_tiles",conditionsFromItem(ModBlocks.END_STONE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_END_STONE_TILE_SLAB, ModMossBlocks.MOSSY_END_STONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_END_STONE_TILE_WALL, ModMossBlocks.MOSSY_END_STONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_END_STONE_TILE_STAIRS, ModMossBlocks.MOSSY_END_STONE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_QUARTZ_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.QUARTZ_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_quartz_bricks",conditionsFromItem(Items.QUARTZ_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_QUARTZ_BRICK_SLAB, ModMossBlocks.MOSSY_QUARTZ_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_QUARTZ_BRICK_WALL, ModMossBlocks.MOSSY_QUARTZ_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_QUARTZ_BRICK_STAIRS, ModMossBlocks.MOSSY_QUARTZ_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_QUARTZ_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.QUARTZ_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_quartz_tiles",conditionsFromItem(ModBlocks.QUARTZ_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_QUARTZ_TILE_SLAB, ModMossBlocks.MOSSY_QUARTZ_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_QUARTZ_TILE_WALL, ModMossBlocks.MOSSY_QUARTZ_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_QUARTZ_TILE_STAIRS, ModMossBlocks.MOSSY_QUARTZ_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PURPUR_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.PURPUR_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_purpur_bricks",conditionsFromItem(ModBlocks.PURPUR_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_PURPUR_BRICK_SLAB, ModMossBlocks.MOSSY_PURPUR_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PURPUR_BRICK_WALL, ModMossBlocks.MOSSY_PURPUR_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_PURPUR_BRICK_STAIRS, ModMossBlocks.MOSSY_PURPUR_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PURPUR_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.PURPUR_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_purpur_tiles",conditionsFromItem(ModBlocks.PURPUR_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_PURPUR_TILE_SLAB, ModMossBlocks.MOSSY_PURPUR_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PURPUR_TILE_WALL, ModMossBlocks.MOSSY_PURPUR_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_PURPUR_TILE_STAIRS, ModMossBlocks.MOSSY_PURPUR_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.DARK_PRISMARINE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_dark_prismarine_bricks",conditionsFromItem(ModBlocks.DARK_PRISMARINE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_SLAB, ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_WALL, ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICK_STAIRS, ModMossBlocks.MOSSY_DARK_PRISMARINE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.DARK_PRISMARINE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_dark_prismarine_tiles",conditionsFromItem(ModBlocks.DARK_PRISMARINE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_SLAB, ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_WALL, ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DARK_PRISMARINE_TILE_STAIRS, ModMossBlocks.MOSSY_DARK_PRISMARINE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DRIPSTONE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.DRIPSTONE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_dripstone_bricks",conditionsFromItem(ModBlocks.DRIPSTONE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DRIPSTONE_BRICK_SLAB, ModMossBlocks.MOSSY_DRIPSTONE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DRIPSTONE_BRICK_WALL, ModMossBlocks.MOSSY_DRIPSTONE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DRIPSTONE_BRICK_STAIRS, ModMossBlocks.MOSSY_DRIPSTONE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DRIPSTONE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.DRIPSTONE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_dripstone_tiles",conditionsFromItem(ModBlocks.DRIPSTONE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DRIPSTONE_TILE_SLAB, ModMossBlocks.MOSSY_DRIPSTONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DRIPSTONE_TILE_WALL, ModMossBlocks.MOSSY_DRIPSTONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DRIPSTONE_TILE_STAIRS, ModMossBlocks.MOSSY_DRIPSTONE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_bricks",conditionsFromItem(Items.BRICKS))
                .offerTo(exporter);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BRICK_WALL,ModMossBlocks.MOSSY_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BRICK_SLAB,ModMossBlocks.MOSSY_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_BRICK_STAIRS, ModMossBlocks.MOSSY_BRICKS);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHER_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.NETHER_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_nether_bricks",conditionsFromItem(Items.NETHER_BRICKS))
                .offerTo(exporter);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHER_BRICK_WALL,ModMossBlocks.MOSSY_NETHER_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_NETHER_BRICK_SLAB,ModMossBlocks.MOSSY_NETHER_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_NETHER_BRICK_STAIRS, ModMossBlocks.MOSSY_NETHER_BRICKS);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_RED_NETHER_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.RED_NETHER_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_nether_bricks",conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_RED_NETHER_BRICK_WALL,ModMossBlocks.MOSSY_NETHER_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_RED_NETHER_BRICK_SLAB,ModMossBlocks.MOSSY_NETHER_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_RED_NETHER_BRICK_STAIRS, ModMossBlocks.MOSSY_RED_NETHER_BRICKS);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_MUD_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.MUD_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_mud_bricks",conditionsFromItem(Items.MUD_BRICKS))
                .offerTo(exporter);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_MUD_BRICK_WALL,ModMossBlocks.MOSSY_MUD_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_MUD_BRICK_SLAB,ModMossBlocks.MOSSY_MUD_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_MUD_BRICK_STAIRS, ModMossBlocks.MOSSY_MUD_BRICKS);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.POLISHED_BLACKSTONE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_polished_blackstone_bricks",conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.POLISHED_BLACKSTONE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_polished_blackstone_tiles",conditionsFromItem(ModBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_SLAB, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_WALL, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILE_STAIRS, ModMossBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BASALT_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.BASALT_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_basalt_bricks",conditionsFromItem(ModBlocks.BASALT_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_BASALT_BRICK_SLAB, ModMossBlocks.MOSSY_BASALT_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BASALT_BRICK_WALL, ModMossBlocks.MOSSY_BASALT_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_BASALT_BRICK_STAIRS, ModMossBlocks.MOSSY_BASALT_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BASALT_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.BASALT_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_basalt_tiles",conditionsFromItem(ModBlocks.BASALT_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_BASALT_TILE_SLAB, ModMossBlocks.MOSSY_BASALT_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_BASALT_TILE_WALL, ModMossBlocks.MOSSY_BASALT_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_BASALT_TILE_STAIRS, ModMossBlocks.MOSSY_BASALT_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DEEPSLATE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.DEEPSLATE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_deepslate_bricks",conditionsFromItem(Items.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModMossBlocks.MOSSY_DEEPSLATE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModMossBlocks.MOSSY_DEEPSLATE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModMossBlocks.MOSSY_DEEPSLATE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DEEPSLATE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.DEEPSLATE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_deepslate_tiles",conditionsFromItem(Items.DEEPSLATE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModMossBlocks.MOSSY_DEEPSLATE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModMossBlocks.MOSSY_DEEPSLATE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModMossBlocks.MOSSY_DEEPSLATE_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_TUFF_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.TUFF_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_tuff_bricks",conditionsFromItem(Items.TUFF_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_TUFF_BRICK_SLAB, ModMossBlocks.MOSSY_TUFF_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_TUFF_BRICK_WALL, ModMossBlocks.MOSSY_TUFF_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_TUFF_BRICK_STAIRS, ModMossBlocks.MOSSY_TUFF_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_TUFF_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.TUFF_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_tuff_tiles",conditionsFromItem(ModBlocks.TUFF_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_TUFF_TILE_SLAB, ModMossBlocks.MOSSY_TUFF_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_TUFF_TILE_WALL, ModMossBlocks.MOSSY_TUFF_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_TUFF_TILE_STAIRS, ModMossBlocks.MOSSY_TUFF_TILES);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PRISMARINE_BRICKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.PRISMARINE_BRICKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_prismarine_bricks",conditionsFromItem(Items.PRISMARINE_BRICKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_PRISMARINE_BRICK_SLAB, ModMossBlocks.MOSSY_PRISMARINE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PRISMARINE_BRICK_WALL, ModMossBlocks.MOSSY_PRISMARINE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_PRISMARINE_BRICK_STAIRS, ModMossBlocks.MOSSY_PRISMARINE_BRICKS);
        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PRISMARINE_TILES)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModBlocks.PRISMARINE_TILES)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_prismarine_tiles",conditionsFromItem(ModBlocks.PRISMARINE_TILES))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModMossBlocks.MOSSY_PRISMARINE_TILE_SLAB, ModMossBlocks.MOSSY_PRISMARINE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModMossBlocks.MOSSY_PRISMARINE_TILE_WALL, ModMossBlocks.MOSSY_PRISMARINE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModMossBlocks.MOSSY_PRISMARINE_TILE_STAIRS, ModMossBlocks.MOSSY_PRISMARINE_TILES);
    }
}
