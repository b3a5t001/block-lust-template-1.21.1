package com.b3a5t001.blocklust.datagen;

import com.b3a5t001.blocklust.datagen.recipeproviders.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    public static void offerStairsRecipe(RecipeGenerator generator, RecipeExporter exporter,
                                          ItemConvertible output, ItemConvertible input){
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', input)
                .criterion(generator.hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }



    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {

            @Override
            public void generate() {
                new StoneCuttingRecipes(registryLookup, exporter).generate();
                new MossyStoneCuttingRecipes(registryLookup, exporter).generate();
                new SmeltingRecipes(registryLookup, exporter).generate();
                new PlanksCraftingRecipes(registryLookup, exporter).generate();
                new StoneCraftingRecipes(registryLookup, exporter).generate();
                new MossyStoneCraftingRecipes(registryLookup, exporter).generate();
            }
        };
    }

    @Override
    public String getName() {
        return "BlockLust Recipe Provider";
    }
}
