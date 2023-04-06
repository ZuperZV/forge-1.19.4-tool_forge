package net.ZuperZ.tool_forge.block.entity;

import net.ZuperZ.tool_forge.block.custom.DeepslateFurnaceBlock;
import net.ZuperZ.tool_forge.tool_forge;
import net.ZuperZ.tool_forge.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, tool_forge.MOD_ID);

    public static final RegistryObject<BlockEntityType<DeepslateFurnaceBlockEntity>> DEEPSLATE_FURNACE =
            BLOCK_ENTITIES.register("deepslate_furnace", () ->
                    BlockEntityType.Builder.of(DeepslateFurnaceBlockEntity::new,
                            ModBlocks.DEEPSLATE_FURNACE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}