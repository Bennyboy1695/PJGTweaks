package com.properjobgaming.PJGTweaks.RunicDungeons;

import mrcomputerghost.runicdungeons.blocks.BlockWitherBricks;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class RunicDungeonsBrick extends BlockWitherBricks{
	
	@Override
	public boolean canDropFromExplosion(Explosion p_149659_1_) {
		return false;
	}
}
