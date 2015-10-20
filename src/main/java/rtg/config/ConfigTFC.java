package rtg.config;

import java.io.File;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.config.Configuration;

public class ConfigTFC
{
    
    public static Configuration config;
    
    public static final int biomeWeightMin = 0;
    public static final int biomeWeightMax = 100;
    public static final int biomeWeightDefault = 10;
    
    public static boolean generateTFCBiomes = true;

    public static boolean generateTFCOcean = true;
    public static boolean generateTFCRiver = true;
    public static boolean generateTFCBeach = true;
    public static boolean generateTFCGravelBeach = true;
    public static boolean generateTFCHighHills = true;
    public static boolean generateTFCPlains = true;
    public static boolean generateTFCSwamp = true;
    public static boolean generateTFCHighHillsEdge = true;
    public static boolean generateTFCRollingHills = true;
    public static boolean generateTFCMountains = true;
    public static boolean generateTFCMountainsEdge = true;
    public static boolean generateTFCHighPlains = true;
    public static boolean generateTFCDeepOcean = true;
    public static boolean generateTFCLake = true;
    
    public static int weightTFCOcean = biomeWeightDefault;
    public static int weightTFCRiver = biomeWeightDefault;
    public static int weightTFCBeach = biomeWeightDefault;
    public static int weightTFCGravelBeach = biomeWeightDefault;
    public static int weightTFCHighHills = biomeWeightDefault;
    public static int weightTFCPlains = biomeWeightDefault;
    public static int weightTFCSwamp = biomeWeightDefault;
    public static int weightTFCHighHillsEdge = biomeWeightDefault;
    public static int weightTFCRollingHills = biomeWeightDefault;
    public static int weightTFCMountains = biomeWeightDefault;
    public static int weightTFCMountainsEdge = biomeWeightDefault;
    public static int weightTFCHighPlains = biomeWeightDefault;
    public static int weightTFCDeepOcean = biomeWeightDefault;
    public static int weightTFCLake = biomeWeightDefault;
    
    public static void init(File configFile)
    {
    
        config = new Configuration(configFile);
        
        try
        {
            config.load();
            
            generateTFCBiomes = config.getBoolean("Generate TFC Biomes", "TFC Biomes", generateTFCBiomes, "");

            generateTFCOcean = config.getBoolean("generateTFCOcean", "TFC Biomes", generateTFCOcean, "");
            generateTFCRiver = config.getBoolean("generateTFCRiver", "TFC Biomes", generateTFCRiver, "");
            generateTFCBeach = config.getBoolean("generateTFCBeach", "TFC Biomes", generateTFCBeach, "");
            generateTFCGravelBeach = config.getBoolean("generateTFCGravelBeach", "TFC Biomes", generateTFCGravelBeach, "");
            generateTFCHighHills = config.getBoolean("generateTFCHighHills", "TFC Biomes", generateTFCHighHills, "");
            generateTFCPlains = config.getBoolean("generateTFCPlains", "TFC Biomes", generateTFCPlains, "");
            generateTFCSwamp = config.getBoolean("generateTFCSwamp", "TFC Biomes", generateTFCSwamp, "");
            generateTFCHighHillsEdge = config.getBoolean("generateTFCHighHillsEdge", "TFC Biomes", generateTFCHighHillsEdge, "");
            generateTFCRollingHills = config.getBoolean("generateTFCRollingHills", "TFC Biomes", generateTFCRollingHills, "");
            generateTFCMountains = config.getBoolean("generateTFCMountains", "TFC Biomes", generateTFCMountains, "");
            generateTFCMountainsEdge = config.getBoolean("generateTFCMountainsEdge", "TFC Biomes", generateTFCMountainsEdge, "");
            generateTFCHighPlains = config.getBoolean("generateTFCHighPlains", "TFC Biomes", generateTFCHighPlains, "");
            generateTFCDeepOcean = config.getBoolean("generateTFCDeepOcean", "TFC Biomes", generateTFCDeepOcean, "");
            generateTFCLake = config.getBoolean("generateTFCLake", "TFC Biomes", generateTFCLake, "");
            
            weightTFCOcean = config.getInt("weightTFCOcean", "TFC Biome Weights", weightTFCOcean, biomeWeightMin, biomeWeightMax, "");
            weightTFCRiver = config.getInt("weightTFCRiver", "TFC Biome Weights", weightTFCRiver, biomeWeightMin, biomeWeightMax, "");
            weightTFCBeach = config.getInt("weightTFCBeach", "TFC Biome Weights", weightTFCBeach, biomeWeightMin, biomeWeightMax, "");
            weightTFCGravelBeach = config.getInt("weightTFCGravelBeach", "TFC Biome Weights", weightTFCGravelBeach, biomeWeightMin, biomeWeightMax, "");
            weightTFCHighHills = config.getInt("weightTFCHighHills", "TFC Biome Weights", weightTFCHighHills, biomeWeightMin, biomeWeightMax, "");
            weightTFCPlains = config.getInt("weightTFCPlains", "TFC Biome Weights", weightTFCPlains, biomeWeightMin, biomeWeightMax, "");
            weightTFCSwamp = config.getInt("weightTFCSwamp", "TFC Biome Weights", weightTFCSwamp, biomeWeightMin, biomeWeightMax, "");
            weightTFCHighHillsEdge = config.getInt("weightTFCHighHillsEdge", "TFC Biome Weights", weightTFCHighHillsEdge, biomeWeightMin, biomeWeightMax, "");
            weightTFCRollingHills = config.getInt("weightTFCRollingHills", "TFC Biome Weights", weightTFCRollingHills, biomeWeightMin, biomeWeightMax, "");
            weightTFCMountains = config.getInt("weightTFCMountains", "TFC Biome Weights", weightTFCMountains, biomeWeightMin, biomeWeightMax, "");
            weightTFCMountainsEdge = config.getInt("weightTFCMountainsEdge", "TFC Biome Weights", weightTFCMountainsEdge, biomeWeightMin, biomeWeightMax, "");
            weightTFCHighPlains = config.getInt("weightTFCHighPlains", "TFC Biome Weights", weightTFCHighPlains, biomeWeightMin, biomeWeightMax, "");
            weightTFCDeepOcean = config.getInt("weightTFCDeepOcean", "TFC Biome Weights", weightTFCDeepOcean, biomeWeightMin, biomeWeightMax, "");
            weightTFCLake = config.getInt("weightTFCLake", "TFC Biome Weights", weightTFCLake, biomeWeightMin, biomeWeightMax, "");
            
        } catch (Exception e)
        {
            FMLLog.log(Level.ERROR, e, "RTG has had a problem loading TFC configuration.");
        } finally
        {
            if (config.hasChanged())
            {
                config.save();
            }
        }
    }
}
