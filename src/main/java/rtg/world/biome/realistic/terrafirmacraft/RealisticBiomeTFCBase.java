package rtg.world.biome.realistic.terrafirmacraft;

import rtg.config.ConfigTFC;
import rtg.world.biome.BiomeBase;
import rtg.world.biome.realistic.RealisticBiomeBase;
import rtg.world.gen.surface.SurfaceBase;
import rtg.world.gen.terrain.TerrainBase;
import cpw.mods.fml.common.Loader;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeTFCBase extends RealisticBiomeBase
{
    
    public static RealisticBiomeBase tfcOcean;
    public static RealisticBiomeBase tfcRiver;
    public static RealisticBiomeBase tfcBeach;
    public static RealisticBiomeBase tfcGravelBeach;
    public static RealisticBiomeBase tfcHighHills;
    public static RealisticBiomeBase tfcPlains;
    public static RealisticBiomeBase tfcSwamp;
    public static RealisticBiomeBase tfcHighHillsEdge;
    public static RealisticBiomeBase tfcRollingHills;
    public static RealisticBiomeBase tfcMountains;
    public static RealisticBiomeBase tfcMountainsEdge;
    public static RealisticBiomeBase tfcHighPlains;
    public static RealisticBiomeBase tfcDeepOcean;
    public static RealisticBiomeBase tfcLake;
    
    public RealisticBiomeTFCBase(BiomeGenBase b, BiomeGenBase riverbiome, TerrainBase t, SurfaceBase s)
    {
    
        super(b, riverbiome, t, s);
    }
    
    public static void addBiomes()
    {
    
        if (Loader.isModLoaded("terrafirmacraft") && ConfigTFC.generateTFCBiomes)
        {
            BiomeGenBase[] b = BiomeGenBase.getBiomeGenArray();
            
            for (int i = 0; i < 256; i++)
            {
                if (b[i] != null)
                {
                    BiomeGenBase tfcBiome = b[i];
                    String biomeName = b[i].biomeName;
                    String biomeClass = b[i].getBiomeClass().getName();
                    
                    if (biomeName == "Beach" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCBeach) {
                            
                            tfcBeach = new RealisticBiomeTFCBeach(tfcBiome);
                            BiomeBase.addBiome(tfcBeach);
                        }
                    }
                    else if (biomeName == "Deep Ocean" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCDeepOcean) {
                            
                            tfcDeepOcean = new RealisticBiomeTFCDeepOcean(tfcBiome);
                            BiomeBase.addBiome(tfcDeepOcean);
                        }
                    }
                    else if (biomeName == "Gravel Beach" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCGravelBeach) {
                            
                            tfcGravelBeach = new RealisticBiomeTFCGravelBeach(tfcBiome);
                            BiomeBase.addBiome(tfcGravelBeach);
                        }
                    }
                    else if (biomeName == "High Hills" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCHighHills) {
                            
                            tfcHighHills = new RealisticBiomeTFCHighHills(tfcBiome);
                            BiomeBase.addBiome(tfcHighHills);
                        }
                    }
                    else if (biomeName == "High Hills Edge" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCHighHillsEdge) {
                            
                            tfcHighHillsEdge = new RealisticBiomeTFCHighHillsEdge(tfcBiome);
                            BiomeBase.addBiome(tfcHighHillsEdge);
                        }
                    }
                    else if (biomeName == "High Plains" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCHighPlains) {
                            
                            tfcHighPlains = new RealisticBiomeTFCHighPlains(tfcBiome);
                            BiomeBase.addBiome(tfcHighPlains);
                        }
                    }
                    else if (biomeName == "Lake" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCLake) {
                            
                            tfcLake = new RealisticBiomeTFCLake(tfcBiome);
                            BiomeBase.addBiome(tfcLake);
                        }
                    }
                    else if (biomeName == "Mountains" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCMountains) {
                            
                            tfcMountains = new RealisticBiomeTFCMountains(tfcBiome);
                            BiomeBase.addBiome(tfcMountains);
                        }
                    }
                    else if (biomeName == "Mountains Edge" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCMountainsEdge) {
                            
                            tfcMountainsEdge = new RealisticBiomeTFCMountainsEdge(tfcBiome);
                            BiomeBase.addBiome(tfcMountainsEdge);
                        }
                    }
                    else if (biomeName == "Ocean" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCOcean) {
                            
                            tfcOcean = new RealisticBiomeTFCOcean(tfcBiome);
                            BiomeBase.addBiome(tfcOcean);
                        }
                    }
                    else if (biomeName == "Plains" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCPlains) {
                            
                            tfcPlains = new RealisticBiomeTFCPlains(tfcBiome);
                            BiomeBase.addBiome(tfcPlains);
                        }
                    }
                    else if (biomeName == "River" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCRiver) {
                            
                            tfcRiver = new RealisticBiomeTFCRiver(tfcBiome);
                            BiomeBase.addBiome(tfcRiver);
                        }
                    }
                    else if (biomeName == "Rolling Hills" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCRollingHills) {
                            
                            tfcRollingHills = new RealisticBiomeTFCRollingHills(tfcBiome);
                            BiomeBase.addBiome(tfcRollingHills);
                        }
                    }
                    else if (biomeName == "Swamp" && biomeClass == "com.bioxx.tfc.WorldGen.TFCBiome")
                    {
                        if (ConfigTFC.generateTFCSwamp) {
                            
                            tfcSwamp = new RealisticBiomeTFCSwamp(tfcBiome);
                            BiomeBase.addBiome(tfcSwamp);
                        }
                    }
                }
            }
        }
    }
}
