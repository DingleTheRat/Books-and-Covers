package net.dingletherat.covers.mixin;

import net.dingletherat.covers.item.CoverItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AnvilScreenHandler.class)
public class CustomAnvilRecipes {
    // Book
    @Inject(method = "updateResult", at = @At("HEAD"), cancellable = true)
    private void injectBookRecipe(CallbackInfo ci) {
        checkCoverAndPaper(ci, CoverItems.COVER, Items.PAPER, new ItemStack(Items.BOOK));
    }

    // Covers
    @Inject(method = "updateResult", at = @At("HEAD"), cancellable = true)
    private void injectAmethystCoverRecipe(CallbackInfo ci) {
        checkCoverAndPaper(ci,Items.AMETHYST_SHARD, new ItemStack(CoverItems.AMETHYST_COVER));
    }

    @Unique
    private void checkCoverAndPaper(CallbackInfo ci, Item rightItem, ItemStack output) {
        AnvilScreenHandler handler = (AnvilScreenHandler) (Object) this;
        ItemStack left = handler.getSlot(0).getStack();
        ItemStack right = handler.getSlot(1).getStack();

        if (left.isIn(CoverItems.COVER_TAG) && right.getItem() == rightItem) {
            handler.getSlot(2).setStack(output);
            handler.setProperty(0, 1);
            ci.cancel();
        }
    }
    @Unique
    private void checkCoverAndPaper(CallbackInfo ci, Item leftItem, Item rightItem, ItemStack output) {
        AnvilScreenHandler handler = (AnvilScreenHandler) (Object) this;
        ItemStack left = handler.getSlot(0).getStack();
        ItemStack right = handler.getSlot(1).getStack();

        if (left.getItem() == leftItem && right.getItem() == rightItem) {
            handler.getSlot(2).setStack(output);
            handler.setProperty(0, 1);
            ci.cancel();
        }
    }
    
    // Alternative Book Covers
}
