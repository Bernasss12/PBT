package bernasss12.pbtmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBlazedDiamondArmor extends ItemArmor {
	
	public ItemBlazedDiamondArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
				super(par1, par2EnumArmorMaterial, par3, par4);
			}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
				int layer) {
					if (stack.itemID == PBTMod.blazedDiamondHelmet.itemID
						|| stack.itemID == PBTMod.blazedDiamondChestplate.itemID
						|| stack.itemID == PBTMod.blazedDiamondBoots.itemID) {
							return "bernasss12_pbtm:textures/models/armor/blazeddiamondarmor1.png";
							}
					if (stack.itemID == PBTMod.blazedDiamondLeggings.itemID) {
							return "bernasss12_pbtm:textures/models/armor/blazeddiamondarmor2.png";
						} else {
							return null;
							}

}
	public void registerIcons(IconRegister par1IconRegister) { // Make sure to import IconRegister!
			if (itemID == PBTMod.blazedDiamondChestplate.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

			if (itemID == PBTMod.blazedDiamondLeggings.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

			if (itemID == PBTMod.blazedDiamondBoots.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

			if (itemID == PBTMod.blazedDiamondHelmet.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

	}
}