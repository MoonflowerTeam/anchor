package gg.moonflower.anchor.core;

import gg.moonflower.anchor.core.registry.AnchorItems;
import gg.moonflower.anchor.core.registry.AnchorLootConditions;
import gg.moonflower.anchor.core.registry.AnchorSounds;

public class Anchor {
    public static final String MOD_ID = "anchor";

    public static void onCommonInit() {
        AnchorItems.REGISTRY.register();
        AnchorSounds.REGISTRY.register();
        AnchorLootConditions.REGISTRY.register();
    }
}
