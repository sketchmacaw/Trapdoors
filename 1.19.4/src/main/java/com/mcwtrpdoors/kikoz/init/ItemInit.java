package com.mcwtrpdoors.kikoz.init;


import com.mcwtrpdoors.kikoz.MacawsTrapdoors;
import com.mcwtrpdoors.kikoz.util.FuelItemBlock;
import com.mcwtrpdoors.kikoz.util.ToolTip;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsTrapdoors.MOD_ID);

	
	public static final RegistryObject<Item> PRINT_CLASSIC = ITEMS.register("print_classic", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_COTTAGE = ITEMS.register("print_cottage", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_PAPER = ITEMS.register("print_paper", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_BEACH = ITEMS.register("print_beach", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_TROPICAL = ITEMS.register("print_tropical", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_FOUR_PANEL = ITEMS.register("print_four_panel", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_BARRED = ITEMS.register("print_barred", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_MYSTIC = ITEMS.register("print_mystic", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_SWAMP = ITEMS.register("print_swamp", () -> new ToolTip(new Item.Properties()));
	public static final RegistryObject<Item> PRINT_BAMBOO = ITEMS.register("print_bamboo", () -> new ToolTip(new Item.Properties()));


	public static final RegistryObject<Item> OAK_BARN_TRAPDOOR = ITEMS.register("oak_barn_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_BARRED_TRAPDOOR = ITEMS.register("oak_barred_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_BEACH_TRAPDOOR = ITEMS.register("oak_beach_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_COTTAGE_TRAPDOOR = ITEMS.register("oak_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_FOUR_PANEL_TRAPDOOR = ITEMS.register("oak_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_GLASS_TRAPDOOR = ITEMS.register("oak_glass_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_MYSTIC_TRAPDOOR = ITEMS.register("oak_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_PAPER_TRAPDOOR = ITEMS.register("oak_paper_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_TROPICAL_TRAPDOOR = ITEMS.register("oak_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_SWAMP_TRAPDOOR = ITEMS.register("oak_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_BAMBOO_TRAPDOOR = ITEMS.register("oak_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> SPRUCE_BARN_TRAPDOOR = ITEMS.register("spruce_barn_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BARRED_TRAPDOOR = ITEMS.register("spruce_barred_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BEACH_TRAPDOOR = ITEMS.register("spruce_beach_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_CLASSIC_TRAPDOOR = ITEMS.register("spruce_classic_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_FOUR_PANEL_TRAPDOOR = ITEMS.register("spruce_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_GLASS_TRAPDOOR = ITEMS.register("spruce_glass_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_MYSTIC_TRAPDOOR = ITEMS.register("spruce_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_PAPER_TRAPDOOR = ITEMS.register("spruce_paper_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_TROPICAL_TRAPDOOR = ITEMS.register("spruce_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_SWAMP_TRAPDOOR = ITEMS.register("spruce_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BAMBOO_TRAPDOOR = ITEMS.register("spruce_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_BAMBOO_TRAPDOOR.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> BIRCH_BARN_TRAPDOOR = ITEMS.register("birch_barn_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BARRED_TRAPDOOR = ITEMS.register("birch_barred_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BEACH_TRAPDOOR = ITEMS.register("birch_beach_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_CLASSIC_TRAPDOOR = ITEMS.register("birch_classic_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_COTTAGE_TRAPDOOR = ITEMS.register("birch_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_FOUR_PANEL_TRAPDOOR = ITEMS.register("birch_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_GLASS_TRAPDOOR = ITEMS.register("birch_glass_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_MYSTIC_TRAPDOOR = ITEMS.register("birch_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_TROPICAL_TRAPDOOR = ITEMS.register("birch_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_SWAMP_TRAPDOOR = ITEMS.register("birch_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BAMBOO_TRAPDOOR = ITEMS.register("birch_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> JUNGLE_BARN_TRAPDOOR = ITEMS.register("jungle_barn_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_BARRED_TRAPDOOR = ITEMS.register("jungle_barred_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_CLASSIC_TRAPDOOR = ITEMS.register("jungle_classic_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_COTTAGE_TRAPDOOR = ITEMS.register("jungle_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_FOUR_PANEL_TRAPDOOR = ITEMS.register("jungle_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_GLASS_TRAPDOOR = ITEMS.register("jungle_glass_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_MYSTIC_TRAPDOOR = ITEMS.register("jungle_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_PAPER_TRAPDOOR = ITEMS.register("jungle_paper_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_TROPICAL_TRAPDOOR = ITEMS.register("jungle_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_SWAMP_TRAPDOOR = ITEMS.register("jungle_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_BAMBOO_TRAPDOOR = ITEMS.register("jungle_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> ACACIA_BARN_TRAPDOOR = ITEMS.register("acacia_barn_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BARRED_TRAPDOOR = ITEMS.register("acacia_barred_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BEACH_TRAPDOOR = ITEMS.register("acacia_beach_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_CLASSIC_TRAPDOOR = ITEMS.register("acacia_classic_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_COTTAGE_TRAPDOOR = ITEMS.register("acacia_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_FOUR_PANEL_TRAPDOOR = ITEMS.register("acacia_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_GLASS_TRAPDOOR = ITEMS.register("acacia_glass_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_MYSTIC_TRAPDOOR = ITEMS.register("acacia_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_PAPER_TRAPDOOR = ITEMS.register("acacia_paper_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_SWAMP_TRAPDOOR = ITEMS.register("acacia_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BAMBOO_TRAPDOOR = ITEMS.register("acacia_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> DARK_OAK_BARN_TRAPDOOR = ITEMS.register("dark_oak_barn_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BARRED_TRAPDOOR = ITEMS.register("dark_oak_barred_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BEACH_TRAPDOOR = ITEMS.register("dark_oak_beach_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_CLASSIC_TRAPDOOR = ITEMS.register("dark_oak_classic_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_COTTAGE_TRAPDOOR = ITEMS.register("dark_oak_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_GLASS_TRAPDOOR = ITEMS.register("dark_oak_glass_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_MYSTIC_TRAPDOOR = ITEMS.register("dark_oak_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_PAPER_TRAPDOOR = ITEMS.register("dark_oak_paper_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_TROPICAL_TRAPDOOR = ITEMS.register("dark_oak_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_SWAMP_TRAPDOOR = ITEMS.register("dark_oak_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BAMBOO_TRAPDOOR = ITEMS.register("dark_oak_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> CRIMSON_BARN_TRAPDOOR = ITEMS.register("crimson_barn_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_BEACH_TRAPDOOR = ITEMS.register("crimson_beach_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_CLASSIC_TRAPDOOR = ITEMS.register("crimson_classic_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_COTTAGE_TRAPDOOR = ITEMS.register("crimson_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_FOUR_PANEL_TRAPDOOR = ITEMS.register("crimson_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_GLASS_TRAPDOOR = ITEMS.register("crimson_glass_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_MYSTIC_TRAPDOOR = ITEMS.register("crimson_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_PAPER_TRAPDOOR = ITEMS.register("crimson_paper_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_TROPICAL_TRAPDOOR = ITEMS.register("crimson_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_SWAMP_TRAPDOOR = ITEMS.register("crimson_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_BAMBOO_TRAPDOOR = ITEMS.register("crimson_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> WARPED_BARN_TRAPDOOR = ITEMS.register("warped_barn_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BARRED_TRAPDOOR = ITEMS.register("warped_barred_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BEACH_TRAPDOOR = ITEMS.register("warped_beach_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_CLASSIC_TRAPDOOR = ITEMS.register("warped_classic_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_COTTAGE_TRAPDOOR = ITEMS.register("warped_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_FOUR_PANEL_TRAPDOOR = ITEMS.register("warped_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_GLASS_TRAPDOOR = ITEMS.register("warped_glass_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_PAPER_TRAPDOOR = ITEMS.register("warped_paper_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_TROPICAL_TRAPDOOR = ITEMS.register("warped_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_SWAMP_TRAPDOOR = ITEMS.register("warped_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BAMBOO_TRAPDOOR = ITEMS.register("warped_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> MANGROVE_BARN_TRAPDOOR = ITEMS.register("mangrove_barn_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BARRED_TRAPDOOR = ITEMS.register("mangrove_barred_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BEACH_TRAPDOOR = ITEMS.register("mangrove_beach_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_CLASSIC_TRAPDOOR = ITEMS.register("mangrove_classic_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_COTTAGE_TRAPDOOR = ITEMS.register("mangrove_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_FOUR_PANEL_TRAPDOOR = ITEMS.register("mangrove_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_GLASS_TRAPDOOR = ITEMS.register("mangrove_glass_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_PAPER_TRAPDOOR = ITEMS.register("mangrove_paper_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_TROPICAL_TRAPDOOR = ITEMS.register("mangrove_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_MYSTIC_TRAPDOOR = ITEMS.register("mangrove_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BAMBOO_TRAPDOOR = ITEMS.register("mangrove_bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_BAMBOO_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> OAK_BARK_TRAPDOOR = ITEMS.register("oak_bark_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BARK_TRAPDOOR = ITEMS.register("spruce_bark_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BARK_TRAPDOOR = ITEMS.register("birch_bark_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_BARK_TRAPDOOR = ITEMS.register("jungle_bark_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BARK_TRAPDOOR = ITEMS.register("acacia_bark_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BARK_TRAPDOOR = ITEMS.register("dark_oak_bark_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_BARK_TRAPDOOR = ITEMS.register("crimson_bark_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BARK_TRAPDOOR = ITEMS.register("warped_bark_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_BARK_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BARK_TRAPDOOR = ITEMS.register("mangrove_bark_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_BARK_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> BAMBOO_BARN_TRAPDOOR = ITEMS.register("bamboo_barn_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_BARN_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_BARRED_TRAPDOOR = ITEMS.register("bamboo_barred_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_BARRED_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_BEACH_TRAPDOOR = ITEMS.register("bamboo_beach_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_BEACH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_CLASSIC_TRAPDOOR = ITEMS.register("bamboo_classic_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_CLASSIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_COTTAGE_TRAPDOOR = ITEMS.register("bamboo_cottage_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_COTTAGE_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_FOUR_PANEL_TRAPDOOR = ITEMS.register("bamboo_four_panel_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_FOUR_PANEL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_GLASS_TRAPDOOR = ITEMS.register("bamboo_glass_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_GLASS_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_MYSTIC_TRAPDOOR = ITEMS.register("bamboo_mystic_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_MYSTIC_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_PAPER_TRAPDOOR = ITEMS.register("bamboo_paper_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_PAPER_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_TROPICAL_TRAPDOOR = ITEMS.register("bamboo_tropical_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_TROPICAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_SWAMP_TRAPDOOR = ITEMS.register("bamboo_swamp_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_SWAMP_TRAPDOOR.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> OAK_RANCH_TRAPDOOR = ITEMS.register("oak_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.OAK_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_RANCH_TRAPDOOR = ITEMS.register("spruce_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.SPRUCE_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_RANCH_TRAPDOOR = ITEMS.register("birch_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.BIRCH_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_RANCH_TRAPDOOR = ITEMS.register("jungle_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.JUNGLE_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_RANCH_TRAPDOOR = ITEMS.register("acacia_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.ACACIA_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_RANCH_TRAPDOOR = ITEMS.register("dark_oak_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.DARK_OAK_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_RANCH_TRAPDOOR = ITEMS.register("crimson_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.CRIMSON_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_RANCH_TRAPDOOR = ITEMS.register("warped_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.WARPED_RANCH_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_RANCH_TRAPDOOR = ITEMS.register("mangrove_ranch_trapdoor", () -> new FuelItemBlock(BlockInit.MANGROVE_RANCH_TRAPDOOR.get(), new Item.Properties()));

	public static final RegistryObject<Item> BAMBOO_TRAPDOOR = ITEMS.register("bamboo_trapdoor", () -> new FuelItemBlock(BlockInit.BAMBOO_TRAPDOOR.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> METAL_TRAPDOOR = ITEMS.register("metal_trapdoor", () -> new BlockItem(BlockInit.METAL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> METAL_WARNING_TRAPDOOR = ITEMS.register("metal_warning_trapdoor", () -> new BlockItem(BlockInit.METAL_WARNING_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> METAL_FULL_TRAPDOOR = ITEMS.register("metal_full_trapdoor", () -> new BlockItem(BlockInit.METAL_FULL_TRAPDOOR.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> PRINT_BLOSSOM = ITEMS.register("print_blossom", () -> new ToolTip(new Item.Properties()));
	
	public static final RegistryObject<Item> OAK_BLOSSOM_TRAPDOOR = ITEMS.register("oak_blossom_trapdoor", () -> new BlockItem(BlockInit.OAK_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BLOSSOM_TRAPDOOR = ITEMS.register("spruce_blossom_trapdoor", () -> new BlockItem(BlockInit.SPRUCE_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BLOSSOM_TRAPDOOR = ITEMS.register("birch_blossom_trapdoor", () -> new BlockItem(BlockInit.BIRCH_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_BLOSSOM_TRAPDOOR = ITEMS.register("jungle_blossom_trapdoor", () -> new BlockItem(BlockInit.JUNGLE_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BLOSSOM_TRAPDOOR = ITEMS.register("acacia_blossom_trapdoor", () -> new BlockItem(BlockInit.ACACIA_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BLOSSOM_TRAPDOOR = ITEMS.register("dark_oak_blossom_trapdoor", () -> new BlockItem(BlockInit.DARK_OAK_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BLOSSOM_TRAPDOOR = ITEMS.register("mangrove_blossom_trapdoor", () -> new BlockItem(BlockInit.MANGROVE_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BLOSSOM_TRAPDOOR = ITEMS.register("warped_blossom_trapdoor", () -> new BlockItem(BlockInit.WARPED_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_BLOSSOM_TRAPDOOR = ITEMS.register("crimson_blossom_trapdoor", () -> new BlockItem(BlockInit.CRIMSON_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_BLOSSOM_TRAPDOOR = ITEMS.register("bamboo_blossom_trapdoor", () -> new BlockItem(BlockInit.BAMBOO_BLOSSOM_TRAPDOOR.get(), new Item.Properties()));
	
	// 1.1.2
	
	public static final RegistryObject<Item> OAK_BARREL_TRAPDOOR = ITEMS.register("oak_barrel_trapdoor", () -> new BlockItem(BlockInit.OAK_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_BARREL_TRAPDOOR = ITEMS.register("spruce_barrel_trapdoor", () -> new BlockItem(BlockInit.SPRUCE_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_BARREL_TRAPDOOR = ITEMS.register("birch_barrel_trapdoor", () -> new BlockItem(BlockInit.BIRCH_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_BARREL_TRAPDOOR = ITEMS.register("jungle_barrel_trapdoor", () -> new BlockItem(BlockInit.JUNGLE_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_BARREL_TRAPDOOR = ITEMS.register("acacia_barrel_trapdoor", () -> new BlockItem(BlockInit.ACACIA_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_BARREL_TRAPDOOR = ITEMS.register("dark_oak_barrel_trapdoor", () -> new BlockItem(BlockInit.DARK_OAK_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_BARREL_TRAPDOOR = ITEMS.register("mangrove_barrel_trapdoor", () -> new BlockItem(BlockInit.MANGROVE_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_BARREL_TRAPDOOR = ITEMS.register("warped_barrel_trapdoor", () -> new BlockItem(BlockInit.WARPED_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_BARREL_TRAPDOOR = ITEMS.register("crimson_barrel_trapdoor", () -> new BlockItem(BlockInit.CRIMSON_BARREL_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_BARREL_TRAPDOOR = ITEMS.register("bamboo_barrel_trapdoor", () -> new BlockItem(BlockInit.BAMBOO_BARREL_TRAPDOOR.get(), new Item.Properties()));

}
	
