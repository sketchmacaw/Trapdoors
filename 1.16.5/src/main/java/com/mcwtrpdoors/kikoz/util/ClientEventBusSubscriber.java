package com.mcwtrpdoors.kikoz.util;

import com.mcwtrpdoors.kikoz.MacawsTrapdoors;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import com.mcwtrpdoors.kikoz.init.BlockInit;

import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MacawsTrapdoors.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
	
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BARK_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BARK_TRAPDOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BAMBOO_TRAPDOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BARN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BARRED_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BEACH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_CLASSIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_COTTAGE_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_FOUR_PANEL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_GLASS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_MYSTIC_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_PAPER_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_SWAMP_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_TROPICAL_TRAPDOOR.get(), RenderType.cutout());
	
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_RANCH_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_RANCH_TRAPDOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_WARNING_TRAPDOOR.get(), RenderType.cutout());
	
	
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
	
	
	}}
	
