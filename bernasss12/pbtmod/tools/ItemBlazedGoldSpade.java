package bernasss12.pbtmod.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import bernasss12.pbtmod.PBTMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlazedGoldSpade extends ItemSpade{

	public ItemBlazedGoldSpade(int id, EnumToolMaterial material) {
		super(id, material);
		
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); 
	}
}
