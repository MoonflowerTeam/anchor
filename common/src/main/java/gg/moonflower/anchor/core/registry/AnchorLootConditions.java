package gg.moonflower.anchor.core.registry;

import gg.moonflower.anchor.common.loot.ItemExistsLootCondition;
import gg.moonflower.anchor.core.Anchor;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;

import java.util.function.Supplier;

public class AnchorLootConditions {

    public static final PollinatedRegistry<LootItemConditionType> LOOT_CONDITIONS = PollinatedRegistry.createVanilla(Registry.LOOT_CONDITION_TYPE, Anchor.MOD_ID);

    public static final Supplier<LootItemConditionType> ITEM_EXISTS = LOOT_CONDITIONS.register("item_exists", () -> new LootItemConditionType(new ItemExistsLootCondition.Serializer()));
}
