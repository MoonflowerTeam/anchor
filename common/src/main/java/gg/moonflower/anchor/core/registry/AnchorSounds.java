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

    public static final Supplier<SoundEvent> MUSIC_OVERWORLD = registerSound("music.overworld");

    public static final Supplier<SoundEvent> MUSIC_NETHER_ACCUMULON = registerSound("music.nether.accumulon");
    public static final Supplier<SoundEvent> MUSIC_NETHER_EULOGY = registerSound("music.nether.eulogy");
    public static final Supplier<SoundEvent> MUSIC_NETHER_QUIETUS = registerSound("music.nether.quietus");

    public static final Supplier<SoundEvent> MUSIC_END_CODA = registerSound("music.end.coda");
    public static final Supplier<SoundEvent> MUSIC_END_THE_VOYAGER = registerSound("music.end.the_voyager");

    private static Supplier<SoundEvent> registerSound(String id) {
        return SOUNDS.register(id, () -> new SoundEvent(new ResourceLocation(Anchor.MOD_ID, id)));
    }
}
