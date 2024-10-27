package dev.dekay.colorarmor.armor;

import dev.dekay.colorarmor.ModItemArmor;
import dev.dekay.colorarmor.util.LazyValue;
import dev.dekay.colorarmor.util.ModMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModArmorTiers implements ArmorMaterial {

    RED("red", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.RED_DYE), new int[]{50, 65, 75, 50}),
    LIME("lime", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.LIME_DYE), new int[]{50, 65, 75, 50}),
    GREEN("green", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.GREEN_DYE), new int[]{50, 65, 75, 50}),
    ORANGE("orange", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.ORANGE_DYE), new int[]{50, 65, 75, 50}),
    BLUE("blue", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.BLUE_DYE), new int[]{50, 65, 75, 50}),
    CYAN("cyan", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.CYAN_DYE), new int[]{50, 65, 75, 50}),
    YELLOW("yellow", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.YELLOW_DYE), new int[]{50, 65, 75, 50}),
    WHITE("white", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.WHITE_DYE), new int[]{50, 65, 75, 50}),
    BLACK("black", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.BLACK_DYE), new int[]{50, 65, 75, 50}),
    PURPLE("purple", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.PURPLE_DYE), new int[]{50, 65, 75, 50}),
    LIGHT_BLUE("light_blue", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.LIGHT_BLUE_DYE), new int[]{50, 65, 75, 50}),
    GRAY("gray", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.GRAY_DYE), new int[]{50, 65, 75, 50}),
    LIGHT_GRAY("light_gray", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.LIGHT_GRAY_DYE), new int[]{50, 65, 75, 50}),
    BROWN("brown", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.BROWN_DYE), new int[]{50, 65, 75, 50}),
    MAGENTA("magenta", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.MAGENTA_DYE), new int[]{50, 65, 75, 50}),
    PINK("pink", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.PINK_DYE), new int[]{50, 65, 75, 50}),

    LAPIS("lapis", ModMaterial.LAPIS, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.LAPIS_LAZULI), new int[]{100, 150, 155, 100}),
    EMERALD("emerald", ModMaterial.EMERALD, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(Items.EMERALD), new int[]{195, 225, 240, 165}),
    REDSONE("redstone", ModMaterial.REDSTONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.REDSTONE), new int[]{100, 150, 155, 100}),
    COAL("coal", ModMaterial.COAL, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.COAL), new int[]{145, 185, 200, 125}),
    COPPER("copper", ModMaterial.COPPER, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.COPPER_INGOT), new int[]{150, 195, 200, 150}),
    RAW_IRON("raw_iron", ModMaterial.RAW_IRON, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.RAW_IRON), new int[]{150, 195, 200, 150}),
    RAW_GOLD("raw_gold", ModMaterial.RAW_GOLD, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.RAW_GOLD), new int[]{61, 75, 82, 47}),
    RAW_COPPER("raw_copper", ModMaterial.RAW_COPPER, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.RAW_COPPER), new int[]{110, 155, 160, 110}),
    QUARTZ("quartz", ModMaterial.QUARTZ, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.QUARTZ), new int[]{195, 225, 240, 165}),

    ENDER_PEARL("ender_pearl", ModMaterial.ENDER_PEARL, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.ENDER_PEARL), new int[]{300, 400, 450, 300}),
    ENDER_EYE("ender_eye", ModMaterial.ENDER_EYE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.ENDER_EYE), new int[]{350, 450, 500, 350}),
    AMETHYST("amethyst", ModMaterial.AMETHYST, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(Items.AMETHYST_SHARD), new int[]{200, 225, 250, 200}),
    DRIED_KELP("dried_kelp", ModMaterial.DRIED_KELP, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.DRIED_KELP), new int[]{5, 5, 5, 5}),

    CHARCOAL("charcoal", ModMaterial.CHARCOAL, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.CHARCOAL), new int[]{145, 185, 200, 125}),
    BRICK("brick", ModMaterial.BRICK, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.BRICK), new int[]{150, 190, 210, 130}),
    NETHER_BRICK("nether_brick", ModMaterial.NETHER_BRICK, SoundEvents.ARMOR_EQUIP_GOLD, () -> Ingredient.of(Items.NETHER_BRICK), new int[]{150, 190, 210, 130}),
    ECHO_SHARD("echo_shard", ModMaterial.ECHO_SHARD, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.ECHO_SHARD), new int[]{120, 135, 145, 120}),

    GUNPOWDER("gunpowder", ModMaterial.GUNPOWDER, SoundEvents.CREEPER_PRIMED, () -> Ingredient.of(Items.GUNPOWDER), new int[]{20, 20, 20, 20});

    private final String name;
    private final ModMaterial material;
    private final SoundEvent equipSound;
    private final LazyValue<Ingredient> repairMaterial;
    private final int[] baseDurability;

    ModArmorTiers(String name, ModMaterial material, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, int[] baseDurability) {
        this.name = name;
        this.equipSound = equipSound;
        this.material = material;
        this.repairMaterial = new LazyValue<>(repairMaterial);
        this.baseDurability = baseDurability;
    }
    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return baseDurability[type.getSlot().getIndex()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.material.getProtectionAmounts()[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.getEnchantmentValue();
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public @NotNull String getName() {
        return ModItemArmor.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.material.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return this.material.getKnockbackResistance();
    }
}
