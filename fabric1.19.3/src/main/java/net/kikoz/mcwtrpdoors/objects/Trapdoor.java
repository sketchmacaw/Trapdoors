package net.kikoz.mcwtrpdoors.objects;

import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.SoundEvent;

public class Trapdoor extends TrapdoorBlock {
    private final SoundEvent closeSound;
    private final SoundEvent openSound;

    public Trapdoor(Settings settings, SoundEvent closeSound, SoundEvent openSound) {
        super(settings, closeSound,openSound);
        this.closeSound = closeSound;
        this.openSound = openSound;
    }
}