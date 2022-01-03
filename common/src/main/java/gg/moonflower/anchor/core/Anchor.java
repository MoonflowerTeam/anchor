package gg.moonflower.anchor.core;

import gg.moonflower.anchor.core.registry.AnchorItems;
import gg.moonflower.anchor.core.registry.AnchorSounds;
import gg.moonflower.pollen.api.platform.Platform;

public class Anchor {
    public static final String MOD_ID = "anchor";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(Anchor::onClientInit)
            .clientPostInit(Anchor::onClientPostInit)
            .commonInit(Anchor::onCommonInit)
            .commonPostInit(Anchor::onCommonPostInit)
            .build();

    public static void onClientInit() {
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onCommonInit() {
        AnchorItems.ITEMS.register(Anchor.PLATFORM);
        AnchorSounds.SOUNDS.register(Anchor.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }
}
