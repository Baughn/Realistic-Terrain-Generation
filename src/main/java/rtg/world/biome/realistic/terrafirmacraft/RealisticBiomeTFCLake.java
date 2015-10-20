package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCLake;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCLake;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCLake extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCLake(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCLake(),
            new SurfaceTFCLake(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC Lake");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigTFC.weightTFCLake;
    }
}
