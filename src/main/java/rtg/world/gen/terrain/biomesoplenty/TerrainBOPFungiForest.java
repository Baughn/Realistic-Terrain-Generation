package rtg.world.gen.terrain.biomesoplenty;

import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainBOPFungiForest extends TerrainBase
{
	private float heigth;
	private float width;
	
	public TerrainBOPFungiForest(float mountainHeight, float mountainWidth)
	{
		heigth = mountainHeight;
		width = mountainWidth;
	}
	
	@Override
	public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float ocean, float border, float river)
	{
		float h = simplex.noise2(x / width, y / width) * heigth * river;
		h *= h / 32f;
		h = h > 150f ? 150f : h;

		if(h < 14f)
		{
			h += simplex.noise2(x / 25f, y / 25f) * (14f - h) * 0.8f;
		}
		
		if(h < 6)
		{
			h = 6f - ((6f - h) * 0.07f) + simplex.noise2(x / 20f, y / 20f) + simplex.noise2(x / 5f, y / 5f);
		}
		
		if(h > 10f)
		{
			float d = (h - 10f) / 2f > 8f ? 8f : (h - 10f) / 2f;
			h += simplex.noise2(x / 35f, y / 35f) * d;
			h += simplex.noise2(x / 60f, y / 60f) * d * 0.5f;

			if(h > 35f)
			{
				float d2 = (h - 35f) / 1.5f > 30f ? 30f : (h - 35f) / 1.5f;
				h += cell.noise(x / 25D, y / 25D, 1D) * d2;
			}
		}

		if(h > 2f)
		{
			float d = (h - 2f) / 2f > 4f ? 4f : (h - 2f) / 2f;
    		h += simplex.noise2(x / 28f, y / 28f) * d;
    		h += simplex.noise2(x / 18f, y / 18f) * (d / 2f);
    		h += simplex.noise2(x / 8f, y / 8f) * (d / 2f);
		}
		
		return h + 56f;
	}
}
