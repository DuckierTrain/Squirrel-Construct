package mymod._06_BrandNewBiomes;

import java.awt.Color;
import java.util.Random;

import mymod.Main;
import mymod.CodakidFiles.CKWorldGenerater;
import net.minecraft.block.BlockColored;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenerator;

public class CustomBiome extends Biome {
	
	private static BiomeProperties properties = new Biome.BiomeProperties("squirrel Plaza");
	static {
		
	    //Set properties here
		properties.setBaseHeight(0.5F);
		properties.setHeightVariation(0.00001F);
		properties.setWaterColor(Color.GREEN.getRGB());
		properties.setRainDisabled();
		
	}

	public CustomBiome() {
		super(properties);
		this.setRegistryName(new ResourceLocation(Main.MODID, "my_biome"));
		this.decorator.treesPerChunk = 50;
		
		
		
	}
	
	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos){
		super.decorate(worldIn, rand, pos);
		
		
		
		//WorldGenerator wG;
		//wG = new CKWorldGenerater(Blocks.BLUE_SHULKER_BOX.getDefaultState(), 5555);
		//wG.generate(worldIn, rand, pos);
	
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunk, int num1, int num2, double num3) {
		
		//Set top and filler blocks here
		int number = rand.nextInt(10) + 1;
		
		if(number < 8){
			this.topBlock = Blocks.CONCRETE_POWDER.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN);
			this.fillerBlock = Blocks.BONE_BLOCK.getDefaultState();
		}
		//else if(number <10){
			//this.topBlock = Blocks.GRASS.getDefaultState();
			//this.fillerBlock = Blocks.BLACK_SHULKER_BOX.getDefaultState();
		//}
		//else{
			//this.topBlock = Blocks.BLACK_SHULKER_BOX.getDefaultState();
			//this.fillerBlock = Blocks.LEAVES.getDefaultState();
		//}
			
		this.generateBiomeTerrain(worldIn, rand, chunk, num1, num2, num3);
	}

}
