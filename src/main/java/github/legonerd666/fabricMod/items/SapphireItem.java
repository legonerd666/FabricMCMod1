package github.legonerd666.fabricMod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SapphireItem extends Item {

  public SapphireItem() {
    super(new FabricItemSettings().group(ItemGroup.MATERIALS));
  }

  @Override
  public ActionResult useOnBlock(ItemUsageContext context) {
    World world = context.getWorld();
    Block block = world.getBlockState(context.getBlockPos()).getBlock();
    Hand hand = context.getHand();

    if (
      block == Blocks.DIAMOND_BLOCK &&
      hand == Hand.MAIN_HAND &&
      context.getPlayer().getStackInHand(hand).getCount() >= 9
    ) {
      if (world.isClient()) {
        context
          .getPlayer()
          .playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE, 1.0f, 1.0f);
      } else {
        world.setBlockState(
          context.getBlockPos(),
          Blocks.LAPIS_BLOCK.getDefaultState()
        );

        if (
          !context.getPlayer().isCreative() &&
          !context.getPlayer().isSpectator()
        ) {}
        context.getPlayer().getStackInHand(hand).decrement(9);
      }
    }

    return super.useOnBlock(context);
  }

  @Override
  public ActionResult useOnEntity(
    ItemStack stack,
    PlayerEntity user,
    LivingEntity entity,
    Hand hand
  ) {
    if (!user.getWorld().isClient() && hand == Hand.MAIN_HAND) {
      if (entity.getType() == EntityType.SHEEP && entity.isBaby()) {
        SheepEntity sheep = (SheepEntity) entity;

        sheep.setBreedingAge(0);

        if (!user.isCreative() && !user.isSpectator()) {
          user.getStackInHand(hand).decrement(1);
        }
      }
    }

    return super.useOnEntity(stack, user, entity, hand);
  }
}
