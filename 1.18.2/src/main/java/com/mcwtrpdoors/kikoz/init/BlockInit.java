package com.mcwtrpdoors.kikoz.init;

import com.mcwtrpdoors.kikoz.MacawsTrapdoors;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsTrapdoors.MOD_ID);

	public static final RegistryObject<Block> OAK_BARN_TRAPDOOR = BLOCKS.register("oak_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_BARRED_TRAPDOOR = BLOCKS.register("oak_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_BEACH_TRAPDOOR = BLOCKS.register("oak_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_COTTAGE_TRAPDOOR = BLOCKS.register("oak_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_FOUR_PANEL_TRAPDOOR = BLOCKS.register("oak_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_GLASS_TRAPDOOR = BLOCKS.register("oak_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_MYSTIC_TRAPDOOR = BLOCKS.register("oak_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_PAPER_TRAPDOOR = BLOCKS.register("oak_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_TROPICAL_TRAPDOOR = BLOCKS.register("oak_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_SWAMP_TRAPDOOR = BLOCKS.register("oak_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> OAK_BAMBOO_TRAPDOOR = BLOCKS.register("oak_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));

	public static final RegistryObject<Block> SPRUCE_BARN_TRAPDOOR = BLOCKS.register("spruce_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_BARRED_TRAPDOOR = BLOCKS.register("spruce_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_BEACH_TRAPDOOR = BLOCKS.register("spruce_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_CLASSIC_TRAPDOOR = BLOCKS.register("spruce_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_FOUR_PANEL_TRAPDOOR = BLOCKS.register("spruce_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_GLASS_TRAPDOOR = BLOCKS.register("spruce_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_MYSTIC_TRAPDOOR = BLOCKS.register("spruce_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_PAPER_TRAPDOOR = BLOCKS.register("spruce_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_TROPICAL_TRAPDOOR = BLOCKS.register("spruce_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_SWAMP_TRAPDOOR = BLOCKS.register("spruce_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_BAMBOO_TRAPDOOR = BLOCKS.register("spruce_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));

	public static final RegistryObject<Block> BIRCH_BARN_TRAPDOOR = BLOCKS.register("birch_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_BARRED_TRAPDOOR = BLOCKS.register("birch_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_BEACH_TRAPDOOR = BLOCKS.register("birch_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_CLASSIC_TRAPDOOR = BLOCKS.register("birch_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_COTTAGE_TRAPDOOR = BLOCKS.register("birch_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_FOUR_PANEL_TRAPDOOR = BLOCKS.register("birch_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_GLASS_TRAPDOOR = BLOCKS.register("birch_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_MYSTIC_TRAPDOOR = BLOCKS.register("birch_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_TROPICAL_TRAPDOOR = BLOCKS.register("birch_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_SWAMP_TRAPDOOR = BLOCKS.register("birch_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_BAMBOO_TRAPDOOR = BLOCKS.register("birch_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));

	public static final RegistryObject<Block> JUNGLE_BARN_TRAPDOOR = BLOCKS.register("jungle_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_BARRED_TRAPDOOR = BLOCKS.register("jungle_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_CLASSIC_TRAPDOOR = BLOCKS.register("jungle_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_COTTAGE_TRAPDOOR = BLOCKS.register("jungle_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_FOUR_PANEL_TRAPDOOR = BLOCKS.register("jungle_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_GLASS_TRAPDOOR = BLOCKS.register("jungle_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_MYSTIC_TRAPDOOR = BLOCKS.register("jungle_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_PAPER_TRAPDOOR = BLOCKS.register("jungle_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_TROPICAL_TRAPDOOR = BLOCKS.register("jungle_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_SWAMP_TRAPDOOR = BLOCKS.register("jungle_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_BAMBOO_TRAPDOOR = BLOCKS.register("jungle_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	
	public static final RegistryObject<Block> ACACIA_BARN_TRAPDOOR = BLOCKS.register("acacia_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_BARRED_TRAPDOOR = BLOCKS.register("acacia_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_BEACH_TRAPDOOR = BLOCKS.register("acacia_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_CLASSIC_TRAPDOOR = BLOCKS.register("acacia_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_COTTAGE_TRAPDOOR = BLOCKS.register("acacia_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_FOUR_PANEL_TRAPDOOR = BLOCKS.register("acacia_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_GLASS_TRAPDOOR = BLOCKS.register("acacia_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_MYSTIC_TRAPDOOR = BLOCKS.register("acacia_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_PAPER_TRAPDOOR = BLOCKS.register("acacia_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_SWAMP_TRAPDOOR = BLOCKS.register("acacia_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_BAMBOO_TRAPDOOR = BLOCKS.register("acacia_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	
	public static final RegistryObject<Block> DARK_OAK_BARN_TRAPDOOR = BLOCKS.register("dark_oak_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_BARRED_TRAPDOOR = BLOCKS.register("dark_oak_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_BEACH_TRAPDOOR = BLOCKS.register("dark_oak_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_CLASSIC_TRAPDOOR = BLOCKS.register("dark_oak_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_COTTAGE_TRAPDOOR = BLOCKS.register("dark_oak_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_GLASS_TRAPDOOR = BLOCKS.register("dark_oak_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_MYSTIC_TRAPDOOR = BLOCKS.register("dark_oak_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_PAPER_TRAPDOOR = BLOCKS.register("dark_oak_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_TROPICAL_TRAPDOOR = BLOCKS.register("dark_oak_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_SWAMP_TRAPDOOR = BLOCKS.register("dark_oak_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_BAMBOO_TRAPDOOR = BLOCKS.register("dark_oak_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));

	public static final RegistryObject<Block> CRIMSON_BARN_TRAPDOOR = BLOCKS.register("crimson_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_BEACH_TRAPDOOR = BLOCKS.register("crimson_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_CLASSIC_TRAPDOOR = BLOCKS.register("crimson_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_COTTAGE_TRAPDOOR = BLOCKS.register("crimson_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_FOUR_PANEL_TRAPDOOR = BLOCKS.register("crimson_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_GLASS_TRAPDOOR = BLOCKS.register("crimson_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_MYSTIC_TRAPDOOR = BLOCKS.register("crimson_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_PAPER_TRAPDOOR = BLOCKS.register("crimson_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_TROPICAL_TRAPDOOR = BLOCKS.register("crimson_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_SWAMP_TRAPDOOR = BLOCKS.register("crimson_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_BAMBOO_TRAPDOOR = BLOCKS.register("crimson_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));

	public static final RegistryObject<Block> WARPED_BARN_TRAPDOOR = BLOCKS.register("warped_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_BARRED_TRAPDOOR = BLOCKS.register("warped_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_BEACH_TRAPDOOR = BLOCKS.register("warped_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_CLASSIC_TRAPDOOR = BLOCKS.register("warped_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_COTTAGE_TRAPDOOR = BLOCKS.register("warped_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_FOUR_PANEL_TRAPDOOR = BLOCKS.register("warped_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_GLASS_TRAPDOOR = BLOCKS.register("warped_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_PAPER_TRAPDOOR = BLOCKS.register("warped_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_TROPICAL_TRAPDOOR = BLOCKS.register("warped_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_SWAMP_TRAPDOOR = BLOCKS.register("warped_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_BAMBOO_TRAPDOOR = BLOCKS.register("warped_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	
	public static final RegistryObject<Block> BAMBOO_BARN_TRAPDOOR = BLOCKS.register("bamboo_barn_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_BARRED_TRAPDOOR = BLOCKS.register("bamboo_barred_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_BEACH_TRAPDOOR = BLOCKS.register("bamboo_beach_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_CLASSIC_TRAPDOOR = BLOCKS.register("bamboo_classic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_COTTAGE_TRAPDOOR = BLOCKS.register("bamboo_cottage_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_FOUR_PANEL_TRAPDOOR = BLOCKS.register("bamboo_four_panel_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_GLASS_TRAPDOOR = BLOCKS.register("bamboo_glass_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_MYSTIC_TRAPDOOR = BLOCKS.register("bamboo_mystic_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_PAPER_TRAPDOOR = BLOCKS.register("bamboo_paper_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_TROPICAL_TRAPDOOR = BLOCKS.register("bamboo_tropical_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_SWAMP_TRAPDOOR = BLOCKS.register("bamboo_swamp_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	
	public static final RegistryObject<Block> OAK_BARK_TRAPDOOR = BLOCKS.register("oak_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_BARK_TRAPDOOR = BLOCKS.register("spruce_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_BARK_TRAPDOOR = BLOCKS.register("birch_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_BARK_TRAPDOOR = BLOCKS.register("jungle_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_BARK_TRAPDOOR = BLOCKS.register("acacia_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_BARK_TRAPDOOR = BLOCKS.register("dark_oak_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_BARK_TRAPDOOR = BLOCKS.register("crimson_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_BARK_TRAPDOOR = BLOCKS.register("warped_bark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	
	public static final RegistryObject<Block> OAK_RANCH_TRAPDOOR = BLOCKS.register("oak_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_RANCH_TRAPDOOR = BLOCKS.register("spruce_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_RANCH_TRAPDOOR = BLOCKS.register("birch_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_RANCH_TRAPDOOR = BLOCKS.register("jungle_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_RANCH_TRAPDOOR = BLOCKS.register("acacia_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_RANCH_TRAPDOOR = BLOCKS.register("dark_oak_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_RANCH_TRAPDOOR = BLOCKS.register("crimson_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_RANCH_TRAPDOOR = BLOCKS.register("warped_ranch_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	
	public static final RegistryObject<Block> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(1.5F, 2.5F).sound(SoundType.BAMBOO).noOcclusion()));
	
	public static final RegistryObject<Block> METAL_TRAPDOOR = BLOCKS.register("metal_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.METAL).strength(1.5F, 3.0F).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> METAL_FULL_TRAPDOOR = BLOCKS.register("metal_full_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.METAL).strength(1.5F, 3.0F).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> METAL_WARNING_TRAPDOOR = BLOCKS.register("metal_warning_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.METAL).strength(1.5F, 3.0F).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> OAK_BLOSSOM_TRAPDOOR = BLOCKS.register("oak_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_BLOSSOM_TRAPDOOR = BLOCKS.register("spruce_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_BLOSSOM_TRAPDOOR = BLOCKS.register("birch_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_BLOSSOM_TRAPDOOR = BLOCKS.register("jungle_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_BLOSSOM_TRAPDOOR = BLOCKS.register("acacia_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_BLOSSOM_TRAPDOOR = BLOCKS.register("dark_oak_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_BLOSSOM_TRAPDOOR = BLOCKS.register("warped_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_BLOSSOM_TRAPDOOR = BLOCKS.register("crimson_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_BLOSSOM_TRAPDOOR = BLOCKS.register("bamboo_blossom_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));

	//1.1.2
	
	public static final RegistryObject<Block> OAK_BARREL_TRAPDOOR = BLOCKS.register("oak_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> SPRUCE_BARREL_TRAPDOOR = BLOCKS.register("spruce_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BIRCH_BARREL_TRAPDOOR = BLOCKS.register("birch_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> JUNGLE_BARREL_TRAPDOOR = BLOCKS.register("jungle_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ACACIA_BARREL_TRAPDOOR = BLOCKS.register("acacia_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> DARK_OAK_BARREL_TRAPDOOR = BLOCKS.register("dark_oak_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> WARPED_BARREL_TRAPDOOR = BLOCKS.register("warped_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> CRIMSON_BARREL_TRAPDOOR = BLOCKS.register("crimson_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> BAMBOO_BARREL_TRAPDOOR = BLOCKS.register("bamboo_barrel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()));


}
