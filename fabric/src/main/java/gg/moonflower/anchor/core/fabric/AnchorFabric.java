package gg.moonflower.anchor.core.fabric;

import gg.moonflower.anchor.core.Anchor;
import net.fabricmc.api.ModInitializer;

public class AnchorFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Anchor.PLATFORM.setup();
    }
}
