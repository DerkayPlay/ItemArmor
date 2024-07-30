package dev.dekay.colorarmor.item;

import dev.dekay.colorarmor.ModItemArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemTab {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModItemArmor.MODID);

        private final RegistryObject<CreativeModeTab> tab;

        public ModItemTab(IEventBus eventBus) {
            this.tab = CREATIVE_MODE_TABS.register("itemarmortab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mia.tab"))
                    .icon(() -> ModItemArmor.getItems().getLimeChestplate().get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItemArmor.getItems().getRedHelmet().get());
                        output.accept(ModItemArmor.getItems().getRedChestplate().get());
                        output.accept(ModItemArmor.getItems().getRedLeggings().get());
                        output.accept(ModItemArmor.getItems().getRedBoots().get());

                        output.accept(ModItemArmor.getItems().getOrangeHelmet().get());
                        output.accept(ModItemArmor.getItems().getOrangeChestplate().get());
                        output.accept(ModItemArmor.getItems().getOrangeLeggings().get());
                        output.accept(ModItemArmor.getItems().getOrangeBoots().get());

                        output.accept(ModItemArmor.getItems().getYellowHelmet().get());
                        output.accept(ModItemArmor.getItems().getYellowChestplate().get());
                        output.accept(ModItemArmor.getItems().getYellowLeggings().get());
                        output.accept(ModItemArmor.getItems().getYellowBoots().get());

                        output.accept(ModItemArmor.getItems().getLimeHelmet().get());
                        output.accept(ModItemArmor.getItems().getLimeChestplate().get());
                        output.accept(ModItemArmor.getItems().getLimeLeggings().get());
                        output.accept(ModItemArmor.getItems().getLimeBoots().get());

                        output.accept(ModItemArmor.getItems().getGreenHelmet().get());
                        output.accept(ModItemArmor.getItems().getGreenChestplate().get());
                        output.accept(ModItemArmor.getItems().getGreenLeggings().get());
                        output.accept(ModItemArmor.getItems().getGreenBoots().get());

                        output.accept(ModItemArmor.getItems().getBlueHelmet().get());
                        output.accept(ModItemArmor.getItems().getBlueChestplate().get());
                        output.accept(ModItemArmor.getItems().getBlueLeggings().get());
                        output.accept(ModItemArmor.getItems().getBlueBoots().get());

                        output.accept(ModItemArmor.getItems().getCyanHelmet().get());
                        output.accept(ModItemArmor.getItems().getCyanChestplate().get());
                        output.accept(ModItemArmor.getItems().getCyanLeggings().get());
                        output.accept(ModItemArmor.getItems().getCyanBoots().get());

                        output.accept(ModItemArmor.getItems().getGunpowderHelmet().get());
                        output.accept(ModItemArmor.getItems().getGunpowderChestplate().get());
                        output.accept(ModItemArmor.getItems().getGunpowderLeggings().get());
                        output.accept(ModItemArmor.getItems().getGunpowderBoots().get());
                    }).build()
            );
            CREATIVE_MODE_TABS.register(eventBus);
        }
}
