package com.mcwtrpdoors.kikoz;

import com.mcwtrpdoors.kikoz.init.BlockInit;
import com.mcwtrpdoors.kikoz.init.ItemInit;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwtrpdoors")
@Mod.EventBusSubscriber(modid = MacawsTrapdoors.MOD_ID, bus = Bus.MOD)
public class MacawsTrapdoors 
{
	public static final String MOD_ID = "mcwtrpdoors";
	public static MacawsTrapdoors instance;
	
	
	public MacawsTrapdoors() 
	{
			final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			ItemInit.ITEMS.register(modEventBus);
			BlockInit.BLOCKS.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}
	
	

	private void doClientStuff(final FMLClientSetupEvent event)
	{
		 
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	
	}

	
    public static CreativeModeTab TrapDoorItemGroup;

    @SubscribeEvent
    public static void register(CreativeModeTabEvent.Register event) {
    	TrapDoorItemGroup = event.registerCreativeModeTab(
                new ResourceLocation("mcwtrpdoors", MacawsTrapdoors.MOD_ID), builder -> builder
                        .icon(() -> new ItemStack(BlockInit.OAK_RANCH_TRAPDOOR.get()))
                        .displayItems((flags, output, isop) -> ItemInit.ITEMS.getEntries().forEach(o -> output.accept(o.get())))
                        .title(Component.translatable("itemGroup.mcwtrpdoors"))
        );
    }
    
    
}















