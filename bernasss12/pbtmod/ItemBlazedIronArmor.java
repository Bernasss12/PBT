package bernasss12.pbtmod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBlazedIronArmor extends ItemArmor {
	
	public ItemBlazedIronArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
				super(par1, par2EnumArmorMaterial, par3, par4);
			}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
				int layer) {
					if (stack.itemID == PBTMod.blazedIronHelmet.itemID
						|| stack.itemID == PBTMod.blazedIronChestplate.itemID
						|| stack.itemID == PBTMod.blazedIronBoots.itemID) {
							return "bernasss12_pbtm:textures/models/armor/blazedironarmor1.png";
							}
					if (stack.itemID == PBTMod.blazedIronLeggings.itemID) {
							return "bernasss12_pbtm:textures/models/armor/blazedironarmor2.png";
						} else {
							return null;
							}

}
	public void registerIcons(IconRegister par1IconRegister) { // Make sure to import IconRegister!
			if (itemID == PBTMod.blazedIronChestplate.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

			if (itemID == PBTMod.blazedIronLeggings.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

			if (itemID == PBTMod.blazedIronBoots.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

			if (itemID == PBTMod.blazedIronHelmet.itemID) {
					this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); // You can also replace blockID and blockIcon with itemID and itemIcon
			}

	}
}