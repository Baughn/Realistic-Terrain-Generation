package rtg.world.biome.realistic.vanilla;

import java.util.Random;

import rtg.config.vanilla.ConfigVanilla;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.realistic.RealisticBiomeBase;
import rtg.world.gen.feature.tree.WorldGenTreeShrub;
import rtg.world.gen.surface.vanilla.SurfaceVanillaPlains;
import rtg.world.gen.terrain.vanilla.TerrainVanillaPlains;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class RealisticBiomeVanillaPlains extends RealisticBiomeVanillaBase
{
    
    public static Block topBlock = BiomeGenBase.plains.topBlock;
    public static Block fillerBlock = BiomeGenBase.plains.fillerBlock;
    
    public RealisticBiomeVanillaPlains()
    {
    
        super(
            BiomeGenBase.plains,
            BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.TEMPERATE),
            new TerrainVanillaPlains(),
            new SurfaceVanillaPlains(topBlock, fillerBlock, Blocks.stone, Blocks.cobblestone));
        
        this.setRealisticBiomeName("Vanilla Plains");
        this.biomeCategory = BiomeCategory.WET;
        this.biomeWeight = ConfigVanilla.weightVanillaPlains;
    }
    
    @Override
    public void rDecorate(World world, Random rand, int chunkX, int chunkY, OpenSimplexNoise simplex, CellNoise cell, float strength,
        float river) {
    
        RealisticBiomeBase.rDecorateSeedBiome(world, rand, chunkX, chunkY, simplex, cell, strength, river, baseBiome);
        
        if (rand.nextInt((int) (12f / strength)) == 0) {
            int j6 = chunkX + rand.nextInt(16) + 8;
            int k10 = chunkY + rand.nextInt(16) + 8;
            int z52 = world.getHeightValue(j6, k10);
            
            if (z52 < 80) {
                WorldGenerator worldgenerator = new WorldGenTreeShrub(3, 0, 0);
                worldgenerator.setScale(1.0D, 1.0D, 1.0D);
                worldgenerator.generate(world, rand, j6, z52, k10);
            }
        }
    }
}
