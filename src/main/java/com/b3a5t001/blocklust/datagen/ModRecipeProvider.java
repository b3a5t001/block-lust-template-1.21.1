package com.b3a5t001.blocklust.datagen;

import com.b3a5t001.blocklust.datagen.recipeproviders.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        new StoneCuttingRecipes().generate(exporter);
        new MossyStoneCuttingRecipes().generate(exporter);
        new SmeltingRecipes().generate(exporter);
        new PlanksCraftingRecipes().generate(exporter);
        new StoneCraftingRecipes().generate(exporter);
        new MossyStoneCraftingRecipes().generate(exporter);
    }
}