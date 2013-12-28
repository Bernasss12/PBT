package bernasss12.pbtmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class BasicRecipes {

	public static void addBasicRecipes() {

		// Blocks
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedIronBlock, 1),
						new Object[] { "TTT", "TTT", "TTT", 'T',
								PBTMod.blazedIronIngot });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedGoldBlock), new Object[] {
						"TTT", "TTT", "TTT", 'T', PBTMod.blazedGoldIngot });
		GameRegistry
				.addRecipe(new ItemStack(PBTMod.blazedDiamondBlock),
						new Object[] { "TTT", "TTT", "TTT", 'T',
								PBTMod.blazedDiamond });
		// Items
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedIronIngot),
				new Object[] { " P ", "PIP", " P ", 'P', Item.blazePowder, 'I',
						Item.ingotIron });

		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedGoldIngot),
				new Object[] { " P ", "PGP", " P ", 'P', Item.blazePowder, 'G',
						Item.ingotGold });

		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedDiamond),
				new Object[] { " P ", "PDP", " P ", 'P', Item.blazePowder, 'D',
						Item.diamond });

		GameRegistry.addShapelessRecipe(
				new ItemStack(PBTMod.blazedIronIngot, 9),
				new Object[] { new ItemStack(PBTMod.blazedIronBlock) });

		GameRegistry.addShapelessRecipe(
				new ItemStack(PBTMod.blazedGoldIngot, 9),
				new Object[] { new ItemStack(PBTMod.blazedGoldBlock) });

		GameRegistry.addShapelessRecipe(new ItemStack(PBTMod.blazedDiamond, 9),
				new Object[] { new ItemStack(PBTMod.blazedDiamondBlock) });

		// EnchantingItems
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedFortune, 0, 0),
				new Object[] { "XYX", "YZY", "XYX", 'X', Block.blockLapis, 'Y',
						Block.blockRedstone, 'Z', PBTMod.blazedDiamondBlock });
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedFortune, 0, 1),
				new Object[] { "XYX", "CZC", "XYX", 'X', Block.blockLapis, 'Y',
						Block.blockRedstone, 'Z', PBTMod.blazedDiamondBlock,
						'C', new ItemStack(PBTMod.blazedFortune, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(PBTMod.blazedFortune, 0, 2),
				new Object[] { "XYX", "CZC", "XYX", 'X', Block.blockLapis, 'Y',
						PBTMod.blazedDiamond, 'Z', PBTMod.blazedDiamondBlock,
						'C', new ItemStack(PBTMod.blazedFortune, 0, 1) });

	}

}
