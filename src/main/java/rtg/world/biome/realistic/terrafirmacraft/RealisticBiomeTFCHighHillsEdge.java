package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCHighHillsEdge;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCHighHillsEdge;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCHighHillsEdge extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCHighHillsEdge(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCHighHillsEdge(),
            new SurfaceTFCHighHillsEdge(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC High Hills Edge");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigTFC.weightTFCHighHillsEdge;
    }
}
