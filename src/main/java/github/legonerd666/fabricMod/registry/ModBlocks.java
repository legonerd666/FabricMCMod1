package github.legonerd666.fabricMod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
  public static final String MOD_ID = "fabmodln666";

  public static final Block BLOCKOFRUBY = new Block(
    FabricBlockSettings
      .of(Material.METAL, MapColor.RED)
      .strength(5.0f, 6.0f)
      .sounds(BlockSoundGroup.METAL)
  );

  public static void registerBlocks() {
    System.out.println("Starting Block Registration");
    Registry.register(
      Registry.BLOCK,
      new Identifier(MOD_ID, "blockOfRuby"),
      BLOCKOFRUBY
    );
    System.out.println("Finished Block Registration");
  }
}
