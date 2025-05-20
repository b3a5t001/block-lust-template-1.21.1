package com.b3a5t001.blocklust.world;

import com.b3a5t001.blocklust.BlockLust;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> DRIPSTONE_COAL_ORE_PLACED_KEY = registerKey("dripstone_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_COPPER_ORE_PLACED_KEY = registerKey("dripstone_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_IRON_ORE_PLACED_KEY = registerKey("dripstone_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_GOLD_ORE_PLACED_KEY = registerKey("dripstone_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_EMERALD_ORE_PLACED_KEY = registerKey("dripstone_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_DIAMOND_ORE_PLACED_KEY = registerKey("dripstone_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_LAPIS_ORE_PLACED_KEY = registerKey("dripstone_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_REDSTONE_ORE_PLACED_KEY = registerKey("dripstone_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_COAL_ORE_PLACED_KEY = registerKey("mossy_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_COPPER_ORE_PLACED_KEY = registerKey("mossy_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_IRON_ORE_PLACED_KEY = registerKey("mossy_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_GOLD_ORE_PLACED_KEY = registerKey("mossy_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_EMERALD_ORE_PLACED_KEY = registerKey("mossy_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_DIAMOND_ORE_PLACED_KEY = registerKey("mossy_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_LAPIS_ORE_PLACED_KEY = registerKey("mossy_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_REDSTONE_ORE_PLACED_KEY = registerKey("mossy_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_COAL_ORE_PLACED_KEY = registerKey("tuff_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_COPPER_ORE_PLACED_KEY = registerKey("tuff_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_IRON_ORE_PLACED_KEY = registerKey("tuff_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_GOLD_ORE_PLACED_KEY = registerKey("tuff_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_EMERALD_ORE_PLACED_KEY = registerKey("tuff_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_DIAMOND_ORE_PLACED_KEY = registerKey("tuff_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_LAPIS_ORE_PLACED_KEY = registerKey("tuff_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_REDSTONE_ORE_PLACED_KEY = registerKey("tuff_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_ORE_PLACED_KEY = registerKey("calcite_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_COAL_ORE_PLACED_KEY = registerKey("calcite_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_COPPER_ORE_PLACED_KEY = registerKey("calcite_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_IRON_ORE_PLACED_KEY = registerKey("calcite_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_GOLD_ORE_PLACED_KEY = registerKey("calcite_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_EMERALD_ORE_PLACED_KEY = registerKey("calcite_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_DIAMOND_ORE_PLACED_KEY = registerKey("calcite_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_LAPIS_ORE_PLACED_KEY = registerKey("calcite_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCITE_REDSTONE_ORE_PLACED_KEY = registerKey("calcite_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_COAL_ORE_PLACED_KEY = registerKey("andesite_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_COPPER_ORE_PLACED_KEY = registerKey("andesite_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_IRON_ORE_PLACED_KEY = registerKey("andesite_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_GOLD_ORE_PLACED_KEY = registerKey("andesite_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_EMERALD_ORE_PLACED_KEY = registerKey("andesite_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_DIAMOND_ORE_PLACED_KEY = registerKey("andesite_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_LAPIS_ORE_PLACED_KEY = registerKey("andesite_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_REDSTONE_ORE_PLACED_KEY = registerKey("andesite_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_COAL_ORE_PLACED_KEY = registerKey("diorite_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_COPPER_ORE_PLACED_KEY = registerKey("diorite_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_IRON_ORE_PLACED_KEY = registerKey("diorite_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_GOLD_ORE_PLACED_KEY = registerKey("diorite_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_EMERALD_ORE_PLACED_KEY = registerKey("diorite_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_DIAMOND_ORE_PLACED_KEY = registerKey("diorite_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_LAPIS_ORE_PLACED_KEY = registerKey("diorite_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> DIORITE_REDSTONE_ORE_PLACED_KEY = registerKey("diorite_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_COAL_ORE_PLACED_KEY = registerKey("granite_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_COPPER_ORE_PLACED_KEY = registerKey("granite_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_IRON_ORE_PLACED_KEY = registerKey("granite_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_GOLD_ORE_PLACED_KEY = registerKey("granite_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_EMERALD_ORE_PLACED_KEY = registerKey("granite_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_DIAMOND_ORE_PLACED_KEY = registerKey("granite_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_LAPIS_ORE_PLACED_KEY = registerKey("granite_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> GRANITE_REDSTONE_ORE_PLACED_KEY = registerKey("granite_redstone_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, DRIPSTONE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(300))));
        register(context, DRIPSTONE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(64))));
        register(context, DRIPSTONE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(300))));
        register(context, DRIPSTONE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(16))));
        register(context, DRIPSTONE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(600))));
        register(context, DRIPSTONE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-120), YOffset.fixed(16))));
        register(context, DRIPSTONE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(60))));
        register(context, DRIPSTONE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(16))));

        register(context, MOSSY_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(300))));
        register(context, MOSSY_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(64))));
        register(context, MOSSY_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(300))));
        register(context, MOSSY_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(16))));
        register(context, MOSSY_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(600))));
        register(context, MOSSY_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-120), YOffset.fixed(16))));
        register(context, MOSSY_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(60))));
        register(context, MOSSY_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOSSY_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(16))));

        register(context, TUFF_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(8))));
        register(context, TUFF_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(8))));
        register(context, TUFF_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(8))));
        register(context, TUFF_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(8))));
        register(context, TUFF_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(8))));
        register(context, TUFF_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-120), YOffset.fixed(8))));
        register(context, TUFF_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(8))));
        register(context, TUFF_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(8))));

        register(context, CALCITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(300))));
        register(context, CALCITE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(300))));
        register(context, CALCITE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, CALCITE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(300))));
        register(context, CALCITE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, CALCITE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(600))));
        register(context, CALCITE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, CALCITE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(60))));
        register(context, CALCITE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCITE_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));

        register(context, ANDESITE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, ANDESITE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, ANDESITE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, ANDESITE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, ANDESITE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, ANDESITE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, ANDESITE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(60))));
        register(context, ANDESITE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANDESITE_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));

        register(context, DIORITE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, DIORITE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, DIORITE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, DIORITE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, DIORITE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, DIORITE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, DIORITE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(60))));
        register(context, DIORITE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIORITE_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));

        register(context, GRANITE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, GRANITE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, GRANITE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, GRANITE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, GRANITE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(100))));
        register(context, GRANITE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));
        register(context, GRANITE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(60))));
        register(context, GRANITE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRANITE_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(16))));

    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(BlockLust.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
