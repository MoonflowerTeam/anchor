package gg.moonflower.anchor.core.registry;

import dev.architectury.core.item.ArchitecturyRecordItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import gg.moonflower.anchor.core.Anchor;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class AnchorItems {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Anchor.MOD_ID, Registry.ITEM_REGISTRY);

    private static final Item.Properties MUSIC_DISC = new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE);
    public static final RegistrySupplier<Item> MUSIC_DISC_FOX = REGISTRY.register("music_disc_fox", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_FOX, MUSIC_DISC, 116));
    public static final RegistrySupplier<Item> MUSIC_DISC_HULLABALOO = REGISTRY.register("music_disc_hullabaloo", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_HULLABALOO, MUSIC_DISC, 134));
    public static final RegistrySupplier<Item> MUSIC_DISC_EPILOGUE = REGISTRY.register("music_disc_epilogue", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_EPILOGUE, MUSIC_DISC, 77));
    public static final RegistrySupplier<Item> MUSIC_DISC_KILOBYTE = REGISTRY.register("music_disc_kilobyte", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_KILOBYTE, MUSIC_DISC, 163));
    public static final RegistrySupplier<Item> MUSIC_DISC_WARP = REGISTRY.register("music_disc_warp", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_WARP, MUSIC_DISC, 140));
    public static final RegistrySupplier<Item> MUSIC_DISC_CAPYBARA = REGISTRY.register("music_disc_capybara", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_CAPYBARA, MUSIC_DISC, 173));
    public static final RegistrySupplier<Item> MUSIC_DISC_STAR = REGISTRY.register("music_disc_star", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_STAR, MUSIC_DISC, 168));
    private static final Item.Properties SPECIAL_MUSIC_DISC = new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.EPIC);
    public static final RegistrySupplier<Item> MUSIC_DISC_FRAGMENT = REGISTRY.register("music_disc_fragment", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_FRAGMENT, SPECIAL_MUSIC_DISC, 18));
    public static final RegistrySupplier<Item> MUSIC_DISC_12 = REGISTRY.register("music_disc_12", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_12, SPECIAL_MUSIC_DISC, 104));
    public static final RegistrySupplier<Item> MUSIC_DISC_SUN = REGISTRY.register("music_disc_sun", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_SUN, SPECIAL_MUSIC_DISC, 138));
    public static final RegistrySupplier<Item> MUSIC_DISC_FRACTAL = REGISTRY.register("music_disc_fractal", () -> new ArchitecturyRecordItem(0, AnchorSounds.MUSIC_DISC_FRACTAL, SPECIAL_MUSIC_DISC, 116));
}
