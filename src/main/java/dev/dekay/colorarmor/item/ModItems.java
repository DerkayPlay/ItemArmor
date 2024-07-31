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
    public static RegistryObject<Item> whiteHelmet;
    public static RegistryObject<Item> whiteChestplate;
    public static RegistryObject<Item> whiteLeggings;
    public static RegistryObject<Item> whiteBoots;
    public static RegistryObject<Item> blackHelmet;
    public static RegistryObject<Item> blackChestplate;
    public static RegistryObject<Item> blackLeggings;
    public static RegistryObject<Item> blackBoots;
    public static RegistryObject<Item> purpleHelmet;
    public static RegistryObject<Item> purpleChestplate;
    public static RegistryObject<Item> purpleLeggings;
    public static RegistryObject<Item> purpleBoots;
    public static RegistryObject<Item> lightBlueHelmet;
    public static RegistryObject<Item> lightBlueChestplate;
    public static RegistryObject<Item> lightBlueLeggings;
    public static RegistryObject<Item> lightBlueBoots;
    public static RegistryObject<Item> grayHelmet;
    public static RegistryObject<Item> grayChestplate;
    public static RegistryObject<Item> grayLeggings;
    public static RegistryObject<Item> grayBoots;
    public static RegistryObject<Item> lightGrayHelmet;
    public static RegistryObject<Item> lightGrayChestplate;
    public static RegistryObject<Item> lightGrayLeggings;
    public static RegistryObject<Item> lightGrayBoots;
    public static RegistryObject<Item> brownHelmet;
    public static RegistryObject<Item> brownChestplate;
    public static RegistryObject<Item> brownLeggings;
    public static RegistryObject<Item> brownBoots;
    public static RegistryObject<Item> magentaHelmet;
    public static RegistryObject<Item> magentaChestplate;
    public static RegistryObject<Item> magentaLeggings;
    public static RegistryObject<Item> magentaBoots;
    public static RegistryObject<Item> pinkHelmet;
    public static RegistryObject<Item> pinkChestplate;
    public static RegistryObject<Item> pinkLeggings;
    public static RegistryObject<Item> pinkBoots;

    public static RegistryObject<Item> gunpowderHelmet;
    public static RegistryObject<Item> gunpowderChestplate;
    public static RegistryObject<Item> gunpowderLeggings;
    public static RegistryObject<Item> gunpowderBoots;

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

        this.whiteHelmet = ITEMS.register("white_helmet", () -> new ArmorItem(ModArmorTiers.WHITE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.whiteChestplate = ITEMS.register("white_chestplate", () -> new ArmorItem(ModArmorTiers.WHITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.whiteLeggings = ITEMS.register("white_leggings", () -> new ArmorItem(ModArmorTiers.WHITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.whiteBoots = ITEMS.register("white_boots", () -> new ArmorItem(ModArmorTiers.WHITE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.blackHelmet = ITEMS.register("black_helmet", () -> new ArmorItem(ModArmorTiers.BLACK, ArmorItem.Type.HELMET, new Item.Properties()));
        this.blackChestplate = ITEMS.register("black_chestplate", () -> new ArmorItem(ModArmorTiers.BLACK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.blackLeggings = ITEMS.register("black_leggings", () -> new ArmorItem(ModArmorTiers.BLACK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.blackBoots = ITEMS.register("black_boots", () -> new ArmorItem(ModArmorTiers.BLACK, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.purpleHelmet = ITEMS.register("purple_helmet", () -> new ArmorItem(ModArmorTiers.PURPLE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.purpleChestplate = ITEMS.register("purple_chestplate", () -> new ArmorItem(ModArmorTiers.PURPLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.purpleLeggings = ITEMS.register("purple_leggings", () -> new ArmorItem(ModArmorTiers.PURPLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.purpleBoots = ITEMS.register("purple_boots", () -> new ArmorItem(ModArmorTiers.PURPLE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.lightBlueHelmet = ITEMS.register("light_blue_helmet", () -> new ArmorItem(ModArmorTiers.LIGHT_BLUE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.lightBlueChestplate = ITEMS.register("light_blue_chestplate", () -> new ArmorItem(ModArmorTiers.LIGHT_BLUE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.lightBlueLeggings = ITEMS.register("light_blue_leggings", () -> new ArmorItem(ModArmorTiers.LIGHT_BLUE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.lightBlueBoots = ITEMS.register("light_blue_boots", () -> new ArmorItem(ModArmorTiers.LIGHT_BLUE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.grayHelmet = ITEMS.register("gray_helmet", () -> new ArmorItem(ModArmorTiers.GRAY, ArmorItem.Type.HELMET, new Item.Properties()));
        this.grayChestplate = ITEMS.register("gray_chestplate", () -> new ArmorItem(ModArmorTiers.GRAY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.grayLeggings = ITEMS.register("gray_leggings", () -> new ArmorItem(ModArmorTiers.GRAY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.grayBoots = ITEMS.register("gray_boots", () -> new ArmorItem(ModArmorTiers.GRAY, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.lightGrayHelmet = ITEMS.register("light_gray_helmet", () -> new ArmorItem(ModArmorTiers.LIGHT_GRAY, ArmorItem.Type.HELMET, new Item.Properties()));
        this.lightGrayChestplate = ITEMS.register("light_gray_chestplate", () -> new ArmorItem(ModArmorTiers.LIGHT_GRAY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.lightGrayLeggings = ITEMS.register("light_gray_leggings", () -> new ArmorItem(ModArmorTiers.LIGHT_GRAY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.lightGrayBoots = ITEMS.register("light_gray_boots", () -> new ArmorItem(ModArmorTiers.LIGHT_GRAY, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.brownHelmet = ITEMS.register("brown_helmet", () -> new ArmorItem(ModArmorTiers.BROWN, ArmorItem.Type.HELMET, new Item.Properties()));
        this.brownChestplate = ITEMS.register("brown_chestplate", () -> new ArmorItem(ModArmorTiers.BROWN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.brownLeggings = ITEMS.register("brown_leggings", () -> new ArmorItem(ModArmorTiers.BROWN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.brownBoots = ITEMS.register("brown_boots", () -> new ArmorItem(ModArmorTiers.BROWN, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.magentaHelmet = ITEMS.register("magenta_helmet", () -> new ArmorItem(ModArmorTiers.MAGENTA, ArmorItem.Type.HELMET, new Item.Properties()));
        this.magentaChestplate = ITEMS.register("magenta_chestplate", () -> new ArmorItem(ModArmorTiers.MAGENTA, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.magentaLeggings = ITEMS.register("magenta_leggings", () -> new ArmorItem(ModArmorTiers.MAGENTA, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.magentaBoots = ITEMS.register("magenta_boots", () -> new ArmorItem(ModArmorTiers.MAGENTA, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.pinkHelmet = ITEMS.register("pink_helmet", () -> new ArmorItem(ModArmorTiers.PINK, ArmorItem.Type.HELMET, new Item.Properties()));
        this.pinkChestplate = ITEMS.register("pink_chestplate", () -> new ArmorItem(ModArmorTiers.PINK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.pinkLeggings = ITEMS.register("pink_leggings", () -> new ArmorItem(ModArmorTiers.PINK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.pinkBoots = ITEMS.register("pink_boots", () -> new ArmorItem(ModArmorTiers.PINK, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.gunpowderHelmet = ITEMS.register("gunpowder_helmet", () -> new ArmorItem(ModArmorTiers.GUNPOWDER, ArmorItem.Type.HELMET, new Item.Properties()));
        this.gunpowderChestplate = ITEMS.register("gunpowder_chestplate", () -> new ArmorItem(ModArmorTiers.GUNPOWDER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.gunpowderLeggings = ITEMS.register("gunpowder_leggings", () -> new ArmorItem(ModArmorTiers.GUNPOWDER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.gunpowderBoots = ITEMS.register("gunpowder_boots", () -> new ArmorItem(ModArmorTiers.GUNPOWDER, ArmorItem.Type.BOOTS, new Item.Properties()));

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

    public RegistryObject<Item> getGunpowderHelmet() {
        return gunpowderHelmet;
    }

    public RegistryObject<Item> getGunpowderChestplate() {
        return gunpowderChestplate;
    }

    public RegistryObject<Item> getGunpowderLeggings() {
        return gunpowderLeggings;
    }

    public RegistryObject<Item> getGunpowderBoots() {
        return gunpowderBoots;
    }

    public RegistryObject<Item> getWhiteHelmet() {
        return whiteHelmet;
    }

    public RegistryObject<Item> getWhiteChestplate() {
        return whiteChestplate;
    }

    public RegistryObject<Item> getWhiteLeggings() {
        return whiteLeggings;
    }

    public RegistryObject<Item> getWhiteBoots() {
        return whiteBoots;
    }

    public RegistryObject<Item> getBlackHelmet() {
        return blackHelmet;
    }

    public RegistryObject<Item> getBlackChestplate() {
        return blackChestplate;
    }

    public RegistryObject<Item> getBlackLeggings() {
        return blackLeggings;
    }

    public RegistryObject<Item> getBlackBoots() {
        return blackBoots;
    }

    public RegistryObject<Item> getPurpleHelmet() {
        return purpleHelmet;
    }

    public RegistryObject<Item> getPurpleChestplate() {
        return purpleChestplate;
    }

    public RegistryObject<Item> getPurpleLeggings() {
        return purpleLeggings;
    }

    public RegistryObject<Item> getPurpleBoots() {
        return purpleBoots;
    }

    public RegistryObject<Item> getLightBlueHelmet() {
        return lightBlueHelmet;
    }

    public RegistryObject<Item> getLightBlueChestplate() {
        return lightBlueChestplate;
    }

    public RegistryObject<Item> getLightBlueLeggings() {
        return lightBlueLeggings;
    }

    public RegistryObject<Item> getLightBlueBoots() {
        return lightBlueBoots;
    }

    public RegistryObject<Item> getGrayHelmet() {
        return grayHelmet;
    }

    public RegistryObject<Item> getGrayChestplate() {
        return grayChestplate;
    }

    public RegistryObject<Item> getGrayLeggings() {
        return grayLeggings;
    }

    public RegistryObject<Item> getGrayBoots() {
        return grayBoots;
    }

    public RegistryObject<Item> getLightGrayHelmet() {
        return lightGrayHelmet;
    }

    public RegistryObject<Item> getLightGrayChestplate() {
        return lightGrayChestplate;
    }

    public RegistryObject<Item> getLightGrayLeggings() {
        return lightGrayLeggings;
    }

    public RegistryObject<Item> getLightGrayBoots() {
        return lightGrayBoots;
    }

    public RegistryObject<Item> getBrownHelmet() {
        return brownHelmet;
    }

    public RegistryObject<Item> getBrownChestplate() {
        return brownChestplate;
    }

    public RegistryObject<Item> getBrownLeggings() {
        return brownLeggings;
    }

    public RegistryObject<Item> getBrownBoots() {
        return brownBoots;
    }

    public RegistryObject<Item> getMagentaHelmet() {
        return magentaHelmet;
    }

    public RegistryObject<Item> getMagentaChestplate() {
        return magentaChestplate;
    }

    public RegistryObject<Item> getMagentaLeggings() {
        return magentaLeggings;
    }

    public RegistryObject<Item> getMagentaBoots() {
        return magentaBoots;
    }

    public RegistryObject<Item> getPinkHelmet() {
        return pinkHelmet;
    }

    public RegistryObject<Item> getPinkChestplate() {
        return pinkChestplate;
    }

    public RegistryObject<Item> getPinkLeggings() {
        return pinkLeggings;
    }

    public RegistryObject<Item> getPinkBoots() {
        return pinkBoots;
    }
}
