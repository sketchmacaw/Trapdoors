package net.kikoz.mcwtrpdoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kikoz.mcwtrpdoors.init.BlockInit;
import net.kikoz.mcwtrpdoors.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public class MacawsTrapdoors implements ModInitializer {

	public static final String MOD_ID = "mcwtrpdoors";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);
	public static final RegistryKey<ItemGroup> TRAPDOORSGROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MacawsTrapdoors.MOD_ID, "mcwtrpdoors"));


	@Override
	public void onInitialize() {
		BlockInit.registerModBlocks();
		ItemInit.registerModItems();
		MacawsTrapdoors.registerAllItemsAsFuel();


		Registry.register(Registries.ITEM_GROUP, TRAPDOORSGROUP, FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mcwtrpdoors"))
				.icon(() -> new ItemStack(BlockInit.OAK_RANCH_TRAPDOOR)).entries((displayContext, entries) -> {
					entries.add(ItemInit.PRINT_CLASSIC);
					entries.add(ItemInit.PRINT_COTTAGE);
					entries.add(ItemInit.PRINT_PAPER);
					entries.add(ItemInit.PRINT_BEACH);
					entries.add(ItemInit.PRINT_TROPICAL);
					entries.add(ItemInit.PRINT_FOUR_PANEL);
					entries.add(ItemInit.PRINT_BARRED);
					entries.add(ItemInit.PRINT_MYSTIC);
					entries.add(ItemInit.PRINT_SWAMP);
					entries.add(ItemInit.PRINT_BAMBOO);
					entries.add(ItemInit.PRINT_BLOSSOM);
					entries.add(BlockInit.OAK_BARN_TRAPDOOR);
					entries.add(BlockInit.OAK_BARRED_TRAPDOOR);
					entries.add(BlockInit.OAK_BEACH_TRAPDOOR);
					entries.add(BlockInit.OAK_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.OAK_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.OAK_GLASS_TRAPDOOR);
					entries.add(BlockInit.OAK_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.OAK_PAPER_TRAPDOOR);
					entries.add(BlockInit.OAK_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.OAK_SWAMP_TRAPDOOR);
					entries.add(BlockInit.OAK_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.OAK_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BARN_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BARRED_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BEACH_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_GLASS_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_PAPER_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_SWAMP_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BARN_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BARRED_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BEACH_TRAPDOOR);
					entries.add(BlockInit.BIRCH_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.BIRCH_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.BIRCH_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.BIRCH_GLASS_TRAPDOOR);
					entries.add(BlockInit.BIRCH_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.BIRCH_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.BIRCH_SWAMP_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_BARN_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_BARRED_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_GLASS_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_PAPER_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_SWAMP_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BARN_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BARRED_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BEACH_TRAPDOOR);
					entries.add(BlockInit.ACACIA_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.ACACIA_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.ACACIA_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.ACACIA_GLASS_TRAPDOOR);
					entries.add(BlockInit.ACACIA_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.ACACIA_PAPER_TRAPDOOR);
					entries.add(BlockInit.ACACIA_SWAMP_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BARN_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BARRED_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BEACH_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_GLASS_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_PAPER_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_SWAMP_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_BARN_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_BEACH_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_GLASS_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_PAPER_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_SWAMP_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.WARPED_BARN_TRAPDOOR);
					entries.add(BlockInit.WARPED_BARRED_TRAPDOOR);
					entries.add(BlockInit.WARPED_BEACH_TRAPDOOR);
					entries.add(BlockInit.WARPED_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.WARPED_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.WARPED_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.WARPED_GLASS_TRAPDOOR);
					entries.add(BlockInit.WARPED_PAPER_TRAPDOOR);
					entries.add(BlockInit.WARPED_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.WARPED_SWAMP_TRAPDOOR);
					entries.add(BlockInit.WARPED_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.WARPED_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BARN_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BARRED_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BEACH_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_GLASS_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_PAPER_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.OAK_BARK_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BARK_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BARK_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_BARK_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BARK_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BARK_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_BARK_TRAPDOOR);
					entries.add(BlockInit.WARPED_BARK_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BARK_TRAPDOOR);
					entries.add(BlockInit.CHERRY_BARK_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_BARN_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_BARRED_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_BEACH_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_GLASS_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_PAPER_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_SWAMP_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_BLOSSOM_TRAPDOOR);
					entries.add(BlockInit.CHERRY_BARN_TRAPDOOR);
					entries.add(BlockInit.CHERRY_BARRED_TRAPDOOR);
					entries.add(BlockInit.CHERRY_BEACH_TRAPDOOR);
					entries.add(BlockInit.CHERRY_CLASSIC_TRAPDOOR);
					entries.add(BlockInit.CHERRY_COTTAGE_TRAPDOOR);
					entries.add(BlockInit.CHERRY_FOUR_PANEL_TRAPDOOR);
					entries.add(BlockInit.CHERRY_GLASS_TRAPDOOR);
					entries.add(BlockInit.CHERRY_PAPER_TRAPDOOR);
					entries.add(BlockInit.CHERRY_TROPICAL_TRAPDOOR);
					entries.add(BlockInit.CHERRY_MYSTIC_TRAPDOOR);
					entries.add(BlockInit.CHERRY_BAMBOO_TRAPDOOR);
					entries.add(BlockInit.CHERRY_SWAMP_TRAPDOOR);
					entries.add(BlockInit.OAK_RANCH_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_RANCH_TRAPDOOR);
					entries.add(BlockInit.BIRCH_RANCH_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_RANCH_TRAPDOOR);
					entries.add(BlockInit.ACACIA_RANCH_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_RANCH_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_RANCH_TRAPDOOR);
					entries.add(BlockInit.WARPED_RANCH_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_RANCH_TRAPDOOR);
					entries.add(BlockInit.CHERRY_RANCH_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_TRAPDOOR);
					entries.add(BlockInit.METAL_TRAPDOOR);
					entries.add(BlockInit.METAL_WARNING_TRAPDOOR);
					entries.add(BlockInit.METAL_FULL_TRAPDOOR);
					entries.add(BlockInit.OAK_BARREL_TRAPDOOR);
					entries.add(BlockInit.SPRUCE_BARREL_TRAPDOOR);
					entries.add(BlockInit.BIRCH_BARREL_TRAPDOOR);
					entries.add(BlockInit.JUNGLE_BARREL_TRAPDOOR);
					entries.add(BlockInit.ACACIA_BARREL_TRAPDOOR);
					entries.add(BlockInit.DARK_OAK_BARREL_TRAPDOOR);
					entries.add(BlockInit.CRIMSON_BARREL_TRAPDOOR);
					entries.add(BlockInit.WARPED_BARREL_TRAPDOOR);
					entries.add(BlockInit.MANGROVE_BARREL_TRAPDOOR);
					entries.add(BlockInit.CHERRY_BARREL_TRAPDOOR);
					entries.add(BlockInit.BAMBOO_BARREL_TRAPDOOR);
				}).build());
	}

	public static void registerAllItemsAsFuel() {
		for (Field field : ItemInit.class.getFields()) {
			try {
				Item item = (Item) field.get(null);
				FuelRegistry.INSTANCE.add(item, 300);
			} catch (IllegalAccessException e) {
				System.out.println("Failed to register item " + field.getName() + " as fuel.");
			}
		}
	}



}
