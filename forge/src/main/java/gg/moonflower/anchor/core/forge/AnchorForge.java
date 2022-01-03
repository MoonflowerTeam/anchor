package gg.moonflower.anchor.core.forge;

import gg.moonflower.anchor.core.Anchor;
import net.minecraftforge.fml.common.Mod;

@Mod(Anchor.MOD_ID)
public class AnchorForge {
    public AnchorForge() {
        Anchor.PLATFORM.setup();
    }
}
