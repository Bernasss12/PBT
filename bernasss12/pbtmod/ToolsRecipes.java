package bernasss12.pbtmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import bernasss12.pbtmod.tools.ItemBlazedDiamondAxe;
import bernasss12.pbtmod.tools.ItemBlazedDiamondPick;
import bernasss12.pbtmod.tools.ItemBlazedDiamondSpade;
import bernasss12.pbtmod.tools.ItemBlazedDiamondSword;
import bernasss12.pbtmod.tools.ItemBlazedGoldAxe;
import bernasss12.pbtmod.tools.ItemBlazedGoldPick;
import bernasss12.pbtmod.tools.ItemBlazedGoldSpade;
import bernasss12.pbtmod.tools.ItemBlazedGoldSword;
import bernasss12.pbtmod.tools.ItemBlazedIronAxe;
import bernasss12.pbtmod.tools.ItemBlazedIronPick;
import bernasss12.pbtmod.tools.ItemBlazedIronSpade;
import bernasss12.pbtmod.tools.ItemBlazedIronSword;

public class ToolsRecipes {

	public static void addToolRecipes() {

		// Iron
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedIronSword, 1), new Object[] {
						" I ", " I ", " S ", 'I', PBTMod.blazedIronIngot, 'S',
						Item.blazeRod });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedIronPick, 1), new Object[] {
						"III", " S ", " S ", 'I', PBTMod.blazedIronIngot, 'S',
						Item.blazeRod });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedIronAxe, 1), new Object[] {
						"II ", "IS ", " S ", 'I', PBTMod.blazedIronIngot, 'S',
						Item.blazeRod });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedIronSpade, 1), new Object[] {
						" I ", " S ", " S ", 'I', PBTMod.blazedIronIngot, 'S',
						Item.blazeRod });

		// Gold
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedGoldSword, 1), new Object[] {
						" I ", " I ", " S ", 'I', PBTMod.blazedGoldIngot, 'S',
						Item.blazeRod });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedGoldPick, 1), new Object[] {
						"III", " S ", " S ", 'I', PBTMod.blazedGoldIngot, 'S',
						Item.blazeRod });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedGoldAxe, 1), new Object[] {
						"II ", "IS ", " S ", 'I', PBTMod.blazedGoldIngot, 'S',
						Item.blazeRod });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedGoldSpade, 1), new Object[] {
						" I ", " S ", " S ", 'I', PBTMod.blazedGoldIngot, 'S',
						Item.blazeRod });

		// Diamond
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedDiamondSword, 1),
				new Object[] { " I ", " I ", " S ", 'I', PBTMod.blazedDiamond, 'S',
						Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedDiamondPick, 1),
				new Object[] { "III", " S ", " S ", 'I', PBTMod.blazedDiamond, 'S',
						Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedDiamondAxe, 1),
				new Object[] { "II ", "IS ", " S ", 'I', PBTMod.blazedDiamond, 'S',
						Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedDiamondSpade, 1),
				new Object[] { " I ", " S ", " S ", 'I', PBTMod.blazedDiamond, 'S',
						Item.blazeRod });

		// Blazing Diamond

	}

}
