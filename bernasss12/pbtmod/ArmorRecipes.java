package bernasss12.pbtmod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArmorRecipes {

	public static ItemStack enxIronHelmet;
	public static ItemStack enxIronChestplate;
	public static ItemStack enxIronLeggings;
	public static ItemStack enxIronBoots;

	public static void addArmorRecipes() {

		// Basic Forms
		// Iron
		ItemStack enxIronHelmet = new ItemStack(PBTMod.blazedIronHelmet);
		ItemStack enxIronChestplate = new ItemStack(PBTMod.blazedIronChestplate);
		ItemStack enxIronLeggings = new ItemStack(PBTMod.blazedIronLeggings);
		ItemStack enxIronBoots = new ItemStack(PBTMod.blazedIronBoots);
		enxIronHelmet.addEnchantment(Enchantment.fireProtection, 1);
		enxIronChestplate.addEnchantment(Enchantment.fireProtection, 1);
		enxIronLeggings.addEnchantment(Enchantment.fireProtection, 1);
		enxIronBoots.addEnchantment(Enchantment.fireProtection, 1);

		// Gold
		ItemStack enxGoldHelmet = new ItemStack(PBTMod.blazedGoldHelmet);
		ItemStack enxGoldChestplate = new ItemStack(PBTMod.blazedGoldChestplate);
		ItemStack enxGoldLeggings = new ItemStack(PBTMod.blazedGoldLeggings);
		ItemStack enxGoldBoots = new ItemStack(PBTMod.blazedGoldBoots);
		enxGoldHelmet.addEnchantment(Enchantment.fireProtection, 2);
		enxGoldChestplate.addEnchantment(Enchantment.fireProtection, 2);
		enxGoldLeggings.addEnchantment(Enchantment.fireProtection, 2);
		enxGoldBoots.addEnchantment(Enchantment.fireProtection, 2);

		// Diamond
		ItemStack enxDiamondHelmet = new ItemStack(PBTMod.blazedDiamondHelmet);
		ItemStack enxDiamondChestplate = new ItemStack(
				PBTMod.blazedDiamondChestplate);
		ItemStack enxDiamondLeggings = new ItemStack(
				PBTMod.blazedDiamondLeggings);
		ItemStack enxDiamondBoots = new ItemStack(PBTMod.blazedDiamondBoots);
		enxDiamondHelmet.addEnchantment(Enchantment.fireProtection, 3);
		enxDiamondChestplate.addEnchantment(Enchantment.fireProtection, 3);
		enxDiamondLeggings.addEnchantment(Enchantment.fireProtection, 3);
		enxDiamondBoots.addEnchantment(Enchantment.fireProtection, 3);

		// Iron
		GameRegistry.addRecipe(enxIronHelmet, new Object[] { "III", "I I", 'I',
				PBTMod.blazedIronIngot });
		GameRegistry.addRecipe(enxIronChestplate, new Object[] { "I I", "III",
				"III", 'I', PBTMod.blazedIronIngot });
		GameRegistry.addRecipe(enxIronLeggings, new Object[] { "III", "I I",
				"I I", 'I', PBTMod.blazedIronIngot, });
		GameRegistry.addRecipe(enxIronBoots, new Object[] { "I I", "I I", 'I',
				PBTMod.blazedIronIngot, });

		// Gold
		GameRegistry.addRecipe(enxGoldHelmet, new Object[] { "III", "I I", 'I',
				PBTMod.blazedGoldIngot });
		GameRegistry.addRecipe(enxGoldChestplate, new Object[] { "I I", "III",
				"III", 'I', PBTMod.blazedGoldIngot });
		GameRegistry.addRecipe(enxGoldLeggings, new Object[] { "III", "I I",
				"I I", 'I', PBTMod.blazedGoldIngot, });
		GameRegistry.addRecipe(enxGoldBoots, new Object[] { "I I", "I I", 'I',
				PBTMod.blazedGoldIngot, });

		// Diamond
		GameRegistry.addRecipe(enxDiamondHelmet, new Object[] { "III", "I I",
				'I', PBTMod.blazedDiamond });
		GameRegistry.addRecipe(enxDiamondChestplate, new Object[] { "I I",
				"III", "III", 'I', PBTMod.blazedDiamond });
		GameRegistry.addRecipe(enxDiamondLeggings, new Object[] { "III", "I I",
				"I I", 'I', PBTMod.blazedDiamond, });
		GameRegistry.addRecipe(enxDiamondBoots, new Object[] { "I I", "I I",
				'I', PBTMod.blazedDiamond, });

		// Blazing Diamond

	}

}
