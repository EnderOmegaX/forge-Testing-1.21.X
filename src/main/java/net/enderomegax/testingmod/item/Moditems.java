package net.enderomegax.testingmod.item;

import net.enderomegax.testingmod.TestingMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    public static final RegistryObject<Item> Fossil = ITEMS.register("fossil", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Fossil_Bone = ITEMS.register("fossil_bone", () -> new Item(new Item.Properties()));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
