package com.b3a5t001.blocklust.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> MOSSY_SOURCES =
            TagKey.of(RegistryKeys.ITEM, Identifier.of("blocklust","mossy_sources"));
}
