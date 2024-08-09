package dev.dekay.colorarmor.util;

public enum ModMaterial {

    RED(1, 2, 2, 1, 0, 0, 0),
    LAPIS(2, 2,2,2,0,0,0),
    EMERALD(3,6,4,3,0,0,0),
    REDSTONE(2,2,2,2,0,0,0),
    COAL(2,4,3,2,0,0,0),
    COPPER(2,3,2,2,0,0,0),
    RAW_IRON(2,3,2,2,0,0,0),
    RAW_GOLD(2,3,2,2,0,0,0),
    RAW_COPPER(2,3,2,1,0,0,0),
    GUNPOWDER(1,1,1,1,0,0,0);

    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final float toughness;
    private final float knockbackResistance;

    ModMaterial(int bootReduce, int legReduce, int chestReduce, int headReduce, int enchantmentValue, float toughness, float knockbackResistance) {
        this.protectionAmounts = new int[]{headReduce, chestReduce, legReduce, bootReduce};
        this.enchantmentValue = enchantmentValue;
        this.knockbackResistance = knockbackResistance;
        this.toughness = toughness;
    }

    public int[] getProtectionAmounts() {
        return protectionAmounts;
    }

    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public float getToughness() {
        return toughness;
    }

    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
