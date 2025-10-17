package net.dingletherat.covers.item;

import net.dingletherat.covers.BookCovers;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class CoverItems {
    public static final TagKey<Item> COVER_TAG = TagKey.of(RegistryKeys.ITEM, Identifier.of(BookCovers.MOD_ID, "covers"));

    // Covers
    public static final Item COVER = registerItem("book_cover", Item::new);
    public static final Item AMETHYST_COVER = registerItem("amethyst_book_cover", Item::new);
    public static final Item COPPER_COVER = registerItem("copper_book_cover", Item::new);
    public static final Item DIAMOND_COVER = registerItem("diamond_book_cover", Item::new);
    public static final Item EMERALD_COVER = registerItem("emerald_book_cover", Item::new);
    public static final Item GOLD_COVER = registerItem("gold_book_cover", Item::new);
    public static final Item IRON_COVER = registerItem("iron_book_cover", Item::new);
    public static final Item LAPIS_COVER = registerItem("lapis_book_cover", Item::new);
    public static final Item QUARTZ_COVER = registerItem("quartz_book_cover", Item::new);
    public static final Item NETHERITE_COVER = registerItem("netherite_book_cover", Item::new);
    public static final Item REDSTONE_COVER = registerItem("redstone_book_cover", Item::new);
    public static final Item RESIN_COVER = registerItem("resin_book_cover", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(BookCovers.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BookCovers.MOD_ID, name)))));
    }



    public static void registerItems() {
        BookCovers.LOGGER.info("Registering items for " + BookCovers.MOD_ID);
    }
}
