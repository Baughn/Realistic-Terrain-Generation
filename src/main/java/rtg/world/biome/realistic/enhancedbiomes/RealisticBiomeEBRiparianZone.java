package rtg.world.biome.realistic.enhancedbiomes;

import net.minecraft.world.biome.BiomeGenBase;

import rtg.config.enhancedbiomes.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeBase.BiomeCategory;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBRiparianZone;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBRiparianZone;

public class RealisticBiomeEBRiparianZone extends RealisticBiomeEBBase
{	
	public RealisticBiomeEBRiparianZone(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.TEMPERATE),
			new TerrainEBRiparianZone(),
			new SurfaceEBRiparianZone(ebBiome.topBlock, ebBiome.fillerBlock, ebBiome.topBlock, ebBiome.topBlock)
		);
		
		this.setRealisticBiomeName("EB Riparian Zone");
		this.biomeCategory = BiomeCategory.HOT;
		this.biomeWeight = ConfigEB.weightEBRiparianZone;
	}
}
