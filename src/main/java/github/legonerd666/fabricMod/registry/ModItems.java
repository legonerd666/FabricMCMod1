package github.legonerd666.fabricMod.registry;

import github.legonerd666.fabricMod.items.SapphireItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
  public static final String MOD_ID = "fabmodln666";

  public static final Item RUBY = new Item(
    new FabricItemSettings().group(ItemGroup.MATERIALS)
  );

  public static final SapphireItem SAPPHIRE = new SapphireItem();

  public static final BlockItem BLOCKOFRUBY = new BlockItem(
    ModBlocks.BLOCKOFRUBY,
    new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)
  );

  public static void registerItems() {
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
    System.out.println("Ruby");

    Registry.register(
      Registry.ITEM,
      new Identifier(MOD_ID, "sapphire"),
      SAPPHIRE
    );
    System.out.println("Sapphire");

    Registry.register(
      Registry.ITEM,
      new Identifier(MOD_ID, "blockOfRuby"),
      BLOCKOFRUBY
    );
    System.out.println("Block");
  }
}
