package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.terrafirmacraft.SurfaceTFCHighPlains;
import rtg.world.gen.terrain.terrafirmacraft.TerrainTFCHighPlains;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCHighPlains extends RealisticBiomeTFCBase
{
    
    public RealisticBiomeTFCHighPlains(BiomeGenBase tfcBiome)
    {
    
        super(
            tfcBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainTFCHighPlains(),
            new SurfaceTFCHighPlains(tfcBiome.topBlock, tfcBiome.fillerBlock));
        
        this.setRealisticBiomeName("TFC High Plains");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigTFC.weightTFCHighPlains;
    }
}
