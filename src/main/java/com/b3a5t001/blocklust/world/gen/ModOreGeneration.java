package com.b3a5t001.blocklust.world.gen;

import com.b3a5t001.blocklust.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_REDSTONE_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOSSY_REDSTONE_ORE_PLACED_KEY); 
        
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CALCITE_REDSTONE_ORE_PLACED_KEY);  
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANDESITE_REDSTONE_ORE_PLACED_KEY); 
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRANITE_REDSTONE_ORE_PLACED_KEY);  
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIORITE_REDSTONE_ORE_PLACED_KEY);  
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_COAL_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_COPPER_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_EMERALD_ORE_PLACED_KEY);   
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_DIAMOND_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_LAPIS_ORE_PLACED_KEY);    
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_REDSTONE_ORE_PLACED_KEY);          
    }
}
