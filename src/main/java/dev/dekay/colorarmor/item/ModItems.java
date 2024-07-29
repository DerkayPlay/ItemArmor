package dev.dekay.colorarmor.item;

import dev.dekay.colorarmor.ModItemArmor;
import dev.dekay.colorarmor.armor.ModArmorTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModItemArmor.MODID);

    public static RegistryObject<Item> redHelmet;
    public static RegistryObject<Item> redChestplate;
    public static RegistryObject<Item> redLeggings;
    public static RegistryObject<Item> redBoots;
    public static RegistryObject<Item> limeHelmet;
    public static RegistryObject<Item> limeChestplate;
    public static RegistryObject<Item> limeLeggings;
    public static RegistryObject<Item> limeBoots;

    public ModItems(IEventBus eventBus) {
        this.redHelmet = ITEMS.register("red_helmet", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.HELMET, new Item.Properties()));
        this.redChestplate = ITEMS.register("red_chestplate", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.redLeggings = ITEMS.register("red_leggings", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.redBoots = ITEMS.register("red_boots", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.limeHelmet = ITEMS.register("lime_helmet", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.HELMET, new Item.Properties()));
        this.limeChestplate = ITEMS.register("lime_chestplate", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.limeLeggings = ITEMS.register("lime_leggings", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.limeBoots = ITEMS.register("lime_boots", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.BOOTS, new Item.Properties()));


        ITEMS.register(eventBus);
    }

    public RegistryObject<Item> getRedHelmet() {
        return redHelmet;
    }

    public RegistryObject<Item> getRedChestplate() {
        return redChestplate;
    }

    public RegistryObject<Item> getRedLeggings() {
        return redLeggings;
    }

    public RegistryObject<Item> getRedBoots() {
        return redBoots;
    }

    public RegistryObject<Item> getLimeHelmet() {
        return limeHelmet;
    }

    public RegistryObject<Item> getLimeChestplate() {
        return limeChestplate;
    }

    public RegistryObject<Item> getLimeLeggings() {
        return limeLeggings;
    }

    public RegistryObject<Item> getLimeBoots() {
        return limeBoots;
    }
}
