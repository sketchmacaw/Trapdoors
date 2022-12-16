package com.mcwtrpdoors.kikoz.init;

import com.mcwtrpdoors.kikoz.MacawsTrapdoors;
import com.mcwtrpdoors.kikoz.util.ToolTip;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsTrapdoors.MOD_ID);

	
	public static final RegistryObject<Item> PRINT_CLASSIC = ITEMS.register("print_classic", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_COTTAGE = ITEMS.register("print_cottage", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_PAPER = ITEMS.register("print_paper", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_BEACH = ITEMS.register("print_beach", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_TROPICAL = ITEMS.register("print_tropical", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_FOUR_PANEL = ITEMS.register("print_four_panel", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_BARRED = ITEMS.register("print_barred", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_MYSTIC = ITEMS.register("print_mystic", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_SWAMP = ITEMS.register("print_swamp", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));
	public static final RegistryObject<Item> PRINT_BAMBOO = ITEMS.register("print_bamboo", () -> new ToolTip(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup)));

	
}