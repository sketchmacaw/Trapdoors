package com.mcwtrpdoors.kikoz.init;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.mcwtrpdoors.kikoz.MacawsTrapdoors;
import com.mcwtrpdoors.kikoz.util.FuelItemBlock;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsTrapdoors.MOD_ID);
	
	public static final RegistryObject<Block> OAK_BARN_TRAPDOOR = registerBlock("oak_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_BARRED_TRAPDOOR = registerBlock("oak_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_BEACH_TRAPDOOR = registerBlock("oak_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_COTTAGE_TRAPDOOR = registerBlock("oak_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_FOUR_PANEL_TRAPDOOR = registerBlock("oak_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_GLASS_TRAPDOOR = registerBlock("oak_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_MYSTIC_TRAPDOOR = registerBlock("oak_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_PAPER_TRAPDOOR = registerBlock("oak_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_TROPICAL_TRAPDOOR = registerBlock("oak_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> OAK_SWAMP_TRAPDOOR = registerBlock("oak_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> SPRUCE_BARN_TRAPDOOR = registerBlock("spruce_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_BARRED_TRAPDOOR = registerBlock("spruce_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_BEACH_TRAPDOOR = registerBlock("spruce_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_CLASSIC_TRAPDOOR = registerBlock("spruce_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_FOUR_PANEL_TRAPDOOR = registerBlock("spruce_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_GLASS_TRAPDOOR = registerBlock("spruce_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_MYSTIC_TRAPDOOR = registerBlock("spruce_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_PAPER_TRAPDOOR = registerBlock("spruce_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_TROPICAL_TRAPDOOR = registerBlock("spruce_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_SWAMP_TRAPDOOR = registerBlock("spruce_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> BIRCH_BARN_TRAPDOOR = registerBlock("birch_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_BARRED_TRAPDOOR = registerBlock("birch_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_BEACH_TRAPDOOR = registerBlock("birch_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_CLASSIC_TRAPDOOR = registerBlock("birch_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_COTTAGE_TRAPDOOR = registerBlock("birch_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_FOUR_PANEL_TRAPDOOR = registerBlock("birch_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_GLASS_TRAPDOOR = registerBlock("birch_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_MYSTIC_TRAPDOOR = registerBlock("birch_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_TROPICAL_TRAPDOOR = registerBlock("birch_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_SWAMP_TRAPDOOR = registerBlock("birch_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> JUNGLE_BARN_TRAPDOOR = registerBlock("jungle_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_BARRED_TRAPDOOR = registerBlock("jungle_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_CLASSIC_TRAPDOOR = registerBlock("jungle_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_COTTAGE_TRAPDOOR = registerBlock("jungle_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_FOUR_PANEL_TRAPDOOR = registerBlock("jungle_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_GLASS_TRAPDOOR = registerBlock("jungle_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_MYSTIC_TRAPDOOR = registerBlock("jungle_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_PAPER_TRAPDOOR = registerBlock("jungle_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_TROPICAL_TRAPDOOR = registerBlock("jungle_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_SWAMP_TRAPDOOR = registerBlock("jungle_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> ACACIA_BARN_TRAPDOOR = registerBlock("acacia_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_BARRED_TRAPDOOR = registerBlock("acacia_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_BEACH_TRAPDOOR = registerBlock("acacia_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_CLASSIC_TRAPDOOR = registerBlock("acacia_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_COTTAGE_TRAPDOOR = registerBlock("acacia_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_FOUR_PANEL_TRAPDOOR = registerBlock("acacia_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_GLASS_TRAPDOOR = registerBlock("acacia_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_MYSTIC_TRAPDOOR = registerBlock("acacia_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_PAPER_TRAPDOOR = registerBlock("acacia_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_SWAMP_TRAPDOOR = registerBlock("acacia_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	
	public static final RegistryObject<Block> DARK_OAK_BARN_TRAPDOOR = registerBlock("dark_oak_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_BARRED_TRAPDOOR = registerBlock("dark_oak_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_BEACH_TRAPDOOR = registerBlock("dark_oak_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_CLASSIC_TRAPDOOR = registerBlock("dark_oak_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_COTTAGE_TRAPDOOR = registerBlock("dark_oak_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_GLASS_TRAPDOOR = registerBlock("dark_oak_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_MYSTIC_TRAPDOOR = registerBlock("dark_oak_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_PAPER_TRAPDOOR = registerBlock("dark_oak_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_TROPICAL_TRAPDOOR = registerBlock("dark_oak_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_SWAMP_TRAPDOOR = registerBlock("dark_oak_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	
	public static final RegistryObject<Block> CRIMSON_BARN_TRAPDOOR = registerBlock("crimson_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_BEACH_TRAPDOOR = registerBlock("crimson_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_CLASSIC_TRAPDOOR = registerBlock("crimson_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_COTTAGE_TRAPDOOR = registerBlock("crimson_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_FOUR_PANEL_TRAPDOOR = registerBlock("crimson_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_GLASS_TRAPDOOR = registerBlock("crimson_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_MYSTIC_TRAPDOOR = registerBlock("crimson_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_PAPER_TRAPDOOR = registerBlock("crimson_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_TROPICAL_TRAPDOOR = registerBlock("crimson_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_SWAMP_TRAPDOOR = registerBlock("crimson_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> WARPED_BARN_TRAPDOOR = registerBlock("warped_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_BARRED_TRAPDOOR = registerBlock("warped_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_BEACH_TRAPDOOR = registerBlock("warped_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_CLASSIC_TRAPDOOR = registerBlock("warped_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_COTTAGE_TRAPDOOR = registerBlock("warped_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_FOUR_PANEL_TRAPDOOR = registerBlock("warped_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_GLASS_TRAPDOOR = registerBlock("warped_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_PAPER_TRAPDOOR = registerBlock("warped_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_TROPICAL_TRAPDOOR = registerBlock("warped_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_SWAMP_TRAPDOOR = registerBlock("warped_swamp_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> MANGROVE_BARN_TRAPDOOR = registerBlock("mangrove_barn_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_BARRED_TRAPDOOR = registerBlock("mangrove_barred_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_BEACH_TRAPDOOR = registerBlock("mangrove_beach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_CLASSIC_TRAPDOOR = registerBlock("mangrove_classic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_COTTAGE_TRAPDOOR = registerBlock("mangrove_cottage_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_FOUR_PANEL_TRAPDOOR = registerBlock("mangrove_four_panel_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_GLASS_TRAPDOOR = registerBlock("mangrove_glass_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_PAPER_TRAPDOOR = registerBlock("mangrove_paper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_TROPICAL_TRAPDOOR = registerBlock("mangrove_tropical_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_MYSTIC_TRAPDOOR = registerBlock("mangrove_mystic_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> OAK_BARK_TRAPDOOR = registerBlock("oak_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_BARK_TRAPDOOR = registerBlock("spruce_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_BARK_TRAPDOOR = registerBlock("birch_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_BARK_TRAPDOOR = registerBlock("jungle_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_BARK_TRAPDOOR = registerBlock("acacia_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_BARK_TRAPDOOR = registerBlock("dark_oak_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_BARK_TRAPDOOR = registerBlock("crimson_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_BARK_TRAPDOOR = registerBlock("warped_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_BARK_TRAPDOOR = registerBlock("mangrove_bark_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> OAK_RANCH_TRAPDOOR = registerBlock("oak_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_RANCH_TRAPDOOR = registerBlock("spruce_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> BIRCH_RANCH_TRAPDOOR = registerBlock("birch_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_RANCH_TRAPDOOR = registerBlock("jungle_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> ACACIA_RANCH_TRAPDOOR = registerBlock("acacia_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_RANCH_TRAPDOOR = registerBlock("dark_oak_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_RANCH_TRAPDOOR = registerBlock("crimson_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> WARPED_RANCH_TRAPDOOR = registerBlock("warped_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> MANGROVE_RANCH_TRAPDOOR = registerBlock("mangrove_ranch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);

	public static final RegistryObject<Block> BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(1.5F, 2.5F).sound(SoundType.BAMBOO).noOcclusion()), MacawsTrapdoors.TrapDoorItemGroup);
	
	public static final RegistryObject<Block> METAL_TRAPDOOR = registerBlock("metal_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1.5F, 3.0F).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> METAL_WARNING_TRAPDOOR = registerBlock("metal_warning_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1.5F, 3.0F).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops()), MacawsTrapdoors.TrapDoorItemGroup);
	public static final RegistryObject<Block> METAL_FULL_TRAPDOOR = registerBlock("metal_full_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1.5F, 3.0F).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops()), MacawsTrapdoors.TrapDoorItemGroup);

    @SuppressWarnings("unused")
	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    @SuppressWarnings("unused")
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(Component.translatable(tooltipKey));
            }
        });
    }

    @SuppressWarnings("unused")
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
    
    	//checks if it is wood to change the item to be able to put it in furnace
    	if (name.contains("oak") || name.contains("spruce") || name.contains("birch") || name.contains("jungle") || name.contains("acacia") || name.contains("warped") || name.contains("crimson") || name.contains("mangrove")) {
            return ItemInit.ITEMS.register(name, () -> new FuelItemBlock(block.get(),
                    new Item.Properties().tab(tab)));
    	} else {
            return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
    	}
    }
  
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
