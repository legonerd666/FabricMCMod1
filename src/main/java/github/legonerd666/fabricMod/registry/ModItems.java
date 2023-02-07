package github.legonerd666.fabricMod.registry;

import github.legonerd666.fabricMod.items.SapphireItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final String MOD_ID = "fabmodln666";
    
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final SapphireItem SAPPHIRE = new SapphireItem();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire"), SAPPHIRE);
    }

}
