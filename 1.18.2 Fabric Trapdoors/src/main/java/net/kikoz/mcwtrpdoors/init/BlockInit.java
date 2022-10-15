package net.kikoz.mcwtrpdoors.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kikoz.mcwtrpdoors.MacawsTrapdoors;
import net.kikoz.mcwtrpdoors.objects.Trapdoor;
import net.kikoz.mcwtrpdoors.objects.TrapdoorGroup;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockInit {

    public static final Block OAK_BARN_TRAPDOOR = registerBlock("oak_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_BARRED_TRAPDOOR = registerBlock("oak_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_BEACH_TRAPDOOR = registerBlock("oak_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_COTTAGE_TRAPDOOR = registerBlock("oak_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_FOUR_PANEL_TRAPDOOR = registerBlock("oak_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_GLASS_TRAPDOOR = registerBlock("oak_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_MYSTIC_TRAPDOOR = registerBlock("oak_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_PAPER_TRAPDOOR = registerBlock("oak_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_TROPICAL_TRAPDOOR = registerBlock("oak_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block OAK_SWAMP_TRAPDOOR = registerBlock("oak_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block SPRUCE_BARN_TRAPDOOR = registerBlock("spruce_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_BARRED_TRAPDOOR = registerBlock("spruce_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_BEACH_TRAPDOOR = registerBlock("spruce_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_CLASSIC_TRAPDOOR = registerBlock("spruce_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_FOUR_PANEL_TRAPDOOR = registerBlock("spruce_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_GLASS_TRAPDOOR = registerBlock("spruce_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_MYSTIC_TRAPDOOR = registerBlock("spruce_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_PAPER_TRAPDOOR = registerBlock("spruce_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_TROPICAL_TRAPDOOR = registerBlock("spruce_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_SWAMP_TRAPDOOR = registerBlock("spruce_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block BIRCH_BARN_TRAPDOOR = registerBlock("birch_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_BARRED_TRAPDOOR = registerBlock("birch_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_BEACH_TRAPDOOR = registerBlock("birch_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_CLASSIC_TRAPDOOR = registerBlock("birch_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_COTTAGE_TRAPDOOR = registerBlock("birch_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_FOUR_PANEL_TRAPDOOR = registerBlock("birch_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_GLASS_TRAPDOOR = registerBlock("birch_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_MYSTIC_TRAPDOOR = registerBlock("birch_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_TROPICAL_TRAPDOOR = registerBlock("birch_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_SWAMP_TRAPDOOR = registerBlock("birch_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block JUNGLE_BARN_TRAPDOOR = registerBlock("jungle_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_BARRED_TRAPDOOR = registerBlock("jungle_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_CLASSIC_TRAPDOOR = registerBlock("jungle_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_COTTAGE_TRAPDOOR = registerBlock("jungle_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_FOUR_PANEL_TRAPDOOR = registerBlock("jungle_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_GLASS_TRAPDOOR = registerBlock("jungle_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_MYSTIC_TRAPDOOR = registerBlock("jungle_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_PAPER_TRAPDOOR = registerBlock("jungle_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_TROPICAL_TRAPDOOR = registerBlock("jungle_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_SWAMP_TRAPDOOR = registerBlock("jungle_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block ACACIA_BARN_TRAPDOOR = registerBlock("acacia_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_BARRED_TRAPDOOR = registerBlock("acacia_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_BEACH_TRAPDOOR = registerBlock("acacia_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_CLASSIC_TRAPDOOR = registerBlock("acacia_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_COTTAGE_TRAPDOOR = registerBlock("acacia_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_FOUR_PANEL_TRAPDOOR = registerBlock("acacia_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_GLASS_TRAPDOOR = registerBlock("acacia_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_MYSTIC_TRAPDOOR = registerBlock("acacia_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_PAPER_TRAPDOOR = registerBlock("acacia_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_SWAMP_TRAPDOOR = registerBlock("acacia_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block DARK_OAK_BARN_TRAPDOOR = registerBlock("dark_oak_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_BARRED_TRAPDOOR = registerBlock("dark_oak_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_BEACH_TRAPDOOR = registerBlock("dark_oak_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_CLASSIC_TRAPDOOR = registerBlock("dark_oak_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_COTTAGE_TRAPDOOR = registerBlock("dark_oak_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_GLASS_TRAPDOOR = registerBlock("dark_oak_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_MYSTIC_TRAPDOOR = registerBlock("dark_oak_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_PAPER_TRAPDOOR = registerBlock("dark_oak_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_TROPICAL_TRAPDOOR = registerBlock("dark_oak_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_SWAMP_TRAPDOOR = registerBlock("dark_oak_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block CRIMSON_BARN_TRAPDOOR = registerBlock("crimson_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_BEACH_TRAPDOOR = registerBlock("crimson_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_CLASSIC_TRAPDOOR = registerBlock("crimson_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_COTTAGE_TRAPDOOR = registerBlock("crimson_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_FOUR_PANEL_TRAPDOOR = registerBlock("crimson_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_GLASS_TRAPDOOR = registerBlock("crimson_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_MYSTIC_TRAPDOOR = registerBlock("crimson_mystic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_PAPER_TRAPDOOR = registerBlock("crimson_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_TROPICAL_TRAPDOOR = registerBlock("crimson_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_SWAMP_TRAPDOOR = registerBlock("crimson_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block WARPED_BARN_TRAPDOOR = registerBlock("warped_barn_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_BARRED_TRAPDOOR = registerBlock("warped_barred_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_BEACH_TRAPDOOR = registerBlock("warped_beach_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_CLASSIC_TRAPDOOR = registerBlock("warped_classic_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_COTTAGE_TRAPDOOR = registerBlock("warped_cottage_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_FOUR_PANEL_TRAPDOOR = registerBlock("warped_four_panel_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_GLASS_TRAPDOOR = registerBlock("warped_glass_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_PAPER_TRAPDOOR = registerBlock("warped_paper_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_TROPICAL_TRAPDOOR = registerBlock("warped_tropical_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_SWAMP_TRAPDOOR = registerBlock("warped_swamp_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block OAK_BARK_TRAPDOOR = registerBlock("oak_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_BARK_TRAPDOOR = registerBlock("spruce_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_BARK_TRAPDOOR = registerBlock("birch_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_BARK_TRAPDOOR = registerBlock("jungle_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_BARK_TRAPDOOR = registerBlock("acacia_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_BARK_TRAPDOOR = registerBlock("dark_oak_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_BARK_TRAPDOOR = registerBlock("crimson_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_BARK_TRAPDOOR = registerBlock("warped_bark_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block OAK_RANCH_TRAPDOOR = registerBlock("oak_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block SPRUCE_RANCH_TRAPDOOR = registerBlock("spruce_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block BIRCH_RANCH_TRAPDOOR = registerBlock("birch_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block JUNGLE_RANCH_TRAPDOOR = registerBlock("jungle_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block ACACIA_RANCH_TRAPDOOR = registerBlock("acacia_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block DARK_OAK_RANCH_TRAPDOOR = registerBlock("dark_oak_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block CRIMSON_RANCH_TRAPDOOR = registerBlock("crimson_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block WARPED_RANCH_TRAPDOOR = registerBlock("warped_ranch_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.WOOD, MapColor.EMERALD_GREEN).sounds(BlockSoundGroup.WOOD).strength(1.8F).nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);

    public static final Block METAL_TRAPDOOR = registerBlock("metal_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.METAL).strength(1.0F, 3.0F).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block METAL_WARNING_TRAPDOOR = registerBlock("metal_warning_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.METAL).strength(1.0F, 3.0F).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);
    public static final Block METAL_FULL_TRAPDOOR = registerBlock("metal_full_trapdoor", new Trapdoor(FabricBlockSettings.of(Material.METAL).strength(1.0F, 3.0F).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque()), TrapdoorGroup.TRAPDOORSGROUP);


    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MacawsTrapdoors.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(MacawsTrapdoors.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MacawsTrapdoors.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MacawsTrapdoors.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MacawsTrapdoors.LOGGER.info("Registering ModBlocks for " + MacawsTrapdoors.MOD_ID);
    }
}
