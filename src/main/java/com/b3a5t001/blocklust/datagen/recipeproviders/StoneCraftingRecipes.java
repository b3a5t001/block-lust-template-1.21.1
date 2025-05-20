package com.b3a5t001.blocklust.datagen.recipeproviders;

import com.b3a5t001.blocklust.blocks.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class StoneCraftingRecipes {
    public void generate(RecipeExporter exporter){

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Items.POLISHED_ANDESITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.ANDESITE_BRICKS)
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES, ModBlocks.ANDESITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_SLAB, ModBlocks.ANDESITE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_TILE_WALL, ModBlocks.ANDESITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.ANDESITE_TILES)
                .criterion(hasItem(ModBlocks.ANDESITE_TILES), conditionsFromItem(ModBlocks.ANDESITE_TILES))
                .offerTo(exporter);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_ANDESITE_WALL,Items.POLISHED_ANDESITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Items.POLISHED_GRANITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.GRANITE_BRICKS)
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES, ModBlocks.GRANITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB, ModBlocks.GRANITE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.GRANITE_TILE_WALL, ModBlocks.GRANITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.GRANITE_TILES)
                .criterion(hasItem(ModBlocks.GRANITE_TILES), conditionsFromItem(ModBlocks.GRANITE_TILES))
                .offerTo(exporter);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_GRANITE_WALL,Items.POLISHED_GRANITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Items.POLISHED_DIORITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DIORITE_BRICKS)
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES, ModBlocks.DIORITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_SLAB, ModBlocks.DIORITE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DIORITE_TILE_WALL, ModBlocks.DIORITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DIORITE_TILES)
                .criterion(hasItem(ModBlocks.DIORITE_TILES), conditionsFromItem(ModBlocks.DIORITE_TILES))
                .offerTo(exporter);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_DIORITE_WALL,Items.POLISHED_DIORITE);

        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_STONE_WALL,Items.SMOOTH_STONE);
        offerWallRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.STONE_WALL,Items.STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.STONE_TILES)
                .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                .offerTo(exporter);


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Items.CALCITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CALCITE_WALL, Items.CALCITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', Items.CALCITE)
                .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Items.CALCITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.POLISHED_CALCITE)
                .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILES, ModBlocks.CALCITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILE_SLAB, ModBlocks.CALCITE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CALCITE_TILE_WALL, ModBlocks.CALCITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CALCITE_TILES)
                .criterion(hasItem(ModBlocks.CALCITE_TILES), conditionsFromItem(ModBlocks.CALCITE_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', Items.NETHERRACK)
                .criterion(hasItem(Items.NETHERRACK), conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK, Items.NETHERRACK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK_SLAB, ModBlocks.POLISHED_NETHERRACK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_NETHERRACK_WALL, ModBlocks.POLISHED_NETHERRACK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.POLISHED_NETHERRACK)
                .criterion(hasItem(ModBlocks.POLISHED_NETHERRACK), conditionsFromItem(ModBlocks.POLISHED_NETHERRACK))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICKS, ModBlocks.POLISHED_NETHERRACK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICK_SLAB, ModBlocks.NETHERRACK_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.NETHERRACK_BRICK_WALL, ModBlocks.NETHERRACK_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.NETHERRACK_BRICKS)
                .criterion(hasItem(ModBlocks.NETHERRACK_BRICKS), conditionsFromItem(ModBlocks.NETHERRACK_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_TILES, ModBlocks.NETHERRACK_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_TILE_SLAB, ModBlocks.NETHERRACK_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.NETHERRACK_TILE_WALL, ModBlocks.NETHERRACK_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.NETHERRACK_TILES)
                .criterion(hasItem(ModBlocks.NETHERRACK_TILES), conditionsFromItem(ModBlocks.NETHERRACK_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Items.END_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.END_STONE_WALL, Items.END_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', Items.END_STONE)
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILE_SLAB, ModBlocks.END_STONE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.END_STONE_TILE_WALL, ModBlocks.END_STONE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.END_STONE_TILES)
                .criterion(hasItem(ModBlocks.END_STONE_TILES), conditionsFromItem(ModBlocks.END_STONE_TILES))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_WALL, Items.QUARTZ);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', Items.QUARTZ_BRICKS)
                .criterion(hasItem(Items.QUARTZ_BRICKS), conditionsFromItem(Items.QUARTZ_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_TILES, Items.QUARTZ_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_TILE_SLAB, ModBlocks.QUARTZ_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUARTZ_TILE_WALL, ModBlocks.QUARTZ_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.QUARTZ_TILES)
                .criterion(hasItem(ModBlocks.QUARTZ_TILES), conditionsFromItem(ModBlocks.QUARTZ_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', Items.DRIPSTONE_BLOCK)
                .criterion(hasItem(Items.DRIPSTONE_BLOCK), conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE, Items.DRIPSTONE_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_DRIPSTONE_WALL, ModBlocks.POLISHED_DRIPSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.POLISHED_DRIPSTONE)
                .criterion(hasItem(ModBlocks.POLISHED_DRIPSTONE), conditionsFromItem(ModBlocks.POLISHED_DRIPSTONE))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS, ModBlocks.POLISHED_DRIPSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DRIPSTONE_BRICKS)
                .criterion(hasItem(ModBlocks.DRIPSTONE_BRICKS), conditionsFromItem(ModBlocks.DRIPSTONE_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES, ModBlocks.DRIPSTONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILE_SLAB, ModBlocks.DRIPSTONE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRIPSTONE_TILE_WALL, ModBlocks.DRIPSTONE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DRIPSTONE_TILES)
                .criterion(hasItem(ModBlocks.DRIPSTONE_TILES), conditionsFromItem(ModBlocks.DRIPSTONE_TILES))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_WALL, Items.PURPUR_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS,Items.PURPUR_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICK_SLAB, ModBlocks.PURPUR_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_BRICK_WALL, ModBlocks.PURPUR_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.PURPUR_BRICKS)
                .criterion(hasItem(ModBlocks.PURPUR_BRICKS), conditionsFromItem(ModBlocks.PURPUR_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_TILES, ModBlocks.PURPUR_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_TILE_SLAB, ModBlocks.PURPUR_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.PURPUR_TILE_WALL, ModBlocks.PURPUR_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.PURPUR_TILES)
                .criterion(hasItem(ModBlocks.PURPUR_TILES), conditionsFromItem(ModBlocks.PURPUR_TILES))
                .offerTo(exporter);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB, ModBlocks.POLISHED_BLACKSTONE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.POLISHED_BLACKSTONE_TILE_WALL, ModBlocks.POLISHED_BLACKSTONE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.POLISHED_BLACKSTONE_TILES)
                .criterion(hasItem(ModBlocks.POLISHED_BLACKSTONE_TILES), conditionsFromItem(ModBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_BASALT, Items.POLISHED_BASALT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_BASALT_SLAB, ModBlocks.CUT_POLISHED_BASALT);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.CUT_POLISHED_BASALT_WALL, ModBlocks.CUT_POLISHED_BASALT);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_BASALT_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CUT_POLISHED_BASALT)
                .criterion(hasItem(ModBlocks.CUT_POLISHED_BASALT), conditionsFromItem(ModBlocks.CUT_POLISHED_BASALT))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICKS, ModBlocks.CUT_POLISHED_BASALT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICK_SLAB, ModBlocks.BASALT_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.BASALT_BRICK_WALL, ModBlocks.BASALT_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.BASALT_BRICKS)
                .criterion(hasItem(ModBlocks.BASALT_BRICKS), conditionsFromItem(ModBlocks.BASALT_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_TILES, ModBlocks.BASALT_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_TILE_SLAB, ModBlocks.BASALT_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.BASALT_TILE_WALL, ModBlocks.BASALT_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.BASALT_TILES)
                .criterion(hasItem(ModBlocks.BASALT_TILES), conditionsFromItem(ModBlocks.BASALT_TILES))
                .offerTo(exporter);
        
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILES, Items.TUFF_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILE_SLAB, ModBlocks.TUFF_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.TUFF_TILE_WALL, ModBlocks.TUFF_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.TUFF_TILES)
                .criterion(hasItem(ModBlocks.TUFF_TILES), conditionsFromItem(ModBlocks.TUFF_TILES))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_TILES, Items.PRISMARINE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_TILE_SLAB, ModBlocks.PRISMARINE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.PRISMARINE_TILE_WALL, ModBlocks.PRISMARINE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.PRISMARINE_TILES)
                .criterion(hasItem(ModBlocks.PRISMARINE_TILES), conditionsFromItem(ModBlocks.PRISMARINE_TILES))
                .offerTo(exporter);
        
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_BRICKS, Items.DARK_PRISMARINE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_BRICK_SLAB, ModBlocks.DARK_PRISMARINE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_BRICK_WALL, ModBlocks.DARK_PRISMARINE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DARK_PRISMARINE_BRICKS)
                .criterion(hasItem(ModBlocks.DARK_PRISMARINE_BRICKS), conditionsFromItem(ModBlocks.DARK_PRISMARINE_BRICKS))
                .offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_TILES, ModBlocks.DARK_PRISMARINE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_TILE_SLAB, ModBlocks.DARK_PRISMARINE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ModBlocks.DARK_PRISMARINE_TILE_WALL, ModBlocks.DARK_PRISMARINE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_TILE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DARK_PRISMARINE_TILES)
                .criterion(hasItem(ModBlocks.DARK_PRISMARINE_TILES), conditionsFromItem(ModBlocks.DARK_PRISMARINE_TILES))
                .offerTo(exporter);
    }
}
