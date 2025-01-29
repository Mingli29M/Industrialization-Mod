package net.mingli29.industrialization.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mingli29.industrialization.Industrialization;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot",new Item(new Item.Settings()));
    public static final Item STEEL_DUST = registerItem("steel_dust",new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Industrialization.MOD_ID,name),item);
    }
    public static void registerModItems(){
        Industrialization.LOGGER.info("Registering Mod Items For "+Industrialization.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(STEEL_INGOT);
            entries.add(STEEL_DUST);
        });
    }
}
