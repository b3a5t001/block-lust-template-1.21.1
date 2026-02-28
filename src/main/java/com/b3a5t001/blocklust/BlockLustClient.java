package com.b3a5t001.blocklust;

import com.b3a5t001.blocklust.blocks.ModPlanks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class BlockLustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModPlanks.CACTUS_FRAME, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModPlanks.CACTUS_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModPlanks.CACTUS_TRAPDOOR, BlockRenderLayer.CUTOUT);

    }
}
