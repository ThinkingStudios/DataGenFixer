package org.thinkingstudio.datagenfixer.fabric.mixin;

import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("UnstableApiUsage")
@Mixin(value = FabricDataGenHelper.class, remap = false)
public class FabricDataGenHelperMixin {
    @Inject(method = "run", at = @At("TAIL"))
    private static void dataGenFix$run(CallbackInfo ci) {
        System.exit(0);
    }
}
