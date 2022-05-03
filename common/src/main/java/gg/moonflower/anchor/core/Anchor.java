package gg.moonflower.anchor.core;

import gg.moonflower.anchor.core.registry.AnchorItems;
import gg.moonflower.anchor.core.registry.AnchorLootConditions;
import gg.moonflower.anchor.core.registry.AnchorSounds;
import gg.moonflower.pollen.api.platform.Platform;

public class Anchor {
    public static final String MOD_ID = "anchor";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .commonInit(Anchor::onCommonInit)
            .build();

    public static void onCommonInit() {
        AnchorItems.ITEMS.register(Anchor.PLATFORM);
        AnchorSounds.SOUNDS.register(Anchor.PLATFORM);
        AnchorLootConditions.LOOT_CONDITIONS.register(Anchor.PLATFORM);
    }
}
