package rtg.world.biome.realistic.enhancedbiomes;

import net.minecraft.world.biome.BiomeGenBase;

import rtg.config.enhancedbiomes.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeBase.BiomeCategory;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBForestedValley;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBForestedValley;

public class RealisticBiomeEBForestedValley extends RealisticBiomeEBBase
{	
	public RealisticBiomeEBForestedValley(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.TEMPERATE),
			new TerrainEBForestedValley(40f),
			new SurfaceEBForestedValley(ebBiome.topBlock, ebBiome.fillerBlock, 20f, false, false)
		);
		
		this.setRealisticBiomeName("EB Forested Valley");
		this.biomeCategory = BiomeCategory.WET;
		this.biomeWeight = ConfigEB.weightEBForestedValley;
	}
}
