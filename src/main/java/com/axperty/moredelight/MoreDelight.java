package com.axperty.moredelight;

import com.axperty.moredelight.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreDelight.MODID)
public class MoreDelight {
    public static final String MODID = "moredelight";

    public MoreDelight() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModCreativeTab.register(bus);
    }
}
