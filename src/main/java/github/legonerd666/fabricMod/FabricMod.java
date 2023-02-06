package github.legonerd666.fabricMod;

import github.legonerd666.fabricMod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class FabricMod implements ModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("I am running!");
        ModItems.registerItems();
        System.out.println("Registered Items.");
    }
    
}
