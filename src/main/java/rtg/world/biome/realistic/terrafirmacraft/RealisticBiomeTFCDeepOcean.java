package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCDeepOcean;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCDeepOcean;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCDeepOcean extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCDeepOcean(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCDeepOcean(),
            new SurfaceTFCDeepOcean(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC Deep Ocean");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigTFC.weightTFCDeepOcean;
    }
}
