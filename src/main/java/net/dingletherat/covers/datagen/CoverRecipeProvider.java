package net.dingletherat.covers.datagen;

import net.dingletherat.covers.item.CoverItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CoverRecipeProvider extends FabricRecipeProvider {
    public CoverRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                // Cover Recipe
                createShaped(RecipeCategory.MISC, CoverItems.COVER)
                        .pattern("   ")
                        .pattern("LL ")
                        .pattern("LL ")
                        .input('L', Items.LEATHER)
                        .criterion("has_leather", conditionsFromItem(Items.LEATHER))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Book & Covers Recipes";
    }
}
