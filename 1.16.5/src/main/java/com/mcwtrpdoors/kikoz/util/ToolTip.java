package com.mcwtrpdoors.kikoz.util;

import java.util.List;

import javax.annotation.Nullable;

import com.mcwtrpdoors.kikoz.MacawsTrapdoors;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class ToolTip extends Item {
	
	
	public ToolTip(Properties properties) {
		super(new Item.Properties().tab(MacawsTrapdoors.TrapDoorItemGroup));
	}
	
	   @OnlyIn(Dist.CLIENT)
	   public void appendHoverText(ItemStack stack, @Nullable World level, List<ITextComponent> list, ITooltipFlag flag) {
	      list.add(this.getDescription().withStyle(TextFormatting.GRAY));
	   }
	   
		@Override
		   @OnlyIn(Dist.CLIENT)
		   public IFormattableTextComponent getDescription() {
		      return new TranslationTextComponent("mcwtrpdoors.crafting.desc");
		   }

		@Override
		public int getBurnTime (ItemStack itemStack) {
			return 100;
		}
}