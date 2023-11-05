package net.kikoz.mcwtrpdoors.objects;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kikoz.mcwtrpdoors.MacawsTrapdoors;
import net.kikoz.mcwtrpdoors.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TrapdoorGroup {

    public static ItemGroup TRAPDOORSGROUP;

    public static void registerTabs() {
        TRAPDOORSGROUP = FabricItemGroup.builder(new Identifier(MacawsTrapdoors.MOD_ID, "trapdoorsgroup"))
                .displayName(Text.translatable("itemGroup.mcwtrpdoors.trapdoorsgroup"))
                .icon(() -> new ItemStack(BlockInit.OAK_RANCH_TRAPDOOR)).build();
    }

}