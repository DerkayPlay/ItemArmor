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
    public static RegistryObject<Item> greenHelmet;
    public static RegistryObject<Item> greenChestplate;
    public static RegistryObject<Item> greenLeggings;
    public static RegistryObject<Item> greenBoots;
    public static RegistryObject<Item> orangeHelmet;
    public static RegistryObject<Item> orangeChestplate;
    public static RegistryObject<Item> orangeLeggings;
    public static RegistryObject<Item> orangeBoots;
    public static RegistryObject<Item> blueHelmet;
    public static RegistryObject<Item> blueChestplate;
    public static RegistryObject<Item> blueLeggings;
    public static RegistryObject<Item> blueBoots;
    public static RegistryObject<Item> cyanHelmet;
    public static RegistryObject<Item> cyanChestplate;
    public static RegistryObject<Item> cyanLeggings;
    public static RegistryObject<Item> cyanBoots;
    public static RegistryObject<Item> yellowHelmet;
    public static RegistryObject<Item> yellowChestplate;
    public static RegistryObject<Item> yellowLeggings;
    public static RegistryObject<Item> yellowBoots;

    public ModItems(IEventBus eventBus) {
        this.redHelmet = ITEMS.register("red_helmet", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.HELMET, new Item.Properties()));
        this.redChestplate = ITEMS.register("red_chestplate", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.redLeggings = ITEMS.register("red_leggings", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.redBoots = ITEMS.register("red_boots", () -> new ArmorItem(ModArmorTiers.RED, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.limeHelmet = ITEMS.register("lime_helmet", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.HELMET, new Item.Properties()));
        this.limeChestplate = ITEMS.register("lime_chestplate", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.limeLeggings = ITEMS.register("lime_leggings", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.limeBoots = ITEMS.register("lime_boots", () -> new ArmorItem(ModArmorTiers.LIME, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.greenHelmet = ITEMS.register("green_helmet", () -> new ArmorItem(ModArmorTiers.GREEN, ArmorItem.Type.HELMET, new Item.Properties()));
        this.greenChestplate = ITEMS.register("green_chestplate", () -> new ArmorItem(ModArmorTiers.GREEN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.greenLeggings = ITEMS.register("green_leggings", () -> new ArmorItem(ModArmorTiers.GREEN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.greenBoots = ITEMS.register("green_boots", () -> new ArmorItem(ModArmorTiers.GREEN, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.orangeHelmet = ITEMS.register("orange_helmet", () -> new ArmorItem(ModArmorTiers.ORANGE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.orangeChestplate = ITEMS.register("orange_chestplate", () -> new ArmorItem(ModArmorTiers.ORANGE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.orangeLeggings = ITEMS.register("orange_leggings", () -> new ArmorItem(ModArmorTiers.ORANGE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.orangeBoots = ITEMS.register("orange_boots", () -> new ArmorItem(ModArmorTiers.ORANGE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.blueHelmet = ITEMS.register("blue_helmet", () -> new ArmorItem(ModArmorTiers.BLUE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.blueChestplate = ITEMS.register("blue_chestplate", () -> new ArmorItem(ModArmorTiers.BLUE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.blueLeggings = ITEMS.register("blue_leggings", () -> new ArmorItem(ModArmorTiers.BLUE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.blueBoots = ITEMS.register("blue_boots", () -> new ArmorItem(ModArmorTiers.BLUE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.cyanHelmet = ITEMS.register("cyan_helmet", () -> new ArmorItem(ModArmorTiers.CYAN, ArmorItem.Type.HELMET, new Item.Properties()));
        this.cyanChestplate = ITEMS.register("cyan_chestplate", () -> new ArmorItem(ModArmorTiers.CYAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.cyanLeggings = ITEMS.register("cyan_leggings", () -> new ArmorItem(ModArmorTiers.CYAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.cyanBoots = ITEMS.register("cyan_boots", () -> new ArmorItem(ModArmorTiers.CYAN, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.yellowHelmet = ITEMS.register("yellow_helmet", () -> new ArmorItem(ModArmorTiers.YELLOW, ArmorItem.Type.HELMET, new Item.Properties()));
        this.yellowChestplate = ITEMS.register("yellow_chestplate", () -> new ArmorItem(ModArmorTiers.YELLOW, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.yellowLeggings = ITEMS.register("yellow_leggings", () -> new ArmorItem(ModArmorTiers.YELLOW, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.yellowBoots = ITEMS.register("yellow_boots", () -> new ArmorItem(ModArmorTiers.YELLOW, ArmorItem.Type.BOOTS, new Item.Properties()));

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

    public RegistryObject<Item> getGreenHelmet() {
        return greenHelmet;
    }

    public RegistryObject<Item> getGreenChestplate() {
        return greenChestplate;
    }

    public RegistryObject<Item> getGreenLeggings() {
        return greenLeggings;
    }

    public RegistryObject<Item> getGreenBoots() {
        return greenBoots;
    }

    public RegistryObject<Item> getOrangeHelmet() {
        return orangeHelmet;
    }

    public RegistryObject<Item> getOrangeChestplate() {
        return orangeChestplate;
    }

    public RegistryObject<Item> getOrangeLeggings() {
        return orangeLeggings;
    }

    public RegistryObject<Item> getOrangeBoots() {
        return orangeBoots;
    }

    public RegistryObject<Item> getBlueHelmet() {
        return blueHelmet;
    }

    public RegistryObject<Item> getBlueChestplate() {
        return blueChestplate;
    }

    public RegistryObject<Item> getBlueLeggings() {
        return blueLeggings;
    }

    public RegistryObject<Item> getBlueBoots() {
        return blueBoots;
    }

    public RegistryObject<Item> getCyanHelmet() {
        return cyanHelmet;
    }

    public RegistryObject<Item> getCyanChestplate() {
        return cyanChestplate;
    }

    public RegistryObject<Item> getCyanLeggings() {
        return cyanLeggings;
    }

    public RegistryObject<Item> getCyanBoots() {
        return cyanBoots;
    }

    public RegistryObject<Item> getYellowHelmet() {
        return yellowHelmet;
    }

    public RegistryObject<Item> getYellowChestplate() {
        return yellowChestplate;
    }

    public RegistryObject<Item> getYellowLeggings() {
        return yellowLeggings;
    }

    public RegistryObject<Item> getYellowBoots() {
        return yellowBoots;
    }
}
