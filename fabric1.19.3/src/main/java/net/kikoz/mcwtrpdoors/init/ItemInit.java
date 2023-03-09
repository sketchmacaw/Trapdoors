package net.kikoz.mcwtrpdoors.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kikoz.mcwtrpdoors.MacawsTrapdoors;
import net.kikoz.mcwtrpdoors.objects.TrapdoorGroup;
import net.kikoz.mcwtrpdoors.util.ToolTip;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {

    public static final Item PRINT_CLASSIC = registerItem("print_classic", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_COTTAGE = registerItem("print_cottage", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_PAPER = registerItem("print_paper", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_BEACH = registerItem("print_beach", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_TROPICAL = registerItem("print_tropical", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_FOUR_PANEL = registerItem("print_four_panel", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_BARRED = registerItem("print_barred", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_MYSTIC = registerItem("print_mystic", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_SWAMP = registerItem("print_swamp", new ToolTip(new FabricItemSettings()));
    public static final Item PRINT_BAMBOO = registerItem("print_bamboo", new ToolTip(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MacawsTrapdoors.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_CLASSIC);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_COTTAGE);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_PAPER);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_BEACH);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_TROPICAL);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_FOUR_PANEL);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_BARRED);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_MYSTIC);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_SWAMP);
        addToItemGroup(TrapdoorGroup.TRAPDOORSGROUP, PRINT_BAMBOO);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        addItemsToItemGroup();
    }



}

