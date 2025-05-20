package com.b3a5t001.blocklust;

import com.b3a5t001.blocklust.blocks.ModPlanks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockLustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModPlanks.CACTUS_FRAME,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModPlanks.CACTUS_DOOR,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModPlanks.CACTUS_TRAPDOOR,RenderLayer.getCutout());

    }
}
