package gg.moonflower.anchor.core.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import gg.moonflower.anchor.core.Anchor;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.function.Supplier;

public class AnchorItems {

    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, Anchor.MOD_ID);

    private static final Item.Properties MUSIC_DISC = new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE);

    public static final Supplier<Item> MUSIC_DISC_FOX = ITEMS.register("music_disc_fox", createRecord(0, AnchorSounds.MUSIC_DISC_FOX, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_HULLABALOO = ITEMS.register("music_disc_hullabaloo", createRecord(0, AnchorSounds.MUSIC_DISC_HULLABALOO, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_EPILOGUE = ITEMS.register("music_disc_epilogue", createRecord(0, AnchorSounds.MUSIC_DISC_EPILOGUE, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_KILOBYTE = ITEMS.register("music_disc_kilobyte", createRecord(0, AnchorSounds.MUSIC_DISC_KILOBYTE, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_WARP = ITEMS.register("music_disc_warp", createRecord(0, AnchorSounds.MUSIC_DISC_WARP, MUSIC_DISC));

    @ExpectPlatform
    public static Supplier<Item> createRecord(int comparatorOutput, Supplier<SoundEvent> soundEventSupplier, Item.Properties properties) {
        return Platform.error();
    }
}
