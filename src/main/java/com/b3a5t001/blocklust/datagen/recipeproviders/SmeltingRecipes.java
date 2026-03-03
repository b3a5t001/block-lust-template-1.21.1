package com.b3a5t001.blocklust.datagen.recipeproviders;

import com.b3a5t001.blocklust.blocks.ModBlocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;


public class SmeltingRecipes extends RecipeGenerator {
    public SmeltingRecipes(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate(){
        offerSmelting(List.of(ModBlocks.ANDESITE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_ANDESITE_BRICKS, 0.2f,200,"cracked_andesite_bricks");
        offerSmelting(List.of(ModBlocks.ANDESITE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_ANDESITE_TILES, 0.2f,200,"cracked_andesite_tiles");
        offerSmelting(List.of(ModBlocks.GRANITE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_GRANITE_BRICKS, 0.2f,200,"cracked_granite_bricks");
        offerSmelting(List.of(ModBlocks.GRANITE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_GRANITE_TILES, 0.2f,200,"cracked_granite_tiles");
        offerSmelting(List.of(ModBlocks.DIORITE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DIORITE_BRICKS, 0.2f,200,"cracked_diorite_bricks");
        offerSmelting(List.of(ModBlocks.DIORITE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DIORITE_TILES, 0.2f,200,"cracked_diorite_tiles");
        offerSmelting(List.of(ModBlocks.STONE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_STONE_TILES, 0.2f,200,"cracked_stone_tiles");
        offerSmelting(List.of(ModBlocks.CALCITE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_CALCITE_BRICKS, 0.2f,200,"cracked_calcite_bricks");
        offerSmelting(List.of(ModBlocks.CALCITE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_CALCITE_TILES, 0.2f,200,"cracked_calcite_tiles");
        offerSmelting(List.of(ModBlocks.NETHERRACK_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_NETHERRACK_BRICKS, 0.2f,200,"cracked_netherrack_bricks");
        offerSmelting(List.of(ModBlocks.NETHERRACK_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_NETHERRACK_TILES, 0.2f,200,"cracked_netherrack_tiles");
        offerSmelting(List.of(Items.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_END_STONE_BRICKS, 0.2f,200,"cracked_end_stone_bricks");
        offerSmelting(List.of(ModBlocks.END_STONE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_END_STONE_TILES, 0.2f,200,"cracked_end_stone_tiles");
        offerSmelting(List.of(Items.QUARTZ_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_QUARTZ_BRICKS, 0.2f,200,"cracked_quartz_bricks");
        offerSmelting(List.of(ModBlocks.QUARTZ_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_QUARTZ_TILES, 0.2f,200,"cracked_quartz_tiles");
        offerSmelting(List.of(ModBlocks.PURPUR_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_PURPUR_BRICKS, 0.2f,200,"cracked_purpur_bricks");
        offerSmelting(List.of(ModBlocks.PURPUR_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_PURPUR_TILES, 0.2f,200,"cracked_purpur_tiles");
        offerSmelting(List.of(ModBlocks.DARK_PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DARK_PRISMARINE_BRICKS, 0.2f,200,"cracked_dark_prismarine_bricks");
        offerSmelting(List.of(ModBlocks.DARK_PRISMARINE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DARK_PRISMARINE_TILES, 0.2f,200,"cracked_dark_prismarine_tiles");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DRIPSTONE_BRICKS, 0.2f,200,"cracked_dripstone_bricks");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_DRIPSTONE_TILES, 0.2f,200,"cracked_dripstone_tiles");
        offerSmelting(List.of(Items.TUFF_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_TUFF_BRICKS, 0.2f,200,"cracked_tuff_bricks");
        offerSmelting(List.of(ModBlocks.TUFF_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_TUFF_TILES, 0.2f,200,"cracked_tuff_tiles");
        offerSmelting(List.of(Items.PRISMARINE_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_PRISMARINE_BRICKS, 0.2f,200,"cracked_prismarine_bricks");
        offerSmelting(List.of(ModBlocks.PRISMARINE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_PRISMARINE_TILES, 0.2f,200,"cracked_prismarine_tiles");
        offerSmelting(List.of(ModBlocks.POLISHED_BLACKSTONE_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, 0.2f,200,"cracked_polished_blackstone_tiles");
        offerSmelting(List.of(ModBlocks.BASALT_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_BASALT_BRICKS, 0.2f,200,"cracked_basalt_bricks");
        offerSmelting(List.of(ModBlocks.BASALT_TILES), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_BASALT_TILES, 0.2f,200,"cracked_basalt_tiles");
        offerSmelting(List.of(Items.RED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS,ModBlocks.CRACKED_RED_NETHER_BRICKS, 0.2f,200,"cracked_red_nether_bricks");
    }
}
