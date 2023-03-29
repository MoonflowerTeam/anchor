package gg.moonflower.anchor.core.forge;

import dev.architectury.forge.ArchitecturyForge;
import dev.architectury.platform.forge.EventBuses;
import gg.moonflower.anchor.core.Anchor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Anchor.MOD_ID)
public class AnchorForge {
    public AnchorForge() {
        EventBuses.registerModEventBus(Anchor.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Anchor.onCommonInit();
    }
}
