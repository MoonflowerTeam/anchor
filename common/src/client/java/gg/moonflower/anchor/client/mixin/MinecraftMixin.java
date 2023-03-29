package gg.moonflower.anchor.client.mixin;

import gg.moonflower.anchor.core.registry.AnchorSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.Music;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Shadow @Nullable public LocalPlayer player;

    @Inject(method = "getSituationalMusic", at = @At("HEAD"), cancellable = true)
    private void anchor$addMusic(CallbackInfoReturnable<Music> cir) {
        if (this.player != null && this.player.level != null) {
            ClientLevel level = (ClientLevel) this.player.level;
            double y = this.player.getY();
            if (level.dimension() == Level.OVERWORLD) {
                if (y >= level.effects().getCloudHeight()) {
                    cir.setReturnValue(AnchorSounds.OVERWORLD_SKY); // Above cloud height
                } else if (y < 0) {
                    cir.setReturnValue(AnchorSounds.OVERWORLD_DEEP); // Under y 0
                }
            } else if (level.dimension() == Level.NETHER && y >= level.dimensionType().logicalHeight()) {
                cir.setReturnValue(AnchorSounds.NETHER_ROOF); // Above the nether roof
            }
        }
    }
}
