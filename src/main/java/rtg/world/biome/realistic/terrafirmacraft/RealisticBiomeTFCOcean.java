package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCBeach;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCBeach;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCOcean extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCOcean(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCBeach(),
            new SurfaceTFCBeach(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC Beach");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigTFC.weightTFCBeach;
    }
}
