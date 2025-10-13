package net.dingletherat.covers.item;

import net.dingletherat.covers.BookCovers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CoverGroup {
    public static final ItemGroup COVER_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BookCovers.MOD_ID, "books_covers"),
            FabricItemGroup.builder().icon(() -> new ItemStack(CoverItems.AMETHYST_COVER))
                    .displayName(Text.translatable("itemgroup.book-covers.books_covers"))
                    .entries((displayContext, entries) -> {
                        entries.add(CoverItems.COVER);
                        entries.add(CoverItems.AMETHYST_COVER);
                        entries.add(CoverItems.COPPER_COVER);
                        entries.add(CoverItems.DIAMOND_COVER);
                        entries.add(CoverItems.EMERALD_COVER);
                        entries.add(CoverItems.GOLD_COVER);
                        entries.add(CoverItems.IRON_COVER);
                        entries.add(CoverItems.LAPIS_COVER);
                        entries.add(CoverItems.QUARTZ_COVER);
                        entries.add(CoverItems.NETHERITE_COVER);
                        entries.add(CoverItems.REDSTONE_COVER);
                        entries.add(CoverItems.RESIN_COVER);
                    }).build());


    public static void registerItemGroups() {
        BookCovers.LOGGER.info("Registering groups for " + BookCovers.MOD_ID);
    }
}
