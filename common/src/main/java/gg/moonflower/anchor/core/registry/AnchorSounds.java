package gg.moonflower.anchor.core.registry;

import gg.moonflower.anchor.core.Anchor;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class AnchorSounds {

    public static final PollinatedRegistry<SoundEvent> SOUNDS = PollinatedRegistry.create(Registry.SOUND_EVENT, Anchor.MOD_ID);

    public static final Supplier<SoundEvent> MUSIC_DISC_FOX = registerSound("music_disc.fox");
    public static final Supplier<SoundEvent> MUSIC_DISC_HULLABALOO = registerSound("music_disc.hullabaloo");
    public static final Supplier<SoundEvent> MUSIC_DISC_EPILOGUE = registerSound("music_disc.epilogue");
    public static final Supplier<SoundEvent> MUSIC_DISC_KILOBYTE = registerSound("music_disc.kilobyte");
    public static final Supplier<SoundEvent> MUSIC_DISC_WARP = registerSound("music_disc.warp");
    public static final Supplier<SoundEvent> MUSIC_DISC_CAPYBARA = registerSound("music_disc.capybara");
    public static final Supplier<SoundEvent> MUSIC_DISC_STAR = registerSound("music_disc.star");
    public static final Supplier<SoundEvent> MUSIC_DISC_FRAGMENT = registerSound("music_disc.fragment");
    public static final Supplier<SoundEvent> MUSIC_DISC_12 = registerSound("music_disc.12");
    public static final Supplier<SoundEvent> MUSIC_DISC_SUN = registerSound("music_disc.sun");
    public static final Supplier<SoundEvent> MUSIC_DISC_FRACTAL = registerSound("music_disc.fractal");

    private static Supplier<SoundEvent> registerSound(String id) {
        return SOUNDS.register(id, () -> new SoundEvent(new ResourceLocation(Anchor.MOD_ID, id)));
    }
}
