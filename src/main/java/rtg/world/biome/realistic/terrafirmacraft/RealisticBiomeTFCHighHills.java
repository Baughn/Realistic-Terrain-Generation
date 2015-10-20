package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCHighHills;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCHighHills;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCHighHills extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCHighHills(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCHighHills(),
            new SurfaceTFCHighHills(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC High Hills");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigTFC.weightTFCHighHills;
    }
}
