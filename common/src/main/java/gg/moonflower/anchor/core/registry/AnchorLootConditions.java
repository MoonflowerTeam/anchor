package gg.moonflower.anchor.core.registry;

import dev.architectury.registry.registries.DeferredRegister;
import gg.moonflower.anchor.common.loot.ItemExistsLootCondition;
import gg.moonflower.anchor.core.Anchor;
import net.minecraft.core.Registry;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;

import java.util.function.Supplier;

public class AnchorLootConditions {

    public static final DeferredRegister<LootItemConditionType> REGISTRY = DeferredRegister.create(Anchor.MOD_ID, Registry.LOOT_ITEM_REGISTRY);

    public static final Supplier<LootItemConditionType> ITEM_EXISTS = REGISTRY.register("item_exists", () -> new LootItemConditionType(new ItemExistsLootCondition.Serializer()));
}
