package net.dingletherat.covers;

import net.dingletherat.covers.datagen.CoverRecipeProvider;
import net.dingletherat.covers.datagen.CoverTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CoverDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CoverRecipeProvider::new);
        pack.addProvider(CoverTagProvider::new);
	}
}
