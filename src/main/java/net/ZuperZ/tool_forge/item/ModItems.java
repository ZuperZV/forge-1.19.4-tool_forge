package net.ZuperZ.tool_forge.item;

import net.ZuperZ.tool_forge.tool_forge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.ZuperZ.tool_forge.tool_forge;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tool_forge.MOD_ID);

    public static final RegistryObject<Item> TOOL_HAMMER = ITEMS.register("tool_hammer",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
