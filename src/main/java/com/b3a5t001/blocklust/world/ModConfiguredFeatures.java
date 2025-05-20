package com.b3a5t001.blocklust.world;

import com.b3a5t001.blocklust.BlockLust;
import com.b3a5t001.blocklust.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_COAL_ORE_KEY = registerKey("dripstone_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_COPPER_ORE_KEY = registerKey("dripstone_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_IRON_ORE_KEY = registerKey("dripstone_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_GOLD_ORE_KEY = registerKey("dripstone_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_EMERALD_ORE_KEY = registerKey("dripstone_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_DIAMOND_ORE_KEY = registerKey("dripstone_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_LAPIS_ORE_KEY = registerKey("dripstone_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_REDSTONE_ORE_KEY = registerKey("dripstone_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_COAL_ORE_KEY = registerKey("mossy_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_COPPER_ORE_KEY = registerKey("mossy_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_IRON_ORE_KEY = registerKey("mossy_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_GOLD_ORE_KEY = registerKey("mossy_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_EMERALD_ORE_KEY = registerKey("mossy_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_DIAMOND_ORE_KEY = registerKey("mossy_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_LAPIS_ORE_KEY = registerKey("mossy_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_REDSTONE_ORE_KEY = registerKey("mossy_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_COAL_ORE_KEY = registerKey("tuff_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_COPPER_ORE_KEY = registerKey("tuff_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_IRON_ORE_KEY = registerKey("tuff_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_GOLD_ORE_KEY = registerKey("tuff_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_EMERALD_ORE_KEY = registerKey("tuff_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_DIAMOND_ORE_KEY = registerKey("tuff_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_LAPIS_ORE_KEY = registerKey("tuff_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_REDSTONE_ORE_KEY = registerKey("tuff_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_ORE_KEY = registerKey("calcite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_COAL_ORE_KEY = registerKey("calcite_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_COPPER_ORE_KEY = registerKey("calcite_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_IRON_ORE_KEY = registerKey("calcite_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_GOLD_ORE_KEY = registerKey("calcite_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_EMERALD_ORE_KEY = registerKey("calcite_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_DIAMOND_ORE_KEY = registerKey("calcite_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_LAPIS_ORE_KEY = registerKey("calcite_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCITE_REDSTONE_ORE_KEY = registerKey("calcite_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_COAL_ORE_KEY = registerKey("andesite_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_COPPER_ORE_KEY = registerKey("andesite_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_IRON_ORE_KEY = registerKey("andesite_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_GOLD_ORE_KEY = registerKey("andesite_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_EMERALD_ORE_KEY = registerKey("andesite_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_DIAMOND_ORE_KEY = registerKey("andesite_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_LAPIS_ORE_KEY = registerKey("andesite_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_REDSTONE_ORE_KEY = registerKey("andesite_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_COAL_ORE_KEY = registerKey("granite_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_COPPER_ORE_KEY = registerKey("granite_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_IRON_ORE_KEY = registerKey("granite_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_GOLD_ORE_KEY = registerKey("granite_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_EMERALD_ORE_KEY = registerKey("granite_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_DIAMOND_ORE_KEY = registerKey("granite_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_LAPIS_ORE_KEY = registerKey("granite_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRANITE_REDSTONE_ORE_KEY = registerKey("granite_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_COAL_ORE_KEY = registerKey("diorite_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_COPPER_ORE_KEY = registerKey("diorite_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_IRON_ORE_KEY = registerKey("diorite_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_GOLD_ORE_KEY = registerKey("diorite_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_EMERALD_ORE_KEY = registerKey("diorite_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_DIAMOND_ORE_KEY = registerKey("diorite_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_LAPIS_ORE_KEY = registerKey("diorite_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIORITE_REDSTONE_ORE_KEY = registerKey("diorite_redstone_ore");


    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> dripstoneCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dripstoneRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DRIPSTONE_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DRIPSTONE_REDSTONE_ORE.getDefaultState()));
        
        List<OreFeatureConfig.Target> mossyCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mossyRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MOSSY_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.MOSSY_REDSTONE_ORE.getDefaultState()));
        
        List<OreFeatureConfig.Target> tuffCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tuffRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUFF_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TUFF_REDSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> calciteOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, Blocks.CALCITE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, Blocks.CALCITE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> calciteRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCITE_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.CALCITE_REDSTONE_ORE.getDefaultState()));
        
        List<OreFeatureConfig.Target> andesiteCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ANDESITE_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ANDESITE_REDSTONE_ORE.getDefaultState()));
        
        List<OreFeatureConfig.Target> graniteCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> graniteRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GRANITE_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.GRANITE_REDSTONE_ORE.getDefaultState()));
        
        List<OreFeatureConfig.Target> dioriteCoalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteCopperOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteIronOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteEmeraldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteLapisOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dioriteRedstoneOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.DIORITE_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DIORITE_REDSTONE_ORE.getDefaultState()));

        register(context, DRIPSTONE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneCoalOre, 8));
        register(context, DRIPSTONE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneCopperOre, 16));
        register(context, DRIPSTONE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneIronOre, 6));
        register(context, DRIPSTONE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneGoldOre, 5));
        register(context, DRIPSTONE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneEmeraldOre, 2));
        register(context, DRIPSTONE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneDiamondOre, 5));
        register(context, DRIPSTONE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneLapisOre, 6));
        register(context, DRIPSTONE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dripstoneRedstoneOre, 6));

        register(context, MOSSY_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyCoalOre, 8));
        register(context, MOSSY_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyCopperOre, 8));
        register(context, MOSSY_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyIronOre, 6));
        register(context, MOSSY_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyGoldOre, 5));
        register(context, MOSSY_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyEmeraldOre, 2));
        register(context, MOSSY_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyDiamondOre, 5));
        register(context, MOSSY_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyLapisOre, 6));
        register(context, MOSSY_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(mossyRedstoneOre, 6));

        register(context, TUFF_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffCoalOre, 4));
        register(context, TUFF_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffCopperOre, 4));
        register(context, TUFF_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffIronOre, 6));
        register(context, TUFF_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffGoldOre, 5));
        register(context, TUFF_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffEmeraldOre, 2));
        register(context, TUFF_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffDiamondOre, 5));
        register(context, TUFF_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffLapisOre, 6));
        register(context, TUFF_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(tuffRedstoneOre, 6));

        register(context, CALCITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteOre, 32));
        register(context, CALCITE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteCoalOre, 8));
        register(context, CALCITE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteCopperOre, 8));
        register(context, CALCITE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteIronOre, 6));
        register(context, CALCITE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteGoldOre, 4));
        register(context, CALCITE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteEmeraldOre, 2));
        register(context, CALCITE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteDiamondOre, 2));
        register(context, CALCITE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteLapisOre, 6));
        register(context, CALCITE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(calciteRedstoneOre, 4));
        
        register(context, ANDESITE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteCoalOre, 8));
        register(context, ANDESITE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteCopperOre, 8));
        register(context, ANDESITE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteIronOre, 6));
        register(context, ANDESITE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteGoldOre, 4));
        register(context, ANDESITE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteEmeraldOre, 2));
        register(context, ANDESITE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteDiamondOre, 2));
        register(context, ANDESITE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteLapisOre, 6));
        register(context, ANDESITE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteRedstoneOre, 4));
        
        register(context, GRANITE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteCoalOre, 8));
        register(context, GRANITE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteCopperOre, 8));
        register(context, GRANITE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteIronOre, 6));
        register(context, GRANITE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteGoldOre, 4));
        register(context, GRANITE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteEmeraldOre, 2));
        register(context, GRANITE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteDiamondOre, 2));
        register(context, GRANITE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteLapisOre, 6));
        register(context, GRANITE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(graniteRedstoneOre, 4));
        
        register(context, DIORITE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteCoalOre, 8));
        register(context, DIORITE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteCopperOre, 8));
        register(context, DIORITE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteIronOre, 6));
        register(context, DIORITE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteGoldOre, 4));
        register(context, DIORITE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteEmeraldOre, 2));
        register(context, DIORITE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteDiamondOre, 2));
        register(context, DIORITE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteLapisOre, 6));
        register(context, DIORITE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dioriteRedstoneOre, 4));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BlockLust.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
