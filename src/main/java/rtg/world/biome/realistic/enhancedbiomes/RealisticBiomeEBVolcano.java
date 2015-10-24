package rtg.world.biome.realistic.enhancedbiomes;

import net.minecraft.world.biome.BiomeGenBase;

import rtg.config.enhancedbiomes.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.BiomeBase.BiomeCategory;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBVolcano;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBVolcano;

public class RealisticBiomeEBVolcano extends RealisticBiomeEBBase
{	
	public RealisticBiomeEBVolcano(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.TEMPERATE),
			new TerrainEBVolcano(),
			new SurfaceEBVolcano(ebBiome.topBlock, ebBiome.fillerBlock, false, ebBiome.topBlock, 20f)
		);
		
		this.setRealisticBiomeName("EB Volcano");
		this.biomeCategory = BiomeCategory.HOT;
		this.biomeWeight = ConfigEB.weightEBVolcano;
	}
}
