package net.kikoz.mcwtrpdoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kikoz.mcwtrpdoors.init.BlockInit;
import net.kikoz.mcwtrpdoors.init.ItemInit;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public class MacawsTrapdoors implements ModInitializer {

	public static final String MOD_ID = "mcwtrpdoors";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockInit.registerModBlocks();
		ItemInit.registerModItems();
		MacawsTrapdoors.registerAllItemsAsFuel();
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
