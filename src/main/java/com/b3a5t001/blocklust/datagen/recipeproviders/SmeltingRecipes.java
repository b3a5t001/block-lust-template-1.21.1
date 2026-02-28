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

        offerSmelting(List.of(ModBlocks.ANDESITE_COAL_ORE),RecipeCategory.MISC, Items.COAL,0.1f,200,"coal_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_andesite_ore");
        offerSmelting(List.of(ModBlocks.ANDESITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_andesite_ore");
        offerBlasting(List.of(ModBlocks.ANDESITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_andesite_ore");

        offerSmelting(List.of(ModBlocks.GRANITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,200,"coal_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_granite_ore");
        offerSmelting(List.of(ModBlocks.GRANITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_granite_ore");
        offerBlasting(List.of(ModBlocks.GRANITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_granite_ore");

        offerSmelting(List.of(ModBlocks.DIORITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,200,"coal_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_diorite_ore");
        offerSmelting(List.of(ModBlocks.DIORITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_diorite_ore");
        offerBlasting(List.of(ModBlocks.DIORITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_diorite_ore");

        offerSmelting(List.of(ModBlocks.MOSSY_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,200,"coal_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_mossy_ore");
        offerSmelting(List.of(ModBlocks.MOSSY_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_mossy_ore");
        offerBlasting(List.of(ModBlocks.MOSSY_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_mossy_ore");

        offerSmelting(List.of(ModBlocks.CALCITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,200,"coal_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_calcite_ore");
        offerSmelting(List.of(ModBlocks.CALCITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_calcite_ore");
        offerBlasting(List.of(ModBlocks.CALCITE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_calcite_ore");

        offerSmelting(List.of(ModBlocks.DRIPSTONE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,200,"coal_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_dripstone_ore");
        offerSmelting(List.of(ModBlocks.DRIPSTONE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_dripstone_ore");
        offerBlasting(List.of(ModBlocks.DRIPSTONE_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_dripstone_ore");

        offerSmelting(List.of(ModBlocks.TUFF_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,200,"coal_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,200,"copper_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,200,"lapis_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,200,"redstone_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,200,"diamond_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,200,"iron_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,200,"emerald_from_tuff_ore");
        offerSmelting(List.of(ModBlocks.TUFF_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_COAL_ORE),RecipeCategory.MISC,Items.COAL,0.1f,100,"coal_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_COPPER_ORE),RecipeCategory.MISC,Items.COPPER_INGOT,0.7f,100,"copper_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_LAPIS_ORE),RecipeCategory.MISC,Items.LAPIS_LAZULI,0.2f,100,"lapis_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_REDSTONE_ORE),RecipeCategory.MISC,Items.REDSTONE,0.7f,100,"redstone_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_DIAMOND_ORE),RecipeCategory.MISC,Items.DIAMOND,1f,100,"diamond_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_IRON_ORE),RecipeCategory.MISC,Items.IRON_INGOT,0.7f,100,"iron_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_EMERALD_ORE),RecipeCategory.MISC,Items.EMERALD,1f,100,"emerald_from_tuff_ore");
        offerBlasting(List.of(ModBlocks.TUFF_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_tuff_ore");

        offerSmelting(List.of(ModBlocks.BASALT_QUARTZ_ORE),RecipeCategory.MISC,Items.QUARTZ,1f,200,"quartz_from_basalt_ore");
        offerSmelting(List.of(ModBlocks.BASALT_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,200,"gold_from_basalt_ore");
        offerSmelting(List.of(ModBlocks.BLACKSTONE_QUARTZ_ORE),RecipeCategory.MISC,Items.QUARTZ,1f,200,"quartz_from_blackstone_ore");
        offerBlasting(List.of(ModBlocks.BASALT_QUARTZ_ORE),RecipeCategory.MISC,Items.QUARTZ,1f,100,"quartz_from_basalt_ore");
        offerBlasting(List.of(ModBlocks.BASALT_GOLD_ORE),RecipeCategory.MISC,Items.GOLD_INGOT,1f,100,"gold_from_basalt_ore");
        offerBlasting(List.of(ModBlocks.BLACKSTONE_QUARTZ_ORE),RecipeCategory.MISC,Items.QUARTZ,1f,100,"quartz_from_blackstone_ore");

    }
}
