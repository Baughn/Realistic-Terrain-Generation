package rtg.world.biome.realistic.vanilla;

import java.util.Random;

import rtg.config.vanilla.ConfigVanilla;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.vanilla.SurfaceVanillaMushroomIsland;
import rtg.world.gen.terrain.vanilla.TerrainVanillaMushroomIsland;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeVanillaMushroomIsland extends RealisticBiomeVanillaBase
{
    
    public static Block topBlock = Blocks.mycelium;
    public static Block fillerBlock = Blocks.mycelium;
    
    public RealisticBiomeVanillaMushroomIsland()
    {
    
        super(
            BiomeGenBase.mushroomIsland,
            BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.TEMPERATE),
            new TerrainVanillaMushroomIsland(),
            new SurfaceVanillaMushroomIsland(Blocks.gravel, Blocks.gravel, Blocks.clay, 20f, 0.1f));
        
        this.setRealisticBiomeName("Vanilla Mushroom Island");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigVanilla.weightVanillaMushroomIsland;
    }
}
