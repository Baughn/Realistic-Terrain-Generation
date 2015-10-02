package rtg.world.biome.realistic.enhancedbiomes;

import net.minecraft.world.biome.BiomeGenBase;
import rtg.config.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeGenManager;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBPlateau;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBPlateau;

public class RealisticBiomeEBPlateau extends RealisticBiomeEBBase
{	
	public RealisticBiomeEBPlateau(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, BiomeBase.Climate.COLD),
			new TerrainEBPlateau(200f, 100f, 0f),
			new SurfaceEBPlateau(ebBiome.topBlock, ebBiome.fillerBlock, false, null, 0.95f)
		);
		
		this.setRealisticBiomeName("EB Plateau");
		BiomeGenManager.addFrozenBiome(this, ConfigEB.weightEBPlateau);
	}
}
