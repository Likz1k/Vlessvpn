package ru.likzik.crosscobweb;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrossCobweb extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey key = new NamespacedKey(this, "string_cross_to_cobweb");

        ShapedRecipe recipe = new ShapedRecipe(key, new ItemStack(Material.COBWEB));
        recipe.shape(
                "S S",
                " S ",
                "S S"
        );
        recipe.setIngredient('S', Material.STRING);

        getServer().addRecipe(recipe);
        getLogger().info("CrossCobweb enabled: 5 strings -> 1 cobweb.");
    }
}
