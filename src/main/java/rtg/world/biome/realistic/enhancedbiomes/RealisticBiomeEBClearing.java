package rtg.world.biome.realistic.enhancedbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import rtg.config.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeGenManager;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBClearing;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBClearing;

public class RealisticBiomeEBClearing extends RealisticBiomeEBBase
{	
	public RealisticBiomeEBClearing(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, BiomeBase.Climate.TEMPERATE),
			new TerrainEBClearing(),
			new SurfaceEBClearing(ebBiome.topBlock, ebBiome.fillerBlock, Blocks.stone, Blocks.cobblestone)
		);
		
		this.setRealisticBiomeName("EB Clearing");
		BiomeGenManager.addFrozenBiome(this, ConfigEB.weightEBClearing);
	}
}
