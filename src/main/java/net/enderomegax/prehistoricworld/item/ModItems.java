package net.enderomegax.prehistoricworld.item;

import net.enderomegax.prehistoricworld.PrehistoricWorld;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricWorld.MOD_ID);

    public static final RegistryObject<Item> Fossil = ITEMS.register("fossil", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Fossil_Bone = ITEMS.register("fossil_bone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Glass_Vial = ITEMS.register("glass_vial", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Unearthed_Fossil = ITEMS.register("unearthed_fossil", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
