package dev.dekay.colorarmor.item;

import dev.dekay.colorarmor.ModItemArmor;
import dev.dekay.colorarmor.armor.ModArmorTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemTab {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModItemArmor.MODID);

        private final RegistryObject<CreativeModeTab> tab;

        public ModItemTab(IEventBus eventBus) {
            this.tab = CREATIVE_MODE_TABS.register("itemarmortab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mia.tab"))
                    .icon(Items.BARRIER::getDefaultInstance)
                    .displayItems((parameters, output) -> {
                        output.accept(ModItemArmor.getItems().getRedHelmet().get());
                        output.accept(ModItemArmor.getItems().getRedChestplate().get());
                        output.accept(ModItemArmor.getItems().getRedLeggings().get());
                        output.accept(ModItemArmor.getItems().getRedBoots().get());

                        output.accept(ModItemArmor.getItems().getLimeHelmet().get());
                        output.accept(ModItemArmor.getItems().getLimeChestplate().get());
                        output.accept(ModItemArmor.getItems().getLimeLeggings().get());
                        output.accept(ModItemArmor.getItems().getLimeBoots().get());
                    }).build()
            );
            CREATIVE_MODE_TABS.register(eventBus);
        }
}
