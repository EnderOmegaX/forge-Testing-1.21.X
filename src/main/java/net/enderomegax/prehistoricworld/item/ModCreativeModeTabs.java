package net.enderomegax.prehistoricworld.item;

import net.enderomegax.prehistoricworld.PrehistoricWorld;
import net.enderomegax.prehistoricworld.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrehistoricWorld.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PREHISTORIC_ITEMS_TAB = CREATIVE_MODE_TABS.register("prehistoric_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Fossil.get()))
                    .title(Component.translatable("creativetab.prehistoricworld.prehistoric_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Fossil.get());
                        output.accept(ModItems.Fossil_Bone.get());
                        output.accept(ModItems.Glass_Vial.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> PREHISTORIC_BLOCKS_TAB = CREATIVE_MODE_TABS.register("prehistoric_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.UNEARTHED_SKULL_FOSSIL.get()))
                    .withTabsBefore(PREHISTORIC_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.prehistoricworld.prehistoric_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.UNEARTHED_SKULL_FOSSIL.get());
                        output.accept(ModBlocks.UNEARTHED_BROKEN_FOSSIL.get());
                        output.accept(ModBlocks.UNEARTHED_LONG_FOSSIL.get());
                        output.accept(ModBlocks.UNEARTHED_LIMB_FOSSIL.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
