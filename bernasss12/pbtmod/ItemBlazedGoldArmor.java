package bernasss12.pbtmod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBlazedGoldArmor extends ItemArmor {
	
	public ItemBlazedGoldArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
				super(par1, par2EnumArmorMaterial, par3, par4);
			}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
				int layer) {
					if (stack.itemID == PBTMod.blazedGoldHelmet.itemID
						|| stack.itemID == PBTMod.blazedGoldChestplate.itemID
						|| stack.itemID == PBTMod.blazedGoldBoots.itemID) {
							return "bernasss12_pbtm:textures/models/armor/blazedgoldarmor1.png";
							}
					if (stack.itemID == PBTMod.blazedGoldLeggings.itemID) {
							return "bernasss12_pbtm:textures/models/armor/blazedgoldarmor2.png";
						} else {
							return null;
							}

}
	public void registerIcons(IconRegister par1IconRegister) { // Make sure to import IconRegister!
			if (itemID == PBTMod.blazedGoldChestplate.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
			}

			if (itemID == PBTMod.blazedGoldLeggings.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
			}

			if (itemID == PBTMod.blazedGoldBoots.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
			}

			if (itemID == PBTMod.blazedGoldHelmet.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); 
			}

	}
}