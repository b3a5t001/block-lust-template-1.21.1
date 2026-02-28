package com.b3a5t001.blocklust.datagen.recipeproviders;

import com.b3a5t001.blocklust.blocks.ModPlanks;
import com.b3a5t001.blocklust.util.ModItemTags;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;


public class PlanksCraftingRecipes extends RecipeGenerator {
    public PlanksCraftingRecipes(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate(){

        offerShapelessRecipe(ModPlanks.CACTUS_FRAME, Items.CACTUS,"cactus_frames_from_cactus",1);
        offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.CACTUS_PLANKS,ModPlanks.CACTUS_FRAME);
        createShaped(RecipeCategory.BUILDING_BLOCKS, Items.STICK, 1)
                .pattern("R ")
                .pattern("R ")
                .input('R', ModPlanks.CACTUS_FRAME)
                .criterion(hasItem(ModPlanks.CACTUS_FRAME), conditionsFromItem(ModPlanks.CACTUS_FRAME))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.CACTUS_SLAB,ModPlanks.CACTUS_PLANKS);
        offerPressurePlateRecipe(ModPlanks.CACTUS_PRESSURE_PLATE,ModPlanks.CACTUS_PLANKS);
        offerShapelessRecipe(ModPlanks.CACTUS_BUTTON, ModPlanks.CACTUS_PLANKS,"cactus_button_from_planks",1);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.CACTUS_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.CACTUS_PLANKS)
                .criterion(hasItem(ModPlanks.CACTUS_PLANKS), conditionsFromItem(ModPlanks.CACTUS_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.CACTUS_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.CACTUS_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.CACTUS_PLANKS), conditionsFromItem(ModPlanks.CACTUS_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.CACTUS_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.CACTUS_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.CACTUS_PLANKS), conditionsFromItem(ModPlanks.CACTUS_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.CACTUS_DOOR, 3)
                .pattern("   ")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModPlanks.CACTUS_PLANKS)
                .criterion(hasItem(ModPlanks.CACTUS_PLANKS), conditionsFromItem(ModPlanks.CACTUS_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.CACTUS_TRAPDOOR, 2)
                .pattern("RR ")
                .pattern("RR ")
                .pattern("RR ")
                .input('R', ModPlanks.CACTUS_PLANKS)
                .criterion(hasItem(ModPlanks.CACTUS_PLANKS), conditionsFromItem(ModPlanks.CACTUS_PLANKS))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_CACTUS_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(ModPlanks.CACTUS_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_cactus_planks",conditionsFromItem(ModPlanks.CACTUS_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_CACTUS_SLAB,ModPlanks.MOSSY_CACTUS_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CACTUS_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_CACTUS_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_CACTUS_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CACTUS_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CACTUS_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_CACTUS_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_CACTUS_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CACTUS_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CACTUS_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_CACTUS_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_CACTUS_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CACTUS_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_OAK_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.OAK_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_oak_planks",conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_OAK_SLAB,ModPlanks.MOSSY_OAK_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_OAK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_OAK_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_OAK_PLANKS), conditionsFromItem(ModPlanks.MOSSY_OAK_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_OAK_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_OAK_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_OAK_PLANKS), conditionsFromItem(ModPlanks.MOSSY_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_OAK_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_OAK_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_OAK_PLANKS), conditionsFromItem(ModPlanks.MOSSY_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_DARK_OAK_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.DARK_OAK_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_dark_oak_planks",conditionsFromItem(Items.DARK_OAK_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_DARK_OAK_SLAB,ModPlanks.MOSSY_DARK_OAK_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_DARK_OAK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_DARK_OAK_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_DARK_OAK_PLANKS), conditionsFromItem(ModPlanks.MOSSY_DARK_OAK_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_DARK_OAK_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_DARK_OAK_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_DARK_OAK_PLANKS), conditionsFromItem(ModPlanks.MOSSY_DARK_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_DARK_OAK_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_DARK_OAK_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_DARK_OAK_PLANKS), conditionsFromItem(ModPlanks.MOSSY_DARK_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_CHERRY_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.CHERRY_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_cherry_planks",conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_CHERRY_SLAB,ModPlanks.MOSSY_CHERRY_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CHERRY_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_CHERRY_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_CHERRY_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CHERRY_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CHERRY_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_CHERRY_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_CHERRY_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CHERRY_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CHERRY_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_CHERRY_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_CHERRY_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CHERRY_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_MANGROVE_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.MANGROVE_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_mangrove_planks",conditionsFromItem(Items.MANGROVE_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_MANGROVE_SLAB,ModPlanks.MOSSY_MANGROVE_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_MANGROVE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_MANGROVE_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_MANGROVE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_MANGROVE_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_MANGROVE_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_MANGROVE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_MANGROVE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_MANGROVE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_MANGROVE_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_MANGROVE_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_MANGROVE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_MANGROVE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_BAMBOO_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.BAMBOO_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_bamboo_planks",conditionsFromItem(Items.BAMBOO_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_BAMBOO_SLAB,ModPlanks.MOSSY_BAMBOO_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BAMBOO_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_BAMBOO_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_BAMBOO_PLANKS), conditionsFromItem(ModPlanks.MOSSY_BAMBOO_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BAMBOO_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_BAMBOO_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_BAMBOO_PLANKS), conditionsFromItem(ModPlanks.MOSSY_BAMBOO_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BAMBOO_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_BAMBOO_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_BAMBOO_PLANKS), conditionsFromItem(ModPlanks.MOSSY_BAMBOO_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_WARPED_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.WARPED_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_warped_planks",conditionsFromItem(Items.WARPED_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_WARPED_SLAB,ModPlanks.MOSSY_WARPED_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_WARPED_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_WARPED_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_WARPED_PLANKS), conditionsFromItem(ModPlanks.MOSSY_WARPED_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_WARPED_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_WARPED_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_WARPED_PLANKS), conditionsFromItem(ModPlanks.MOSSY_WARPED_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_WARPED_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_WARPED_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_WARPED_PLANKS), conditionsFromItem(ModPlanks.MOSSY_WARPED_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_BAMBOO_MOSAIC)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.BAMBOO_MOSAIC)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_bamboo_mosaic_planks",conditionsFromItem(Items.BAMBOO_MOSAIC))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_BAMBOO_MOSAIC_SLAB,ModPlanks.MOSSY_BAMBOO_MOSAIC);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BAMBOO_MOSAIC_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_BAMBOO_MOSAIC)
                .criterion(hasItem(ModPlanks.MOSSY_BAMBOO_MOSAIC), conditionsFromItem(ModPlanks.MOSSY_BAMBOO_MOSAIC))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_CRIMSON_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.CRIMSON_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_crimson_planks",conditionsFromItem(Items.CRIMSON_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_CRIMSON_SLAB,ModPlanks.MOSSY_CRIMSON_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CRIMSON_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_CRIMSON_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_CRIMSON_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CRIMSON_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CRIMSON_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_CRIMSON_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_CRIMSON_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CRIMSON_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_CRIMSON_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_CRIMSON_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_CRIMSON_PLANKS), conditionsFromItem(ModPlanks.MOSSY_CRIMSON_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_JUNGLE_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.JUNGLE_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_jungle_planks",conditionsFromItem(Items.JUNGLE_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_JUNGLE_SLAB,ModPlanks.MOSSY_JUNGLE_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_JUNGLE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_JUNGLE_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_JUNGLE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_JUNGLE_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_JUNGLE_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_JUNGLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_JUNGLE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_JUNGLE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_JUNGLE_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_JUNGLE_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_JUNGLE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_JUNGLE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_SPRUCE_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.SPRUCE_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_spruce_planks",conditionsFromItem(Items.SPRUCE_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_SPRUCE_SLAB,ModPlanks.MOSSY_SPRUCE_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_SPRUCE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_SPRUCE_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_SPRUCE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_SPRUCE_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_SPRUCE_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_SPRUCE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_SPRUCE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_SPRUCE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_SPRUCE_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_SPRUCE_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_SPRUCE_PLANKS), conditionsFromItem(ModPlanks.MOSSY_SPRUCE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        createShapeless(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_BIRCH_PLANKS)
                .input(ModItemTags.MOSSY_SOURCES)
                .input(Items.BIRCH_PLANKS)
                .criterion("has_mossy_sources",conditionsFromItem(Items.MOSS_BLOCK))
                .criterion("has_mossy_sources",conditionsFromItem(Items.VINE))
                .criterion("has_birch_planks",conditionsFromItem(Items.BIRCH_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModPlanks.MOSSY_BIRCH_SLAB,ModPlanks.MOSSY_BIRCH_PLANKS);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BIRCH_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModPlanks.MOSSY_BIRCH_PLANKS)
                .criterion(hasItem(ModPlanks.MOSSY_BIRCH_PLANKS), conditionsFromItem(ModPlanks.MOSSY_BIRCH_PLANKS))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BIRCH_FENCE, 3)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModPlanks.MOSSY_BIRCH_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_BIRCH_PLANKS), conditionsFromItem(ModPlanks.MOSSY_BIRCH_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createShaped(RecipeCategory.BUILDING_BLOCKS, ModPlanks.MOSSY_BIRCH_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("RSR")
                .pattern("RSR")
                .input('S', ModPlanks.MOSSY_BIRCH_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModPlanks.MOSSY_BIRCH_PLANKS), conditionsFromItem(ModPlanks.MOSSY_BIRCH_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
}
