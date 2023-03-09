package net.kikoz.mcwtrpdoors.objects;


import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kikoz.mcwtrpdoors.MacawsTrapdoors;
import net.kikoz.mcwtrpdoors.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TrapdoorGroup {
    public static final ItemGroup TRAPDOORSGROUP = FabricItemGroupBuilder.build(new Identifier(MacawsTrapdoors.MOD_ID, "trapdoorsgroup"),
            () -> new ItemStack(BlockInit.OAK_RANCH_TRAPDOOR));
}