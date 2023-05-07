package github.legonerd666.fabricMod;

import github.legonerd666.fabricMod.registry.ModBlocks;
import github.legonerd666.fabricMod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class FabricMod implements ModInitializer {

  @Override
  public void onInitialize() {
    System.out.println("I am running!");
    ModBlocks.registerBlocks();
    System.out.println("Registered Blocks.");
    ModItems.registerItems();
    System.out.println("Registered Items.");
  }
}
