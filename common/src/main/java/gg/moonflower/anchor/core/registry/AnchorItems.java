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
    private static final Item.Properties SPECIAL_MUSIC_DISC = new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.EPIC);

    public static final Supplier<Item> MUSIC_DISC_FOX = ITEMS.register("music_disc_fox", createRecord(0, AnchorSounds.MUSIC_DISC_FOX, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_HULLABALOO = ITEMS.register("music_disc_hullabaloo", createRecord(0, AnchorSounds.MUSIC_DISC_HULLABALOO, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_EPILOGUE = ITEMS.register("music_disc_epilogue", createRecord(0, AnchorSounds.MUSIC_DISC_EPILOGUE, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_KILOBYTE = ITEMS.register("music_disc_kilobyte", createRecord(0, AnchorSounds.MUSIC_DISC_KILOBYTE, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_WARP = ITEMS.register("music_disc_warp", createRecord(0, AnchorSounds.MUSIC_DISC_WARP, MUSIC_DISC));

    public static final Supplier<Item> MUSIC_DISC_CAPYBARA = ITEMS.register("music_disc_capybara", createRecord(0, AnchorSounds.MUSIC_DISC_CAPYBARA, MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_STAR = ITEMS.register("music_disc_star", createRecord(0, AnchorSounds.MUSIC_DISC_STAR, MUSIC_DISC));

    public static final Supplier<Item> MUSIC_DISC_FRAGMENT = ITEMS.register("music_disc_fragment", createRecord(0, AnchorSounds.MUSIC_DISC_FRAGMENT, SPECIAL_MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_12 = ITEMS.register("music_disc_12", createRecord(0, AnchorSounds.MUSIC_DISC_12, SPECIAL_MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_SUN = ITEMS.register("music_disc_sun", createRecord(0, AnchorSounds.MUSIC_DISC_SUN, SPECIAL_MUSIC_DISC));
    public static final Supplier<Item> MUSIC_DISC_FRACTAL = ITEMS.register("music_disc_fractal", createRecord(0, AnchorSounds.MUSIC_DISC_FRACTAL, SPECIAL_MUSIC_DISC));

    @ExpectPlatform
    public static Supplier<Item> createRecord(int comparatorOutput, Supplier<SoundEvent> soundEventSupplier, Item.Properties properties) {
        return Platform.error();
    }
}
