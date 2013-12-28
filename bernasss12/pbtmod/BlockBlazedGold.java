package bernasss12.pbtmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlazedGold extends Block{

	public BlockBlazedGold(int id, Material material) {
		super(id, material);
	
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(PBTMod.modid + ":" + (this.getUnlocalizedName().substring(5))); 
	}

}
