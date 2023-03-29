package gg.moonflower.anchor.core.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import gg.moonflower.anchor.common.music.SuppliedMusic;
import gg.moonflower.anchor.core.Anchor;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class AnchorSounds {

    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Anchor.MOD_ID, Registry.SOUND_EVENT_REGISTRY);

    public static final RegistrySupplier<SoundEvent> MUSIC_OVERWORLD_SKY = registerSound("music.overworld.sky");
    public static final SuppliedMusic OVERWORLD_SKY = new SuppliedMusic(MUSIC_OVERWORLD_SKY, 12000, 24000, false);
    public static final RegistrySupplier<SoundEvent> MUSIC_OVERWORLD_DEEP = registerSound("music.overworld.deep");
    public static final SuppliedMusic OVERWORLD_DEEP = new SuppliedMusic(MUSIC_OVERWORLD_DEEP, 12000, 24000, false);
    public static final RegistrySupplier<SoundEvent> MUSIC_NETHER_ROOF = registerSound("music.nether.roof");
    public static final SuppliedMusic NETHER_ROOF = new SuppliedMusic(MUSIC_NETHER_ROOF, 12000, 24000, false);

    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FOX = registerSound("music_disc.fox");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_HULLABALOO = registerSound("music_disc.hullabaloo");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_EPILOGUE = registerSound("music_disc.epilogue");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_KILOBYTE = registerSound("music_disc.kilobyte");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_WARP = registerSound("music_disc.warp");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CAPYBARA = registerSound("music_disc.capybara");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_STAR = registerSound("music_disc.star");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FRAGMENT = registerSound("music_disc.fragment");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_12 = registerSound("music_disc.12");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SUN = registerSound("music_disc.sun");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_FRACTAL = registerSound("music_disc.fractal");

    private static RegistrySupplier<SoundEvent> registerSound(String id) {
        return REGISTRY.register(id, () -> new SoundEvent(new ResourceLocation(Anchor.MOD_ID, id)));
    }
}
