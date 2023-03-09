package net.kikoz.mcwtrpdoors;

import net.fabricmc.api.ModInitializer;
import net.kikoz.mcwtrpdoors.init.BlockInit;
import net.kikoz.mcwtrpdoors.init.ItemInit;
import net.kikoz.mcwtrpdoors.objects.TrapdoorGroup;
import net.kikoz.mcwtrpdoors.util.ClientEventBusSubscriber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacawsTrapdoors implements ModInitializer {

	public static final String MOD_ID = "mcwtrpdoors";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TrapdoorGroup.registerTabs();
		BlockInit.registerModBlocks();
		ItemInit.registerModItems();
	}
}
