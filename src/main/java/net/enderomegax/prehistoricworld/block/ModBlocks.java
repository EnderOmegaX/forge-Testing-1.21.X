package net.enderomegax.prehistoricworld.block;

import net.enderomegax.prehistoricworld.PrehistoricWorld;
import net.enderomegax.prehistoricworld.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PrehistoricWorld.MOD_ID);

    public static final RegistryObject<Block> UNEARTHED_SKULL_FOSSIL = registerBlock("unearthed_skull_fossil",
            () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNEARTHED_BROKEN_FOSSIL = registerBlock("unearthed_broken_fossil",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNEARTHED_LONG_FOSSIL = registerBlock("unearthed_long_fossil",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNEARTHED_LIMB_FOSSIL = registerBlock("unearthed_limb_fossil",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));











    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
