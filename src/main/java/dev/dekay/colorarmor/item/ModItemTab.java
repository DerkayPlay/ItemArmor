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

                        output.accept(ModItemArmor.getItems().getLightBlueHelmet().get());
                        output.accept(ModItemArmor.getItems().getLightBlueChestplate().get());
                        output.accept(ModItemArmor.getItems().getLightBlueLeggings().get());
                        output.accept(ModItemArmor.getItems().getLightBlueBoots().get());

                        output.accept(ModItemArmor.getItems().getPinkHelmet().get());
                        output.accept(ModItemArmor.getItems().getPinkChestplate().get());
                        output.accept(ModItemArmor.getItems().getPinkLeggings().get());
                        output.accept(ModItemArmor.getItems().getPinkBoots().get());

                        output.accept(ModItemArmor.getItems().getMagentaHelmet().get());
                        output.accept(ModItemArmor.getItems().getMagentaChestplate().get());
                        output.accept(ModItemArmor.getItems().getMagentaLeggings().get());
                        output.accept(ModItemArmor.getItems().getMagentaBoots().get());

                        output.accept(ModItemArmor.getItems().getPurpleHelmet().get());
                        output.accept(ModItemArmor.getItems().getPurpleChestplate().get());
                        output.accept(ModItemArmor.getItems().getPurpleLeggings().get());
                        output.accept(ModItemArmor.getItems().getPurpleBoots().get());

                        output.accept(ModItemArmor.getItems().getBlackHelmet().get());
                        output.accept(ModItemArmor.getItems().getBlackChestplate().get());
                        output.accept(ModItemArmor.getItems().getBlackLeggings().get());
                        output.accept(ModItemArmor.getItems().getBlackBoots().get());

                        output.accept(ModItemArmor.getItems().getGrayHelmet().get());
                        output.accept(ModItemArmor.getItems().getGrayChestplate().get());
                        output.accept(ModItemArmor.getItems().getGrayLeggings().get());
                        output.accept(ModItemArmor.getItems().getGrayBoots().get());

                        output.accept(ModItemArmor.getItems().getLightGrayHelmet().get());
                        output.accept(ModItemArmor.getItems().getLightGrayChestplate().get());
                        output.accept(ModItemArmor.getItems().getLightGrayLeggings().get());
                        output.accept(ModItemArmor.getItems().getLightGrayBoots().get());

                        output.accept(ModItemArmor.getItems().getWhiteHelmet().get());
                        output.accept(ModItemArmor.getItems().getWhiteChestplate().get());
                        output.accept(ModItemArmor.getItems().getWhiteLeggings().get());
                        output.accept(ModItemArmor.getItems().getWhiteBoots().get());

                        output.accept(ModItemArmor.getItems().getBrownHelmet().get());
                        output.accept(ModItemArmor.getItems().getBrownChestplate().get());
                        output.accept(ModItemArmor.getItems().getBrownLeggings().get());
                        output.accept(ModItemArmor.getItems().getBrownBoots().get());

                        output.accept(ModItemArmor.getItems().getGunpowderHelmet().get());
                        output.accept(ModItemArmor.getItems().getGunpowderChestplate().get());
                        output.accept(ModItemArmor.getItems().getGunpowderLeggings().get());
                        output.accept(ModItemArmor.getItems().getGunpowderBoots().get());

                        output.accept(ModItemArmor.getItems().getLapisHelmet().get());
                        output.accept(ModItemArmor.getItems().getLapisChestplate().get());
                        output.accept(ModItemArmor.getItems().getLapisLeggings().get());
                        output.accept(ModItemArmor.getItems().getLapisBoots().get());

                        output.accept(ModItemArmor.getItems().getRedstoneHelmet().get());
                        output.accept(ModItemArmor.getItems().getRedstoneChestplate().get());
                        output.accept(ModItemArmor.getItems().getRedstoneLeggings().get());
                        output.accept(ModItemArmor.getItems().getRedstoneBoots().get());

                        output.accept(ModItemArmor.getItems().getCoalHelmet().get());
                        output.accept(ModItemArmor.getItems().getCoalChestplate().get());
                        output.accept(ModItemArmor.getItems().getCoalLeggings().get());
                        output.accept(ModItemArmor.getItems().getCoalBoots().get());

                        output.accept(ModItemArmor.getItems().getEmeraldHelmet().get());
                        output.accept(ModItemArmor.getItems().getEmeraldChestplate().get());
                        output.accept(ModItemArmor.getItems().getEmeraldLeggings().get());
                        output.accept(ModItemArmor.getItems().getEmeraldBoots().get());

                        output.accept(ModItemArmor.getItems().getCopperHelmet().get());
                        output.accept(ModItemArmor.getItems().getCopperChestplate().get());
                        output.accept(ModItemArmor.getItems().getCopperLeggings().get());
                        output.accept(ModItemArmor.getItems().getCopperBoots().get());

                        output.accept(ModItemArmor.getItems().getRawIronHelmet().get());
                        output.accept(ModItemArmor.getItems().getRawIronChestplate().get());
                        output.accept(ModItemArmor.getItems().getRawIronLeggings().get());
                        output.accept(ModItemArmor.getItems().getRawIronBoots().get());

                        output.accept(ModItemArmor.getItems().getRawGoldHelmet().get());
                        output.accept(ModItemArmor.getItems().getRawGoldChestplate().get());
                        output.accept(ModItemArmor.getItems().getRawGoldLeggings().get());
                        output.accept(ModItemArmor.getItems().getRawGoldBoots().get());

                        output.accept(ModItemArmor.getItems().getRawCopperHelmet().get());
                        output.accept(ModItemArmor.getItems().getRawCopperChestplate().get());
                        output.accept(ModItemArmor.getItems().getRawCopperLeggings().get());
                        output.accept(ModItemArmor.getItems().getRawCopperBoots().get());

                        output.accept(ModItemArmor.getItems().getQuartzHelmet().get());
                        output.accept(ModItemArmor.getItems().getQuartzChestplate().get());
                        output.accept(ModItemArmor.getItems().getQuartzLeggings().get());
                        output.accept(ModItemArmor.getItems().getQuartzBoots().get());

                        output.accept(ModItemArmor.getItems().getAmethystHelmet().get());
                        output.accept(ModItemArmor.getItems().getAmethystChestplate().get());
                        output.accept(ModItemArmor.getItems().getAmethystLeggings().get());
                        output.accept(ModItemArmor.getItems().getAmethystBoots().get());

                        output.accept(ModItemArmor.getItems().getEnderPearlHelmet().get());
                        output.accept(ModItemArmor.getItems().getEnderPearlChestplate().get());
                        output.accept(ModItemArmor.getItems().getEnderPearlLeggings().get());
                        output.accept(ModItemArmor.getItems().getEnderPearlBoots().get());

                        output.accept(ModItemArmor.getItems().getEnderEyeHelmet().get());
                        output.accept(ModItemArmor.getItems().getEnderEyeChestplate().get());
                        output.accept(ModItemArmor.getItems().getEnderEyeLeggings().get());
                        output.accept(ModItemArmor.getItems().getEnderEyeBoots().get());

                        output.accept(ModItemArmor.getItems().getDriedKelpHelmet().get());
                        output.accept(ModItemArmor.getItems().getDriedKelpChestplate().get());
                        output.accept(ModItemArmor.getItems().getDriedKelpLeggings().get());
                        output.accept(ModItemArmor.getItems().getDriedKelpBoots().get());

                        output.accept(ModItemArmor.getItems().getCharcoalHelemt().get());
                        output.accept(ModItemArmor.getItems().getCharcoalChestplate().get());
                        output.accept(ModItemArmor.getItems().getCharcoalLeggings().get());
                        output.accept(ModItemArmor.getItems().getCharcoalBoots().get());

                        output.accept(ModItemArmor.getItems().getBrickHelmet().get());
                        output.accept(ModItemArmor.getItems().getBrickChestplate().get());
                        output.accept(ModItemArmor.getItems().getBrickLeggings().get());
                        output.accept(ModItemArmor.getItems().getBrickBoots().get());

                        output.accept(ModItemArmor.getItems().getNetherBrickHelmet().get());
                        output.accept(ModItemArmor.getItems().getNetherBrickChestplate().get());
                        output.accept(ModItemArmor.getItems().getNetherBrickLeggings().get());
                        output.accept(ModItemArmor.getItems().getNetherBrickBoots().get());

                        output.accept(ModItemArmor.getItems().getEchoShardHelmet().get());
                        output.accept(ModItemArmor.getItems().getEchoShardChestplate().get());
                        output.accept(ModItemArmor.getItems().getEchoShardLeggings().get());
                        output.accept(ModItemArmor.getItems().getEchoShardBoots().get());

                        output.accept(ModItemArmor.getItems().getHoneycombHelmet().get());
                        output.accept(ModItemArmor.getItems().getHoneycombChestplate().get());
                        output.accept(ModItemArmor.getItems().getHoneycombLeggings().get());
                        output.accept(ModItemArmor.getItems().getHoneycombBoots().get());

                        output.accept(ModItemArmor.getItems().getBlazePowderHelmet().get());
                        output.accept(ModItemArmor.getItems().getBlazePowderChestplate().get());
                        output.accept(ModItemArmor.getItems().getBlazePowderLeggings().get());
                        output.accept(ModItemArmor.getItems().getBlazePowderBoots().get());

                        output.accept(ModItemArmor.getItems().getNetherStarHelmet().get());
                        output.accept(ModItemArmor.getItems().getNetherStarChestplate().get());
                        output.accept(ModItemArmor.getItems().getNetherStarLeggings().get());
                        output.accept(ModItemArmor.getItems().getNetherStarBoots().get());
                    }).build()
            );
            CREATIVE_MODE_TABS.register(eventBus);
        }
}
