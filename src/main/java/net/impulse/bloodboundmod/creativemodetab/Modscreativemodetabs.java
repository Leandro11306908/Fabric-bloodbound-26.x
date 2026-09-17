package net.impulse.bloodboundmod.creativemodetab;

import net.impulse.bloodboundmod.Bloodbound;
import net.minecraft.world.item.CreativeModeTab;

import java.rmi.registry.Registry;

public class Modscreativemodetabs{
    public static final CreativeModeTab fluorite_item_tab = Registry.register(BuildInRegistries.CREARIVE_MODE_TAB,
            Identifier.formNamespaceAndPath(Bloodbound.MOD_ID, path:"fluorite_items")

    public static void registerModCreativeModeTabs(){
        Bloodbound.LOGGER.info("Registering Creative Mode Tabs for " + Bloodbound.MOD_ID),
        FabricCreativeModeTab.builder().build());

    }
}