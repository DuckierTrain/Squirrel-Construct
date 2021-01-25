package mymod._05_LuckyBlock;

import mymod.Main;
import mymod.CodakidFiles.Codakid;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LuckyBlock extends Block{

	public LuckyBlock() {
		super(Material.ANVIL);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(1.5F);
		this.setHarvestLevel("pickaxe", 3);
	}

	
	
	
	//@Override
	//public void breakBlock(World world, BlockPos pos, IBlockState state)
	//{
//Codakid.spawnBlock(world, pos, Main.LuckyBlock, 1);
	//}
}
