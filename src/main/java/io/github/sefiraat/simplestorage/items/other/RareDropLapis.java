package io.github.sefiraat.simplestorage.items.other;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class RareDropLapis {

    private RareDropLapis() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "MECHANIC_DROP_LAPIS",
            Material.LAPIS_ORE,
            Theme.ITEM_RARE_DROP + "稀有掉落: 青金石",
            "",
            Theme.PASSIVE + "此物品是稀有掉落自",
            Theme.PASSIVE + "青金石礦. 方塊必須實際上的打破",
            Theme.PASSIVE + "不能有絲綢之觸.",
            "",
            Theme.LORE_TYPE_DROP
    );

    public static final RecipeType TYPE = new RecipeType(new NamespacedKey(SimpleStorage.inst(), "drop-lapis"), STACK, "");

}
