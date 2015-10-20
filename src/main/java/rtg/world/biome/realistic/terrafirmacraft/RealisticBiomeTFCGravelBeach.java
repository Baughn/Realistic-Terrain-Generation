package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCGravelBeach;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCGravelBeach;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCGravelBeach extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCGravelBeach(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCGravelBeach(),
            new SurfaceTFCGravelBeach(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC Gravel Beach");
        this.biomeCategory = BiomeCategory.COLD;
        this.biomeWeight = ConfigTFC.weightTFCGravelBeach;
    }
}
