package dev.dekay.colorarmor;

import com.mojang.logging.LogUtils;
import dev.dekay.colorarmor.item.ModItemTab;
import dev.dekay.colorarmor.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModItemArmor.MODID)
public class ModItemArmor {
    public static final String MODID = "mia";
    public static final Logger LOGGER = LogUtils.getLogger();

    private static ModItems items;

    public ModItemArmor() {
        LOGGER.info("Starting eventbus...");
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.info("Started eventbus.");
        LOGGER.info("Register eventbus...");
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Registered eventbus.");
        LOGGER.info("Register items...");
        items = new ModItems(eventBus);
        LOGGER.info("Registered items.");
        new ModItemTab(eventBus);
        LOGGER.info("Register itemtabs...");
        LOGGER.info("Registered itemtabs.");
    }

    public static ModItems getItems() {
        return items;
    }



}
