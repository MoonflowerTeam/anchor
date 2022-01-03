package gg.moonflower.anchor.core.registry.fabric;

import gg.moonflower.anchor.common.item.AnchorRecordItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;

import java.util.function.Supplier;

public class AnchorItemsImpl {
    public static Supplier<Item> createRecord(int comparatorOutput, Supplier<SoundEvent> soundEventSupplier, Item.Properties properties) {
        return () -> new AnchorRecordItem(comparatorOutput, soundEventSupplier.get(), properties);
    }
}
