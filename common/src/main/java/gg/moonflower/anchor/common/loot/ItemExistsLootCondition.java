package gg.moonflower.anchor.common.loot;

import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import gg.moonflower.anchor.core.registry.AnchorLootConditions;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParam;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;

import java.util.Set;

public class ItemExistsLootCondition implements LootItemCondition {
    private final ResourceLocation item;

    private ItemExistsLootCondition(ResourceLocation item) {
        this.item = item;
    }

    public LootItemConditionType getType() {
        return AnchorLootConditions.ITEM_EXISTS.get();
    }

    public Set<LootContextParam<?>> getReferencedContextParams() {
        return ImmutableSet.of();
    }

    public boolean test(LootContext arg) {
        return Registry.ITEM.getOptional(this.item).isPresent();
    }

    public static class Serializer implements net.minecraft.world.level.storage.loot.Serializer<ItemExistsLootCondition> {
        public Serializer() {
        }

        public void serialize(JsonObject json, ItemExistsLootCondition value, JsonSerializationContext context) {
            json.addProperty("item", value.item.toString());
        }

        public ItemExistsLootCondition deserialize(JsonObject json, JsonDeserializationContext context) {
            return new ItemExistsLootCondition(new ResourceLocation(GsonHelper.getAsString(json, "item")));
        }
    }
}