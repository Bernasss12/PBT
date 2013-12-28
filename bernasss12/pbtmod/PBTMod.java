package bernasss12.pbtmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import bernasss12.pbtmod.mobs.KingBlaze;
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
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = PBTMod.modid, name = "+ Blaze Tools Mod", version = "2.0.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class PBTMod {

	@SidedProxy(clientSide = "bernasss12.pbtmod.client.ClientProxy", serverSide = "bernasss12.pbtmod.client.CommonProxy")
	public static CommonProxy proxy;

	public static final String modid = "bernasss12_pbtm";

	// Blocks
	public static Block blazedIronBlock;
	public static Block blazedGoldBlock;
	public static Block blazedDiamondBlock;

	// Items
	public static Item blazedIronIngot;
	public static Item blazedGoldIngot;
	public static Item blazedDiamond;
	public static Item blazedFortune;
	public static Item blazedProtection;

	// Tools
	// Iron
	public static Item blazedIronSword;
	public static Item blazedIronPick;
	public static Item blazedIronAxe;
	public static Item blazedIronSpade;
	// Gold
	public static Item blazedGoldSword;
	public static Item blazedGoldPick;
	public static Item blazedGoldAxe;
	public static Item blazedGoldSpade;
	// Diamond
	public static Item blazedDiamondSword;
	public static Item blazedDiamondPick;
	public static Item blazedDiamondAxe;
	public static Item blazedDiamondSpade;

	// Armor
	// Iron
	public static Item blazedIronHelmet;
	public static Item blazedIronChestplate;
	public static Item blazedIronLeggings;
	public static Item blazedIronBoots;
	// Gold
	public static Item blazedGoldHelmet;
	public static Item blazedGoldChestplate;
	public static Item blazedGoldLeggings;
	public static Item blazedGoldBoots;
	// Diamond
	public static Item blazedDiamondHelmet;
	public static Item blazedDiamondChestplate;
	public static Item blazedDiamondLeggings;
	public static Item blazedDiamondBoots;

	@EventHandler
	public void load(FMLInitializationEvent event) {
		RenderingRegistry.addNewArmourRendererPrefix("BIronArmor");
		RenderingRegistry.addNewArmourRendererPrefix("BGoldArmor");
		RenderingRegistry.addNewArmourRendererPrefix("BDiamondArmor");

		// Block Registry
		blazedIronBlock = new BlockBlazedIron(500, Material.iron)
				.setUnlocalizedName("blazedIronBlock")
				.setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.500F)
				.setHardness(3.0F);
		blazedGoldBlock = new BlockBlazedGold(501, Material.iron)
				.setUnlocalizedName("blazedGoldBlock")
				.setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.752F)
				.setHardness(4.0F);
		blazedDiamondBlock = new BlockBlazedDiamond(502, Material.iron)
				.setUnlocalizedName("blazedDiamondBlock")
				.setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F)
				.setHardness(6.0F);

		// Block GameRegistry
		GameRegistry.registerBlock(blazedIronBlock, modid + "."
				+ blazedIronBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blazedGoldBlock, modid + "."
				+ blazedGoldBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blazedDiamondBlock, modid + "."
				+ blazedDiamondBlock.getUnlocalizedName().substring(5));

		// Block LanguageRegistry
		LanguageRegistry.addName(blazedIronBlock, "Blazed Iron Block");
		LanguageRegistry.addName(blazedGoldBlock, "Blazed Gold Block");
		LanguageRegistry.addName(blazedDiamondBlock, "Blazed Diamond Block");

		// Item Registry
		blazedIronIngot = new ItemBlazedIron(5000).setUnlocalizedName(
				"blazedIronIngot").setCreativeTab(CreativeTabs.tabMaterials);
		blazedGoldIngot = new ItemBlazedGold(5001).setUnlocalizedName(
				"blazedGoldIngot").setCreativeTab(CreativeTabs.tabMaterials);
		blazedDiamond = new ItemBlazedDiamond(5003).setUnlocalizedName(
				"blazedDiamond").setCreativeTab(CreativeTabs.tabMaterials);
		blazedFortune = new ItemBlazedFortune(5010).setUnlocalizedName(
				"fortuneItem").setCreativeTab(CreativeTabs.tabBrewing);
		blazedProtection = new ItemBlazedProtection(5011).setUnlocalizedName(
				"protectionItem").setCreativeTab(CreativeTabs.tabBrewing);

		// Item LanguageRegistry
		LanguageRegistry.addName(blazedIronIngot, "Blazed Iron Ingot");
		LanguageRegistry.addName(blazedGoldIngot, "Blazed Gold Ingot");
		LanguageRegistry.addName(blazedDiamond, "Blazed Diamond");
		LanguageRegistry.addName(new ItemStack(blazedFortune, 1, 0),
				"Fortune I Item");
		LanguageRegistry.addName(new ItemStack(blazedFortune, 1, 1),
				"Fortune II Item");
		LanguageRegistry.addName(new ItemStack(blazedFortune, 1, 2),
				"Fortune III Item");
		LanguageRegistry.addName(new ItemStack(blazedProtection, 1, 0),
				"Protection I Item");
		LanguageRegistry.addName(new ItemStack(blazedProtection, 1, 1),
				"Protection I Item");
		LanguageRegistry.addName(new ItemStack(blazedProtection, 1, 2),
				"Protection I Item");
		LanguageRegistry.addName(new ItemStack(blazedProtection, 1, 3),
				"Protection I Item");

		// EnumMaterials

		EnumToolMaterial BIronTools = EnumHelper.addToolMaterial("BIronTools",
				3, 1600, 9.0F, 4.0F, 0);
		EnumToolMaterial BGoldTools = EnumHelper.addToolMaterial("BGoldTools",
				3, 128, 24.0F, 3.0F, 0);
		EnumToolMaterial BDiamondTools = EnumHelper.addToolMaterial(
				"BDiamondTools", 3, 4992, 15.0F, 6.0F, 0);

		EnumArmorMaterial BIronArmor = EnumHelper.addArmorMaterial(
				"BIronArmor", 25, new int[] { 3, 8, 6, 3 }, 0);
		EnumArmorMaterial BGoldArmor = EnumHelper.addArmorMaterial(
				"BGoldArmor", 173, new int[] { 3, 8, 6, 3 }, 0);
		EnumArmorMaterial BDiamondArmor = EnumHelper.addArmorMaterial(
				"BDiamondArmor", 45, new int[] { 3, 8, 6, 3 }, 0);

		// Tools
		// Iron
		blazedIronSword = new ItemBlazedIronSword(5020, BIronTools)
				.setUnlocalizedName("blazedIronSword").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedIronPick = new ItemBlazedIronPick(5021, BIronTools)
				.setUnlocalizedName("blazedIronPick").setCreativeTab(
						CreativeTabs.tabTools);
		blazedIronAxe = new ItemBlazedIronAxe(5022, BIronTools)
				.setUnlocalizedName("blazedIronAxe").setCreativeTab(
						CreativeTabs.tabTools);
		blazedIronSpade = new ItemBlazedIronSpade(5023, BIronTools)
				.setUnlocalizedName("blazedIronSpade").setCreativeTab(
						CreativeTabs.tabTools);

		blazedIronHelmet = new ItemBlazedIronArmor(5024, BIronArmor, 5, 0)
				.setUnlocalizedName("blazedIronHelmet").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedIronChestplate = new ItemBlazedIronArmor(5025, BIronArmor, 5, 1)
				.setUnlocalizedName("blazedIronChestplate").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedIronLeggings = new ItemBlazedIronArmor(5026, BIronArmor, 5, 2)
				.setUnlocalizedName("blazedIronLeggings").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedIronBoots = new ItemBlazedIronArmor(5027, BIronArmor, 5, 3)
				.setUnlocalizedName("blazedIronBoots").setCreativeTab(
						CreativeTabs.tabCombat);

		// Gold
		blazedGoldSword = new ItemBlazedGoldSword(5030, BGoldTools)
				.setUnlocalizedName("blazedGoldSword").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedGoldPick = new ItemBlazedGoldPick(5031, BGoldTools)
				.setUnlocalizedName("blazedGoldPick").setCreativeTab(
						CreativeTabs.tabTools);
		blazedGoldAxe = new ItemBlazedGoldAxe(5032, BGoldTools)
				.setUnlocalizedName("blazedGoldAxe").setCreativeTab(
						CreativeTabs.tabTools);
		blazedGoldSpade = new ItemBlazedGoldSpade(5033, BGoldTools)
				.setUnlocalizedName("blazedGoldSpade").setCreativeTab(
						CreativeTabs.tabTools);

		blazedGoldHelmet = new ItemBlazedGoldArmor(5034, BGoldArmor, 5, 0)
				.setUnlocalizedName("blazedGoldHelmet").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedGoldChestplate = new ItemBlazedGoldArmor(5035, BGoldArmor, 5, 1)
				.setUnlocalizedName("blazedGoldChestplate").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedGoldLeggings = new ItemBlazedGoldArmor(5036, BGoldArmor, 5, 2)
				.setUnlocalizedName("blazedGoldLeggings").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedGoldBoots = new ItemBlazedGoldArmor(5037, BGoldArmor, 5, 3)
				.setUnlocalizedName("blazedGoldBoots").setCreativeTab(
						CreativeTabs.tabCombat);

		// Diamond
		blazedDiamondSword = new ItemBlazedDiamondSword(5040, BDiamondTools)
				.setUnlocalizedName("blazedDiamondSword").setCreativeTab(
						CreativeTabs.tabCombat);
		blazedDiamondPick = new ItemBlazedDiamondPick(5041, BDiamondTools)
				.setUnlocalizedName("blazedDiamondPick").setCreativeTab(
						CreativeTabs.tabTools);
		blazedDiamondAxe = new ItemBlazedDiamondAxe(5042, BDiamondTools)
				.setUnlocalizedName("blazedDiamondAxe").setCreativeTab(
						CreativeTabs.tabTools);
		blazedDiamondSpade = new ItemBlazedDiamondSpade(5043, BDiamondTools)
				.setUnlocalizedName("blazedDiamondSpade").setCreativeTab(
						CreativeTabs.tabTools);

		blazedDiamondHelmet = new ItemBlazedDiamondArmor(5044, BDiamondArmor,
				5, 0).setUnlocalizedName("blazedDiamondHelmet").setCreativeTab(
				CreativeTabs.tabCombat);
		blazedDiamondChestplate = new ItemBlazedDiamondArmor(5045,
				BDiamondArmor, 5, 1).setUnlocalizedName(
				"blazedDiamondChestplate").setCreativeTab(
				CreativeTabs.tabCombat);
		blazedDiamondLeggings = new ItemBlazedDiamondArmor(5046, BDiamondArmor,
				5, 2).setUnlocalizedName("blazedDiamondLeggings")
				.setCreativeTab(CreativeTabs.tabCombat);
		blazedDiamondBoots = new ItemBlazedDiamondArmor(5047, BDiamondArmor, 5,
				3).setUnlocalizedName("blazedDiamondBoots").setCreativeTab(
				CreativeTabs.tabCombat);

		// Enchantment Tools
		ItemStack enxDiamondPickFortuneI = new ItemStack(blazedDiamondPick);
		enxDiamondPickFortuneI.addEnchantment(Enchantment.fortune, 1);

		ItemStack enxDiamondPickFortuneII = new ItemStack(blazedDiamondPick);
		enxDiamondPickFortuneII.addEnchantment(Enchantment.fortune, 2);

		ItemStack enxDiamondPickFortuneIII = new ItemStack(blazedDiamondPick);
		enxDiamondPickFortuneIII.addEnchantment(Enchantment.fortune, 3);

		// Tools Language Registry
		// Iron
		LanguageRegistry.addName(blazedIronSword, "Blazed Iron Sword");
		LanguageRegistry.addName(blazedIronPick, "Blazed Iron Pickaxe");
		LanguageRegistry.addName(blazedIronAxe, "Blazed Iron Axe");
		LanguageRegistry.addName(blazedIronSpade, "Blazed Iron Shovel");

		LanguageRegistry.addName(blazedIronHelmet, "Blazed Iron Helmet");
		LanguageRegistry.addName(blazedIronChestplate, "Blazed Iron Chesplate");
		LanguageRegistry.addName(blazedIronLeggings, "Blazed Iron Leggings");
		LanguageRegistry.addName(blazedIronBoots, "Blazed Iron Boots");

		// Gold
		LanguageRegistry.addName(blazedGoldSword, "Blazed Gold Sword");
		LanguageRegistry.addName(blazedGoldPick, "Blazed Gold Pickaxe");
		LanguageRegistry.addName(blazedGoldAxe, "Blazed Gold Axe");
		LanguageRegistry.addName(blazedGoldSpade, "Blazed Gold Shovel");

		LanguageRegistry.addName(blazedGoldHelmet, "Blazed Gold Helmet");
		LanguageRegistry.addName(blazedGoldChestplate, "Blazed Gold Chesplate");
		LanguageRegistry.addName(blazedGoldLeggings, "Blazed Gold Leggings");
		LanguageRegistry.addName(blazedGoldBoots, "Blazed Gold Boots");

		// Diamond
		LanguageRegistry.addName(blazedDiamondSword, "Blazed Diamond Sword");
		LanguageRegistry.addName(blazedDiamondPick, "Blazed Diamond Pickaxe");
		LanguageRegistry.addName(blazedDiamondAxe, "Blazed Diamond Axe");
		LanguageRegistry.addName(blazedDiamondSpade, "Blazed Diamond Shovel");

		LanguageRegistry.addName(blazedDiamondHelmet, "Blazed Diamond Helmet");
		LanguageRegistry.addName(blazedDiamondChestplate,
				"Blazed Diamond Chesplate");
		LanguageRegistry.addName(blazedDiamondLeggings,
				"Blazed Diamond Leggings");
		LanguageRegistry.addName(blazedDiamondBoots, "Blazed Diamondold Boots");

		// Mobs
		registerEntity(KingBlaze.class, "blazeKing", 0xeaeae9, 0xc99a03);
		LanguageRegistry.instance().addStringLocalization(
				"entity.blazeKing.name", "BlazeKing");

		proxy.registerRenderers();

		BasicRecipes.addBasicRecipes();
		ToolsRecipes.addToolRecipes();
		ArmorRecipes.addArmorRecipes();
		// EnchantingRecipes.addEnchantingRecipes();

	}

	public void registerEntity(Class<? extends Entity> entityClass1,
			String entityName, int bkEggColor, int fgEggColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass1, entityName, id);
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id,
				bkEggColor, fgEggColor));
	}
}
