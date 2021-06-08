package io.github.sefiraat.simplestorage.items.materials.gold;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.statics.Messages;
import io.github.sefiraat.simplestorage.statics.Skulls;
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GemProustite extends UnplaceableBlock implements NotPlaceable, GEOResource {

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "MATERIAL_PROUSTITE",
            Skulls.ITEM_PROUSTITE,
            Messages.THEME_ITEM_CRAFTING + "Proustite Crystal",
            "",
            Messages.THEME_PASSIVE + "GemProustite crystals are a rare resource that",
            Messages.THEME_PASSIVE + "are used for more advanced data transfer.",
            Messages.THEME_PASSIVE + "Only found in the hottest locations.",
            "",
            Messages.THEME_ITEM_TYPEDESC + "Base Resource"
    );

    private final NamespacedKey key;

    public GemProustite(SimpleStorage plugin, Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        this.key = new NamespacedKey(SimpleStorage.inst(), "proustite_crystal");
        register();
        register(plugin);
    }

    @Override
    public int getDefaultSupply(@NotNull World.Environment environment, @NotNull Biome biome) {
        switch (environment) {
            case NETHER:
                return 2;
            default:
                return 0;
        }
    }

    @Override
    public int getMaxDeviation() {
        return 2;
    }

    @Override
    public @NotNull String getName() {
        return "Proustite Crystal";
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

    @NotNull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

}
