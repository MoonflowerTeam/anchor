package gg.moonflower.anchor.core.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class AnchorMusics {

    public static final SuppliedMusic MUSIC_NETHER_FORTRESS = createGameMusic(AnchorSounds.MUSIC_NETHER_EULOGY);
    public static final SuppliedMusic MUSIC_END_CITY = createGameMusic(AnchorSounds.MUSIC_END_THE_VOYAGER);

    private static SuppliedMusic createGameMusic(Supplier<SoundEvent> soundEvent) {
        return new SuppliedMusic(soundEvent, 12000, 24000, false);
    }

    static class SuppliedMusic extends Music {

        private final Supplier<SoundEvent> soundEventSupplier;

        public SuppliedMusic(Supplier<SoundEvent> soundEvent, int minDelay, int maxDelay, boolean replace) {
            super(null, minDelay, maxDelay, replace);
            this.soundEventSupplier = soundEvent;
        }

        @Environment(EnvType.CLIENT)
        public SoundEvent getEvent() {
            return this.soundEventSupplier.get();
        }
    }
}
