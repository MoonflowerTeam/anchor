package gg.moonflower.anchor.common.music;

import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class SuppliedMusic extends Music {

    private final Supplier<SoundEvent> soundEventSupplier;

    public SuppliedMusic(Supplier<SoundEvent> soundEvent, int minDelay, int maxDelay, boolean replaceCurrentMusic) {
        //noinspection ConstantConditions
        super(null, minDelay, maxDelay, replaceCurrentMusic);
        this.soundEventSupplier = soundEvent;
    }

    @Override
    public SoundEvent getEvent() {
        return soundEventSupplier.get();
    }
}
