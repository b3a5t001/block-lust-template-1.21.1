package com.b3a5t001.blocklust.datagen;

import com.b3a5t001.blocklust.blocks.ModPlanks;
import com.b3a5t001.blocklust.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModPlanks.CACTUS_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModPlanks.CACTUS_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModPlanks.CACTUS_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModPlanks.CACTUS_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModPlanks.CACTUS_FENCE.asItem())
                .add(ModPlanks.MOSSY_CACTUS_FENCE.asItem())
                .add(ModPlanks.MOSSY_ACACIA_FENCE.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_FENCE.asItem())
                .add(ModPlanks.MOSSY_BIRCH_FENCE.asItem())
                .add(ModPlanks.MOSSY_CHERRY_FENCE.asItem())
                .add(ModPlanks.MOSSY_CRIMSON_FENCE.asItem())
                .add(ModPlanks.MOSSY_JUNGLE_FENCE.asItem())
                .add(ModPlanks.MOSSY_OAK_FENCE.asItem())
                .add(ModPlanks.MOSSY_DARK_OAK_FENCE.asItem())
                .add(ModPlanks.MOSSY_MANGROVE_FENCE.asItem())
                .add(ModPlanks.MOSSY_SPRUCE_FENCE.asItem())
                .add(ModPlanks.MOSSY_WARPED_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModPlanks.CACTUS_SLAB.asItem())
                .add(ModPlanks.MOSSY_CACTUS_SLAB.asItem())
                .add(ModPlanks.MOSSY_CHERRY_STAIRS.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_MOSAIC_SLAB.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_SLAB.asItem())
                .add(ModPlanks.MOSSY_BIRCH_SLAB.asItem())
                .add(ModPlanks.MOSSY_JUNGLE_SLAB.asItem())
                .add(ModPlanks.MOSSY_OAK_SLAB.asItem())
                .add(ModPlanks.MOSSY_DARK_OAK_SLAB.asItem())
                .add(ModPlanks.MOSSY_WARPED_SLAB.asItem())
                .add(ModPlanks.MOSSY_CRIMSON_SLAB.asItem())
                .add(ModPlanks.MOSSY_MANGROVE_SLAB.asItem())
                .add(ModPlanks.MOSSY_SPRUCE_PLANKS.asItem())
                .add(ModPlanks.MOSSY_ACACIA_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModPlanks.CACTUS_STAIRS.asItem())
                .add(ModPlanks.MOSSY_CACTUS_STAIRS.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_MOSAIC_STAIRS.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_STAIRS.asItem())
                .add(ModPlanks.MOSSY_BIRCH_STAIRS.asItem())
                .add(ModPlanks.MOSSY_JUNGLE_STAIRS.asItem())
                .add(ModPlanks.MOSSY_OAK_STAIRS.asItem())
                .add(ModPlanks.MOSSY_DARK_OAK_STAIRS.asItem())
                .add(ModPlanks.MOSSY_WARPED_STAIRS.asItem())
                .add(ModPlanks.MOSSY_CRIMSON_STAIRS.asItem())
                .add(ModPlanks.MOSSY_CHERRY_STAIRS.asItem())
                .add(ModPlanks.MOSSY_MANGROVE_STAIRS.asItem())
                .add(ModPlanks.MOSSY_SPRUCE_STAIRS.asItem())
                .add(ModPlanks.MOSSY_ACACIA_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModPlanks.CACTUS_PLANKS.asItem())
                .add(ModPlanks.MOSSY_CACTUS_PLANKS.asItem())
                .add(ModPlanks.MOSSY_BIRCH_PLANKS.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_PLANKS.asItem())
                .add(ModPlanks.MOSSY_BAMBOO_MOSAIC.asItem())
                .add(ModPlanks.MOSSY_CHERRY_PLANKS.asItem())
                .add(ModPlanks.MOSSY_CRIMSON_PLANKS.asItem())
                .add(ModPlanks.MOSSY_DARK_OAK_PLANKS.asItem())
                .add(ModPlanks.MOSSY_JUNGLE_PLANKS.asItem())
                .add(ModPlanks.MOSSY_OAK_PLANKS.asItem())
                .add(ModPlanks.MOSSY_MANGROVE_PLANKS.asItem())
                .add(ModPlanks.MOSSY_SPRUCE_PLANKS.asItem())
                .add(ModPlanks.MOSSY_WARPED_PLANKS.asItem());
        getOrCreateTagBuilder(ModItemTags.MOSSY_SOURCES)
                .add(Items.MOSS_BLOCK)
                .add(Items.VINE);

    }
}
