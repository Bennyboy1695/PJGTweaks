package com.properjobgaming.PJGTweaks.RunicDungeons;

import mrcomputerghost.runicdungeons.blocks.BlockWitherGlass;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class RunicDungeonsGlass extends BlockWitherGlass{
	
	@Override
	public boolean canDropFromExplosion(Explosion p_149659_1_) {
		return false;
	}
}
