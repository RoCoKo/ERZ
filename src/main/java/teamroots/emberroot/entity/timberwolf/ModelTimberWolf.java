// Date: 11/5/2016 10:04:56 PM
// Template version 1.1
// Java generated by Techne 
// (created by Elucent)
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package teamroots.emberroot.entity.timberwolf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class ModelTimberWolf extends ModelBase {
  public static ModelTimberWolf instance;
  //fields
  ModelRenderer legLB2;
  ModelRenderer legLB1;
  ModelRenderer legLF2;
  ModelRenderer legLF1;
  ModelRenderer legRF2;
  ModelRenderer legRF1;
  ModelRenderer body1;
  ModelRenderer legRB1;
  ModelRenderer legRB2;
  ModelRenderer body2;
  ModelRenderer head1;
  ModelRenderer head2;
  ModelRenderer tail1;
  ModelRenderer tail2;
  ModelRenderer tail3;
  ModelRenderer tail4;
  ModelRenderer ear1;
  ModelRenderer ear2;
  public ModelTimberWolf() {
    textureWidth = 128;
    textureHeight = 128;
    legLB2 = new ModelRenderer(this, 16, 0);
    legLB2.addBox(-1.5F, 0F, -2F, 3, 4, 3);
    legLB2.setRotationPoint(2.5F, 16F, 4F);
    legLB2.setTextureSize(128, 128);
    legLB2.mirror = true;
    setRotation(legLB2, 0F, 0F, 0F);
    legLB1 = new ModelRenderer(this, 0, 0);
    legLB1.addBox(-1.5F, 4F, -1.5F, 2, 4, 2);
    legLB1.setRotationPoint(2.5F, 16F, 4F);
    legLB1.setTextureSize(128, 128);
    legLB1.mirror = true;
    setRotation(legLB1, 0F, 0F, 0F);
    legLF2 = new ModelRenderer(this, 16, 0);
    legLF2.addBox(-1.5F, 0F, -2F, 3, 4, 3);
    legLF2.setRotationPoint(3F, 16F, -4F);
    legLF2.setTextureSize(128, 128);
    legLF2.mirror = true;
    setRotation(legLF2, 0F, 0F, 0F);
    legLF1 = new ModelRenderer(this, 0, 0);
    legLF1.addBox(-1.5F, 4F, -1.5F, 2, 4, 2);
    legLF1.setRotationPoint(3F, 16F, -4F);
    legLF1.setTextureSize(128, 128);
    legLF1.mirror = true;
    setRotation(legLF1, 0F, 0F, 0F);
    legRF2 = new ModelRenderer(this, 16, 0);
    legRF2.addBox(-1.5F, 0F, -2F, 3, 4, 3);
    legRF2.setRotationPoint(-3F, 16F, -4F);
    legRF2.setTextureSize(128, 128);
    legRF2.mirror = true;
    setRotation(legRF2, 0F, 0F, 0F);
    legRF1 = new ModelRenderer(this, 0, 0);
    legRF1.addBox(-0.5F, 4F, -1.5F, 2, 4, 2);
    legRF1.setRotationPoint(-3F, 16F, -4F);
    legRF1.setTextureSize(128, 128);
    legRF1.mirror = true;
    setRotation(legRF1, 0F, 0F, 0F);
    body1 = new ModelRenderer(this, 0, 16);
    body1.addBox(-5.5F, 0F, -4F, 11, 11, 7);
    body1.setRotationPoint(0F, 6F, -4F);
    body1.setTextureSize(128, 128);
    body1.mirror = true;
    setRotation(body1, 0F, 0F, 0F);
    legRB1 = new ModelRenderer(this, 0, 0);
    legRB1.addBox(-0.5F, 4F, -1.5F, 2, 4, 2);
    legRB1.setRotationPoint(-2.5F, 16F, 4F);
    legRB1.setTextureSize(128, 128);
    legRB1.mirror = true;
    setRotation(legRB1, 0F, 0F, 0F);
    legRB2 = new ModelRenderer(this, 16, 0);
    legRB2.addBox(-1.5F, 0F, -2F, 3, 4, 3);
    legRB2.setRotationPoint(-2.5F, 16F, 4F);
    legRB2.setTextureSize(128, 128);
    legRB2.mirror = true;
    setRotation(legRB2, 0F, 0F, 0F);
    body2 = new ModelRenderer(this, 0, 40);
    body2.addBox(-4.5F, 0F, -4F, 9, 9, 9);
    body2.setRotationPoint(0F, 7F, 3F);
    body2.setTextureSize(128, 128);
    body2.mirror = true;
    setRotation(body2, 0F, 0F, 0F);
    head1 = new ModelRenderer(this, 80, 16);
    head1.addBox(-4F, -4F, -5F, 8, 8, 5);
    head1.setRotationPoint(0F, 11.5F, -7F);
    head1.setTextureSize(128, 128);
    head1.mirror = true;
    setRotation(head1, 0F, 0F, 0F);
    head2 = new ModelRenderer(this, 48, 32);
    head2.addBox(-2.5F, -2F, -5F, 5, 4, 5);
    head2.setRotationPoint(0F, 13F, -10.5F);
    head2.setTextureSize(128, 128);
    head2.mirror = true;
    setRotation(head2, 0.2617994F, 0F, 0F);
    tail1 = new ModelRenderer(this, 16, 0);
    tail1.addBox(-1.5F, 0F, -1.5F, 3, 4, 3);
    tail1.setRotationPoint(0F, 9.5F, 7F);
    tail1.setTextureSize(128, 128);
    tail1.mirror = true;
    setRotation(tail1, 1.047198F, 0F, 0F);
    tail2 = new ModelRenderer(this, 80, 48);
    tail2.addBox(-2F, 2F, -1.5F, 4, 4, 4);
    tail2.setRotationPoint(0F, 9.5F, 7F);
    tail2.setTextureSize(128, 128);
    tail2.mirror = true;
    setRotation(tail2, 0.7853982F, 0F, 0F);
    tail3 = new ModelRenderer(this, 48, 48);
    tail3.addBox(-2.5F, 3.966667F, -2F, 5, 7, 5);
    tail3.setRotationPoint(0F, 9.5F, 7F);
    tail3.setTextureSize(128, 128);
    tail3.mirror = true;
    setRotation(tail3, 0.7853982F, 0F, 0F);
    tail4 = new ModelRenderer(this, 80, 48);
    tail4.addBox(-2F, 9F, -1.5F, 4, 4, 4);
    tail4.setRotationPoint(0F, 9.5F, 7F);
    tail4.setTextureSize(128, 128);
    tail4.mirror = true;
    setRotation(tail4, 0.7853982F, 0F, 0F);
    ear1 = new ModelRenderer(this, 0, 64);
    ear1.addBox(-1.5F, -5F, -1F, 3, 5, 2);
    ear1.setRotationPoint(2.5F, 8.5F, -9F);
    ear1.setTextureSize(128, 128);
    ear1.mirror = true;
    setRotation(ear1, 0F, 0F, 0.3926991F);
    ear2 = new ModelRenderer(this, 0, 64);
    ear2.addBox(-1.5F, -5F, -1F, 3, 5, 2);
    ear2.setRotationPoint(-2.5F, 8.5F, -9F);
    ear2.setTextureSize(128, 128);
    ear2.mirror = true;
    setRotation(ear2, 0F, 0F, -0.3926991F);
  }
  public void render(Entity entity, float f, float f1, float age, float f3, float f4, float f5) {
    GlStateManager.pushMatrix();
    float speed = (float) ((new Vec3d(entity.motionX, 0, entity.motionZ)).lengthVector() * 2.0f);
    super.render(entity, f, f1, age, f3, f4, f5);
    setRotationAngles(f, f1, age, f3, f4, f5);
    if (((EntityAnimal) entity).getGrowingAge() < 0) {
      GlStateManager.scale(0.5, 0.5, 0.5);
      GlStateManager.translate(0, 1.5, 0);
    }
    legRF1.rotateAngleX = (float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legLF1.rotateAngleX = -(float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legLB1.rotateAngleX = (float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legRB1.rotateAngleX = -(float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legRF2.rotateAngleX = (float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legLF2.rotateAngleX = -(float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legLB2.rotateAngleX = (float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    legRB2.rotateAngleX = -(float) Math.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    tail1.rotateAngleY = (float) Math.toRadians(speed * 180f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    tail2.rotateAngleY = (float) Math.toRadians(speed * 180f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    tail3.rotateAngleY = (float) Math.toRadians(speed * 180f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    tail4.rotateAngleY = (float) Math.toRadians(speed * 180f * (float) Math.sin(Math.toRadians(age % 360) * 24F));
    tail1.rotateAngleX = (float) Math.toRadians(45f + 120f * speed);
    tail2.rotateAngleX = (float) Math.toRadians(45f + 120f * speed);
    tail3.rotateAngleX = (float) Math.toRadians(45f + 120f * speed);
    tail4.rotateAngleX = (float) Math.toRadians(45f + 120f * speed);
    legLB2.render(f5);
    legLB1.render(f5);
    legLF2.render(f5);
    legLF1.render(f5);
    legRF2.render(f5);
    legRF1.render(f5);
    body1.render(f5);
    legRB1.render(f5);
    legRB2.render(f5);
    body2.render(f5);
    head1.render(f5);
    head2.render(f5);
    tail1.render(f5);
    tail2.render(f5);
    tail3.render(f5);
    tail4.render(f5);
    ear1.render(f5);
    ear2.render(f5);
    GlStateManager.popMatrix();
  }
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }
}
