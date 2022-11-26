package com.mcwtrpdoors.kikoz;

import javax.annotation.Nonnull;

import com.mcwtrpdoors.kikoz.init.BlockInit;
import com.mcwtrpdoors.kikoz.init.ItemInit;
import com.mcwtrpdoors.kikoz.util.FuelItemBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

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
			BlockInit.BLOCKS_STONE.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}
	
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(TrapDoorItemGroup);
			final BlockItem blockItem = new FuelItemBlock(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
		BlockInit.BLOCKS_STONE.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(TrapDoorItemGroup);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
	}
	
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}
	
	

	private void doClientStuff(final FMLClientSetupEvent event)
	{
		 
	}
	
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event)
	{
	
	}
	

	
	
	
    public static final ItemGroup TrapDoorItemGroup = new ItemGroup("mcwtrpdoors") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.OAK_GLASS_TRAPDOOR.get());
        }
    };
	
	
	
}






















