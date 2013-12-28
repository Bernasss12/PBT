package bernasss12.pbtmod.client;

import bernasss12.pbtmod.CommonProxy;
import bernasss12.pbtmod.mobs.KingBlaze;
import bernasss12.pbtmod.mobs.KingBlaze.RenderKingBlaze;
import bernasss12.pbtmod.mobs.ModelKingBlaze;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	
	public void registerRenderers(){
		
		RenderingRegistry.registerEntityRenderingHandler(KingBlaze.class, new RenderKingBlaze(new ModelKingBlaze(), 0.5F));
		
	}

}
