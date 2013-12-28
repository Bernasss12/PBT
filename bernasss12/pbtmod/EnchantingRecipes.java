package bernasss12.pbtmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;

public class EnchantingRecipes {

	public static ItemStack enxIronHelmetPI;
	public static ItemStack enxIronChestplatePI;
	public static ItemStack enxIronLeggingsPI;
	public static ItemStack enxIronBootsPI;

	public static void addEnchantingRecipes() {

		// Enchanted States
		// Iron Enchanting
		// Tools

		// Armor
		ItemStack enxIronHelmetPI = (ArmorRecipes.enxIronHelmet);
		ItemStack enxIronChestplatePI = (ArmorRecipes.enxIronChestplate);
		ItemStack enxIronLeggingsPI = (ArmorRecipes.enxIronLeggings);
		ItemStack enxIronBootsPI = (ArmorRecipes.enxIronBoots);
		enxIronHelmetPI.addEnchantment(Enchantment.protection, 1);
		enxIronChestplatePI.addEnchantment(Enchantment.protection, 1);
		enxIronLeggingsPI.addEnchantment(Enchantment.protection, 1);
		enxIronBootsPI.addEnchantment(Enchantment.protection, 1);

		// Gold Enchanting
		// Tools

		// Armor

		// Diamond Enchanting
		// Tools
		ItemStack enxDiamondPickFortuneI = new ItemStack(
				PBTMod.blazedDiamondPick);
		enxDiamondPickFortuneI.addEnchantment(Enchantment.fortune, 1);

		ItemStack enxDiamondPickFortuneII = new ItemStack(
				PBTMod.blazedDiamondPick);
		enxDiamondPickFortuneII.addEnchantment(Enchantment.fortune, 2);

		ItemStack enxDiamondPickFortuneIII = new ItemStack(
				PBTMod.blazedDiamondPick);
		enxDiamondPickFortuneIII.addEnchantment(Enchantment.fortune, 3);
		// Armor

		/*****************************************************************************************************************************************/

		// Iron Enchanting
		// Tools

		// Armor
		GameRegistry.addShapelessRecipe(enxIronHelmetPI, new Object[] {
				ArmorRecipes.enxIronHelmet,
				new ItemStack(PBTMod.blazedProtection, 0, 0) });
		GameRegistry.addShapelessRecipe(enxIronChestplatePI, new Object[] {
				ArmorRecipes.enxIronChestplate,
				new ItemStack(PBTMod.blazedProtection, 0, 0) });
		GameRegistry.addShapelessRecipe(enxIronLeggingsPI, new Object[] {
				ArmorRecipes.enxIronLeggings,
				new ItemStack(PBTMod.blazedProtection, 0, 0) });
		GameRegistry.addShapelessRecipe(enxIronBootsPI, new Object[] {
				ArmorRecipes.enxIronBoots,
				new ItemStack(PBTMod.blazedProtection, 0, 0) });

		// Gold Enchanting
		// Tools

		// Armor

		// Diamond Enchanting
		// Tools
		GameRegistry.addShapelessRecipe(enxDiamondPickFortuneI, new Object[] {
				new ItemStack(PBTMod.blazedDiamondPick),
				new ItemStack(PBTMod.blazedFortune, 0, 0) });
		GameRegistry.addShapelessRecipe(enxDiamondPickFortuneII, new Object[] {
				new ItemStack(PBTMod.blazedDiamondPick),
				new ItemStack(PBTMod.blazedFortune, 0, 1) });
		GameRegistry.addShapelessRecipe(enxDiamondPickFortuneIII, new Object[] {
				new ItemStack(PBTMod.blazedDiamondPick),
				new ItemStack(PBTMod.blazedFortune, 0, 2) });
		// Armor
	}

}
