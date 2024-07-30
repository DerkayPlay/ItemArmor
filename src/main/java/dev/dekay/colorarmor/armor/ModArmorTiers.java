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

    RED("red", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.RED_DYE), new int[]{12, 15, 16, 12}),
    LIME("lime", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.LIME_DYE), new int[]{12, 15, 16, 12}),
    GREEN("green", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.GREEN_DYE), new int[]{12, 15, 16, 12}),
    ORANGE("orange", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.ORANGE_DYE), new int[]{12, 15, 16, 12}),
    BLUE("blue", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.BLUE_DYE), new int[]{12, 15, 16, 12}),
    CYAN("cyan", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.CYAN_DYE), new int[]{12, 15, 16, 12}),
    YELLOW("yellow", ModMaterial.RED, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.YELLOW_DYE), new int[]{12, 15, 16, 12}),

    GUNPOWDER("gunpowder", ModMaterial.GUNPOWDER, SoundEvents.CREEPER_PRIMED, () -> Ingredient.of(Items.GUNPOWDER), new int[]{10, 10, 10, 10});

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
