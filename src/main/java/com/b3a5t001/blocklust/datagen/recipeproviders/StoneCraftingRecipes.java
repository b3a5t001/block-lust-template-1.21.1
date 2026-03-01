package com.b3a5t001.blocklust.datagen.recipeproviders;

import com.b3a5t001.blocklust.datagen.ModRecipeProvider;
import com.b3a5t001.blocklust.blocks.ModBlocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;


public class StoneCraftingRecipes extends RecipeGenerator {
    public StoneCraftingRecipes(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate(){

        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Items.POLISHED_ANDESITE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES, ModBlocks.ANDESITE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_SLAB, ModBlocks.ANDESITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_TILE_WALL, ModBlocks.ANDESITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.ANDESITE_TILE_STAIRS, ModBlocks.ANDESITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_ANDESITE_WALL,Items.POLISHED_ANDESITE);

        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Items.POLISHED_GRANITE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES, ModBlocks.GRANITE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB, ModBlocks.GRANITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_TILE_WALL, ModBlocks.GRANITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.GRANITE_TILE_STAIRS, ModBlocks.GRANITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_GRANITE_WALL,Items.POLISHED_GRANITE);

        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Items.POLISHED_DIORITE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES, ModBlocks.DIORITE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_SLAB, ModBlocks.DIORITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_TILE_WALL, ModBlocks.DIORITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DIORITE_TILE_STAIRS, ModBlocks.DIORITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_DIORITE_WALL,Items.POLISHED_DIORITE);

        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_STONE_WALL,Items.SMOOTH_STONE);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.STONE_WALL,Items.STONE);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);


        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Items.CALCITE);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CALCITE_WALL, Items.CALCITE);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.CALCITE_STAIRS, Items.CALCITE);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Items.CALCITE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES, ModBlocks.CALCITE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILE_SLAB, ModBlocks.CALCITE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CALCITE_TILE_WALL, ModBlocks.CALCITE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.CALCITE_TILE_STAIRS, ModBlocks.CALCITE_TILES);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.NETHERRACK_STAIRS, Items.NETHERRACK);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK, Items.NETHERRACK);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK_SLAB, ModBlocks.POLISHED_NETHERRACK);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_NETHERRACK_WALL, ModBlocks.POLISHED_NETHERRACK);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.POLISHED_NETHERRACK_STAIRS, ModBlocks.POLISHED_NETHERRACK);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICKS, ModBlocks.POLISHED_NETHERRACK);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICK_SLAB, ModBlocks.NETHERRACK_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.NETHERRACK_BRICK_WALL, ModBlocks.NETHERRACK_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.NETHERRACK_BRICK_STAIRS, ModBlocks.NETHERRACK_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_TILES, ModBlocks.NETHERRACK_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_TILE_SLAB, ModBlocks.NETHERRACK_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.NETHERRACK_TILE_WALL, ModBlocks.NETHERRACK_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.NETHERRACK_TILE_STAIRS, ModBlocks.NETHERRACK_TILES);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Items.END_STONE);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.END_STONE_WALL, Items.END_STONE);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.END_STONE_STAIRS, Items.END_STONE);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILE_SLAB, ModBlocks.END_STONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.END_STONE_TILE_WALL, ModBlocks.END_STONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.END_STONE_TILE_STAIRS, ModBlocks.END_STONE_TILES);

        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_WALL, Items.QUARTZ);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_TILES, Items.QUARTZ_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_TILE_SLAB, ModBlocks.QUARTZ_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_TILE_WALL, ModBlocks.QUARTZ_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.QUARTZ_TILE_STAIRS, ModBlocks.QUARTZ_TILES);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DRIPSTONE_STAIRS, Items.DRIPSTONE_BLOCK);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Items.DRIPSTONE_BLOCK);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES, ModBlocks.DRIPSTONE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILE_SLAB, ModBlocks.DRIPSTONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRIPSTONE_TILE_WALL, ModBlocks.DRIPSTONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DRIPSTONE_TILE_STAIRS, ModBlocks.DRIPSTONE_TILES);

        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_WALL, Items.PURPUR_BLOCK);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS,Items.PURPUR_BLOCK);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICK_SLAB, ModBlocks.PURPUR_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_BRICK_WALL, ModBlocks.PURPUR_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.PURPUR_BRICK_STAIRS, ModBlocks.PURPUR_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_TILES, ModBlocks.PURPUR_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_TILE_SLAB, ModBlocks.PURPUR_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_TILE_WALL, ModBlocks.PURPUR_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.PURPUR_TILE_STAIRS, ModBlocks.PURPUR_TILES);

        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB, ModBlocks.POLISHED_BLACKSTONE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_BLACKSTONE_TILE_WALL, ModBlocks.POLISHED_BLACKSTONE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, ModBlocks.POLISHED_BLACKSTONE_TILES);

        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_BASALT, Items.POLISHED_BASALT);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_BASALT_SLAB, ModBlocks.CUT_POLISHED_BASALT);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CUT_POLISHED_BASALT_WALL, ModBlocks.CUT_POLISHED_BASALT);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.CUT_POLISHED_BASALT_STAIRS, ModBlocks.CUT_POLISHED_BASALT);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICKS, ModBlocks.CUT_POLISHED_BASALT);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICK_SLAB, ModBlocks.BASALT_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.BASALT_BRICK_WALL, ModBlocks.BASALT_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.BASALT_BRICK_STAIRS, ModBlocks.BASALT_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_TILES, ModBlocks.BASALT_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_TILE_SLAB, ModBlocks.BASALT_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.BASALT_TILE_WALL, ModBlocks.BASALT_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.BASALT_TILE_STAIRS, ModBlocks.BASALT_TILES);
        
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES, Items.TUFF_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILE_SLAB, ModBlocks.TUFF_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TUFF_TILE_WALL, ModBlocks.TUFF_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.TUFF_TILE_STAIRS, ModBlocks.TUFF_TILES);

        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_TILES, Items.PRISMARINE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_TILE_SLAB, ModBlocks.PRISMARINE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PRISMARINE_TILE_WALL, ModBlocks.PRISMARINE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.PRISMARINE_TILE_STAIRS, ModBlocks.PRISMARINE_TILES);
        
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_BRICK_SLAB, ModBlocks.DARK_PRISMARINE_BRICKS);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_BRICK_WALL, ModBlocks.DARK_PRISMARINE_BRICKS);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DARK_PRISMARINE_BRICK_STAIRS, ModBlocks.DARK_PRISMARINE_BRICKS);
        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_TILES, ModBlocks.DARK_PRISMARINE_BRICKS);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_TILE_SLAB, ModBlocks.DARK_PRISMARINE_TILES);
        offerWallRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_TILE_WALL, ModBlocks.DARK_PRISMARINE_TILES);
        ModRecipeProvider.offerStairsRecipe(this, exporter, ModBlocks.DARK_PRISMARINE_TILE_STAIRS, ModBlocks.DARK_PRISMARINE_TILES);
    }
}
