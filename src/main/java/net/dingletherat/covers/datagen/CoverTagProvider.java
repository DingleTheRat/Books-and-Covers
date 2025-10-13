package net.dingletherat.covers.datagen;

import net.dingletherat.covers.item.CoverItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CoverTagProvider extends FabricTagProvider.ItemTagProvider {
    public CoverTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(CoverItems.COVER_TAG)
                .add(CoverItems.COVER)
                .add(CoverItems.AMETHYST_COVER)
                .add(CoverItems.COPPER_COVER)
                .add(CoverItems.DIAMOND_COVER)
                .add(CoverItems.EMERALD_COVER)
                .add(CoverItems.GOLD_COVER)
                .add(CoverItems.IRON_COVER)
                .add(CoverItems.LAPIS_COVER)
                .add(CoverItems.QUARTZ_COVER)
                .add(CoverItems.NETHERITE_COVER)
                .add(CoverItems.REDSTONE_COVER)
                .add(CoverItems.RESIN_COVER);
    }
}
