package net.kikoz.mcwtrpdoors.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kikoz.mcwtrpdoors.MacawsTrapdoors;
import net.kikoz.mcwtrpdoors.objects.Trapdoor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockInit {

    public static final Block OAK_BARN_TRAPDOOR = registerBlock("oak_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8f).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_BARRED_TRAPDOOR = registerBlock("oak_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_BEACH_TRAPDOOR = registerBlock("oak_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_COTTAGE_TRAPDOOR = registerBlock("oak_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_FOUR_PANEL_TRAPDOOR = registerBlock("oak_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_GLASS_TRAPDOOR = registerBlock("oak_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_MYSTIC_TRAPDOOR = registerBlock("oak_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_PAPER_TRAPDOOR = registerBlock("oak_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_TROPICAL_TRAPDOOR = registerBlock("oak_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_SWAMP_TRAPDOOR = registerBlock("oak_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block OAK_BAMBOO_TRAPDOOR = registerBlock("oak_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));

    public static final Block SPRUCE_BARN_TRAPDOOR = registerBlock("spruce_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_BARRED_TRAPDOOR = registerBlock("spruce_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_BEACH_TRAPDOOR = registerBlock("spruce_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_CLASSIC_TRAPDOOR = registerBlock("spruce_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_FOUR_PANEL_TRAPDOOR = registerBlock("spruce_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_GLASS_TRAPDOOR = registerBlock("spruce_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_MYSTIC_TRAPDOOR = registerBlock("spruce_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_PAPER_TRAPDOOR = registerBlock("spruce_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_TROPICAL_TRAPDOOR = registerBlock("spruce_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_SWAMP_TRAPDOOR = registerBlock("spruce_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_BAMBOO_TRAPDOOR = registerBlock("spruce_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));

    public static final Block BIRCH_BARN_TRAPDOOR = registerBlock("birch_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_BARRED_TRAPDOOR = registerBlock("birch_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_BEACH_TRAPDOOR = registerBlock("birch_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_CLASSIC_TRAPDOOR = registerBlock("birch_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_COTTAGE_TRAPDOOR = registerBlock("birch_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_FOUR_PANEL_TRAPDOOR = registerBlock("birch_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_GLASS_TRAPDOOR = registerBlock("birch_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_MYSTIC_TRAPDOOR = registerBlock("birch_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_TROPICAL_TRAPDOOR = registerBlock("birch_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_SWAMP_TRAPDOOR = registerBlock("birch_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block BIRCH_BAMBOO_TRAPDOOR = registerBlock("birch_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));

    public static final Block JUNGLE_BARN_TRAPDOOR = registerBlock("jungle_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_BARRED_TRAPDOOR = registerBlock("jungle_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_CLASSIC_TRAPDOOR = registerBlock("jungle_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_COTTAGE_TRAPDOOR = registerBlock("jungle_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_FOUR_PANEL_TRAPDOOR = registerBlock("jungle_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_GLASS_TRAPDOOR = registerBlock("jungle_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_MYSTIC_TRAPDOOR = registerBlock("jungle_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_PAPER_TRAPDOOR = registerBlock("jungle_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_TROPICAL_TRAPDOOR = registerBlock("jungle_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_SWAMP_TRAPDOOR = registerBlock("jungle_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_BAMBOO_TRAPDOOR = registerBlock("jungle_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));

    public static final Block ACACIA_BARN_TRAPDOOR = registerBlock("acacia_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_BARRED_TRAPDOOR = registerBlock("acacia_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_BEACH_TRAPDOOR = registerBlock("acacia_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_CLASSIC_TRAPDOOR = registerBlock("acacia_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_COTTAGE_TRAPDOOR = registerBlock("acacia_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_FOUR_PANEL_TRAPDOOR = registerBlock("acacia_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_GLASS_TRAPDOOR = registerBlock("acacia_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_MYSTIC_TRAPDOOR = registerBlock("acacia_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_PAPER_TRAPDOOR = registerBlock("acacia_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_SWAMP_TRAPDOOR = registerBlock("acacia_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block ACACIA_BAMBOO_TRAPDOOR = registerBlock("acacia_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));

    public static final Block DARK_OAK_BARN_TRAPDOOR = registerBlock("dark_oak_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_BARRED_TRAPDOOR = registerBlock("dark_oak_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_BEACH_TRAPDOOR = registerBlock("dark_oak_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_CLASSIC_TRAPDOOR = registerBlock("dark_oak_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_COTTAGE_TRAPDOOR = registerBlock("dark_oak_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_GLASS_TRAPDOOR = registerBlock("dark_oak_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_MYSTIC_TRAPDOOR = registerBlock("dark_oak_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_PAPER_TRAPDOOR = registerBlock("dark_oak_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_TROPICAL_TRAPDOOR = registerBlock("dark_oak_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_SWAMP_TRAPDOOR = registerBlock("dark_oak_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_BAMBOO_TRAPDOOR = registerBlock("dark_oak_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));

    public static final Block CRIMSON_BARN_TRAPDOOR = registerBlock("crimson_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_BEACH_TRAPDOOR = registerBlock("crimson_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_CLASSIC_TRAPDOOR = registerBlock("crimson_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_COTTAGE_TRAPDOOR = registerBlock("crimson_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_FOUR_PANEL_TRAPDOOR = registerBlock("crimson_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_GLASS_TRAPDOOR = registerBlock("crimson_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_MYSTIC_TRAPDOOR = registerBlock("crimson_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_PAPER_TRAPDOOR = registerBlock("crimson_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_TROPICAL_TRAPDOOR = registerBlock("crimson_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_SWAMP_TRAPDOOR = registerBlock("crimson_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_BAMBOO_TRAPDOOR = registerBlock("crimson_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));

    public static final Block WARPED_BARN_TRAPDOOR = registerBlock("warped_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_BARRED_TRAPDOOR = registerBlock("warped_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_BEACH_TRAPDOOR = registerBlock("warped_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_CLASSIC_TRAPDOOR = registerBlock("warped_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_COTTAGE_TRAPDOOR = registerBlock("warped_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_FOUR_PANEL_TRAPDOOR = registerBlock("warped_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_GLASS_TRAPDOOR = registerBlock("warped_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_PAPER_TRAPDOOR = registerBlock("warped_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_TROPICAL_TRAPDOOR = registerBlock("warped_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_SWAMP_TRAPDOOR = registerBlock("warped_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block WARPED_BAMBOO_TRAPDOOR = registerBlock("warped_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));

    public static final Block MANGROVE_BARN_TRAPDOOR = registerBlock("mangrove_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8f).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_BARRED_TRAPDOOR = registerBlock("mangrove_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_BEACH_TRAPDOOR = registerBlock("mangrove_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_COTTAGE_TRAPDOOR = registerBlock("mangrove_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_FOUR_PANEL_TRAPDOOR = registerBlock("mangrove_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_GLASS_TRAPDOOR = registerBlock("mangrove_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_MYSTIC_TRAPDOOR = registerBlock("mangrove_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_PAPER_TRAPDOOR = registerBlock("mangrove_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_TROPICAL_TRAPDOOR = registerBlock("mangrove_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_CLASSIC_TRAPDOOR = registerBlock("mangrove_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_BAMBOO_TRAPDOOR = registerBlock("mangrove_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));

    public static final Block BAMBOO_BARN_TRAPDOOR = registerBlock("bamboo_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8f).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_BARRED_TRAPDOOR = registerBlock("bamboo_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_BEACH_TRAPDOOR = registerBlock("bamboo_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_COTTAGE_TRAPDOOR = registerBlock("bamboo_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_FOUR_PANEL_TRAPDOOR = registerBlock("bamboo_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_GLASS_TRAPDOOR = registerBlock("bamboo_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_MYSTIC_TRAPDOOR = registerBlock("bamboo_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_PAPER_TRAPDOOR = registerBlock("bamboo_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_TROPICAL_TRAPDOOR = registerBlock("bamboo_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_CLASSIC_TRAPDOOR = registerBlock("bamboo_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block BAMBOO_SWAMP_TRAPDOOR = registerBlock("bamboo_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));

    public static final Block OAK_BARK_TRAPDOOR = registerBlock("oak_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block SPRUCE_BARK_TRAPDOOR = registerBlock("spruce_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block BIRCH_BARK_TRAPDOOR = registerBlock("birch_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block JUNGLE_BARK_TRAPDOOR = registerBlock("jungle_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block ACACIA_BARK_TRAPDOOR = registerBlock("acacia_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block DARK_OAK_BARK_TRAPDOOR = registerBlock("dark_oak_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block CRIMSON_BARK_TRAPDOOR = registerBlock("crimson_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block WARPED_BARK_TRAPDOOR = registerBlock("warped_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block MANGROVE_BARK_TRAPDOOR = registerBlock("mangrove_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));

    public static final Block OAK_RANCH_TRAPDOOR = registerBlock("oak_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block SPRUCE_RANCH_TRAPDOOR = registerBlock("spruce_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block BIRCH_RANCH_TRAPDOOR = registerBlock("birch_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block JUNGLE_RANCH_TRAPDOOR = registerBlock("jungle_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block ACACIA_RANCH_TRAPDOOR = registerBlock("acacia_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block DARK_OAK_RANCH_TRAPDOOR = registerBlock("dark_oak_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block CRIMSON_RANCH_TRAPDOOR = registerBlock("crimson_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block WARPED_RANCH_TRAPDOOR = registerBlock("warped_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block MANGROVE_RANCH_TRAPDOOR = registerBlock("mangrove_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));

    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));

    public static final Block METAL_TRAPDOOR = registerBlock("metal_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).strength(1.0F, 3.0F).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque(), BlockSetType.IRON));
    public static final Block METAL_FULL_TRAPDOOR = registerBlock("metal_full_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).strength(1.0F, 3.0F).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque(), BlockSetType.IRON));
    public static final Block METAL_WARNING_TRAPDOOR = registerBlock("metal_warning_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).strength(1.0F, 3.0F).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque(), BlockSetType.IRON));
    
    public static final Block OAK_BLOSSOM_TRAPDOOR = registerBlock("oak_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.OAK));
    public static final Block SPRUCE_BLOSSOM_TRAPDOOR = registerBlock("spruce_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block BIRCH_BLOSSOM_TRAPDOOR = registerBlock("birch_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BIRCH));
    public static final Block JUNGLE_BLOSSOM_TRAPDOOR = registerBlock("jungle_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block ACACIA_BLOSSOM_TRAPDOOR = registerBlock("acacia_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.ACACIA));
    public static final Block DARK_OAK_BLOSSOM_TRAPDOOR = registerBlock("dark_oak_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block WARPED_BLOSSOM_TRAPDOOR = registerBlock("warped_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_BLOSSOM_TRAPDOOR = registerBlock("crimson_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.WARPED));
    public static final Block BAMBOO_BLOSSOM_TRAPDOOR = registerBlock("bamboo_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block MANGROVE_BLOSSOM_TRAPDOOR = registerBlock("mangrove_blossom_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque(), BlockSetType.MANGROVE));

    public static final Block CHERRY_BARN_TRAPDOOR = registerBlock("cherry_barn_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_BARRED_TRAPDOOR = registerBlock("cherry_barred_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_BEACH_TRAPDOOR = registerBlock("cherry_beach_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_CLASSIC_TRAPDOOR = registerBlock("cherry_classic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_COTTAGE_TRAPDOOR = registerBlock("cherry_cottage_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_FOUR_PANEL_TRAPDOOR = registerBlock("cherry_four_panel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_GLASS_TRAPDOOR = registerBlock("cherry_glass_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_PAPER_TRAPDOOR = registerBlock("cherry_paper_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_TROPICAL_TRAPDOOR = registerBlock("cherry_tropical_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_MYSTIC_TRAPDOOR = registerBlock("cherry_mystic_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_BAMBOO_TRAPDOOR = registerBlock("cherry_bamboo_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_SWAMP_TRAPDOOR = registerBlock("cherry_swamp_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(),BlockSetType.CHERRY));
    public static final Block CHERRY_RANCH_TRAPDOOR = registerBlock("cherry_ranch_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));
    public static final Block CHERRY_BARK_TRAPDOOR = registerBlock("cherry_bark_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CHERRY));

    //1.1.2
    public static final Block OAK_BARREL_TRAPDOOR = registerBlock("oak_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK));
    public static final Block SPRUCE_BARREL_TRAPDOOR = registerBlock("spruce_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.SPRUCE));
    public static final Block BIRCH_BARREL_TRAPDOOR = registerBlock("birch_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.BIRCH));
    public static final Block JUNGLE_BARREL_TRAPDOOR = registerBlock("jungle_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block ACACIA_BARREL_TRAPDOOR = registerBlock("acacia_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.ACACIA));
    public static final Block DARK_OAK_BARREL_TRAPDOOR = registerBlock("dark_oak_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.DARK_OAK));
    public static final Block MANGROVE_BARREL_TRAPDOOR = registerBlock("mangrove_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.MANGROVE));
    public static final Block WARPED_BARREL_TRAPDOOR = registerBlock("warped_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.WARPED));
    public static final Block CRIMSON_BARREL_TRAPDOOR = registerBlock("crimson_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.CRIMSON));
    public static final Block BAMBOO_BARREL_TRAPDOOR = registerBlock("bamboo_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.BAMBOO));
    public static final Block CHERRY_BARREL_TRAPDOOR = registerBlock("cherry_barrel_trapdoor", new Trapdoor(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.5F, 2.5F).sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque(), BlockSetType.CHERRY));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MacawsTrapdoors.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MacawsTrapdoors.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
    }
}
