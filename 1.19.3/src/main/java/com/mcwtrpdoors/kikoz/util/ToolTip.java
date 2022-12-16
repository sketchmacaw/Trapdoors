package com.mcwtrpdoors.kikoz.util;


import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class ToolTip extends Item {
	
	
	public ToolTip(Object properties) {
		super(new Item.Properties());
	}

	   @OnlyIn(Dist.CLIENT)
	   public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> comp, TooltipFlag flag) {
		      comp.add(this.getDescription().withStyle(ChatFormatting.GRAY));
	   }
	   
		@Override
		   @OnlyIn(Dist.CLIENT)
		   public MutableComponent getDescription() {
		      return Component.translatable("mcwtrpdoors.crafting.desc"); 
		   }  
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return 150;
	}
}
