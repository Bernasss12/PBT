
package bernasss12.pbtmod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKingBlaze extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer UpperBody;
    ModelRenderer LowerBody;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightCrown;
    ModelRenderer LeftCrown;
    ModelRenderer MidleCrown;
  
  public ModelKingBlaze()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 16F, 0F, 8, 8, 8);
      Head.setRotationPoint(-4F, -20F, -4F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      UpperBody = new ModelRenderer(this, 0, 0);
      UpperBody.addBox(-5F, 0F, 0F, 10, 5, 6);
      UpperBody.setRotationPoint(0F, 4F, -3F);
      UpperBody.setTextureSize(64, 64);
      UpperBody.mirror = true;
      setRotation(UpperBody, 0F, 0F, 0F);
      LowerBody = new ModelRenderer(this, 0, 0);
      LowerBody.addBox(0F, 0F, 0F, 8, 6, 4);
      LowerBody.setRotationPoint(-4F, 9F, -2F);
      LowerBody.setTextureSize(64, 64);
      LowerBody.mirror = true;
      setRotation(LowerBody, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 0, 0);
      RightArm.addBox(0F, 0F, 0F, 3, 9, 3);
      RightArm.setRotationPoint(-8F, 4F, 0F);
      RightArm.setTextureSize(64, 64);
      RightArm.mirror = true;
      setRotation(RightArm, -0.8726646F, 0.0698132F, 0.0698132F);
      LeftArm = new ModelRenderer(this, 0, 0);
      LeftArm.addBox(0F, 0F, 0F, 3, 9, 3);
      LeftArm.setRotationPoint(5F, 4F, 0F);
      LeftArm.setTextureSize(64, 64);
      LeftArm.mirror = true;
      setRotation(LeftArm, -0.8726646F, -0.0698132F, -0.0698132F);
      RightCrown = new ModelRenderer(this, 0, 0);
      RightCrown.addBox(0F, 0F, 0F, 1, 5, 1);
      RightCrown.setRotationPoint(-3F, -7F, -3F);
      RightCrown.setTextureSize(64, 64);
      RightCrown.mirror = true;
      setRotation(RightCrown, 0.1396263F, 0.1396263F, -0.1570796F);
      LeftCrown = new ModelRenderer(this, 0, 0);
      LeftCrown.addBox(0F, 0F, 0F, 1, 5, 1);
      LeftCrown.setRotationPoint(2F, -7F, -3F);
      LeftCrown.setTextureSize(64, 64);
      LeftCrown.mirror = true;
      setRotation(LeftCrown, 0.1396263F, -0.1396263F, 0.1570796F);
      MidleCrown = new ModelRenderer(this, 0, 0);
      MidleCrown.addBox(0F, 0F, 0F, 1, 6, 1);
      MidleCrown.setRotationPoint(-0.4666667F, -8F, -3.5F);
      MidleCrown.setTextureSize(64, 64);
      MidleCrown.mirror = true;
      setRotation(MidleCrown, 0.1047198F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    UpperBody.render(f5);
    LowerBody.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightCrown.render(f5);
    LeftCrown.render(f5);
    MidleCrown.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
