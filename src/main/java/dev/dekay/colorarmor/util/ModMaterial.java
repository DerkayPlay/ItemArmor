package dev.dekay.colorarmor.util;

public enum ModMaterial {

    RED(1, 3, 2, 1, 0, 0, 0),
    GUNPOWDER(1,1,1,1,0,0,0);

    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final float toughness;
    private final float knockbackResistance;

    ModMaterial(int headReduce, int chestReduce, int legReduce, int bootReduce, int enchantmentValue, float toughness, float knockbackResistance) {
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
