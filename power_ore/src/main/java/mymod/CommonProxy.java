package mymod;

import mymod.CodakidFiles.Codakid;
import mymod._02_PowerOre.CustomWorldGen;
import mymod._04_CreateACreature.CustomMob;
import mymod._04_CreateACreature.RenderCustomMob;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.awt.Color;

@Mod.EventBusSubscriber
public class CommonProxy {
    
    public void preInit(FMLPreInitializationEvent e) {
    	
    	//************* REGISTER BLOCKS AND ITEMS ***************
    	Codakid.registerItem(Main.myPickaxe2, "my_pickaxe2");
    	Codakid.registerItem(Main.myPickaxe, "my_pickaxe");
    	Codakid.registerBlock(Main.myOre, "my_ore");
    	Codakid.registerItem(Main.myIngot, "my_ingot");
    	Codakid.registerItem(Main.myIngot2, "my_ingot2");
	    Codakid.registerBlock(Main.myOre2, "my_ore2");
	    Codakid.registerItem(Main.mySword, "my_Sword");
	    Codakid.registerBlock(Main.LuckyBlock, "lucky_block");
        Codakid.registerBlock(Main.LuckyBlock2, "lucky_block2");
	   
    	
    	
    	//************* REGISTER MOBS ***************
       Codakid.registerMobEntity(CustomMob.class, "my_mob", RenderCustomMob.FACTORY, 0x007F46,0x856565);
    	
    	
    	
    	// ************* MAKE RENDERERS ***************
    	
    	
        
        //************* REGISTER ENTITIES ***************
    	
    	
        
        //************* REGISTER BIOMES ***************
    	Codakid.registerBiome(Main.myBiome);
    	
    	
    }

    public void init(FMLInitializationEvent e) {
        
        //************* REGISTER WORLD GEN ***************
    	GameRegistry.registerWorldGenerator(new CustomWorldGen(), 0);


        
    	//************* SMELTING RECIPES ***************
    	GameRegistry.addSmelting(Main.myOre, new ItemStack(Main.myIngot, 3), 5.0F );
    	GameRegistry.addSmelting(Main.myOre, new ItemStack(Main.myIngot2,1), 1F);
    
    	
    	
    	
    	//************* BIOME SETUP ***************
    	BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(Main.myBiome, 1024));
    	BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(Main.myBiome, 1024));
    	BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(Main.myBiome, 1024));
    	BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(Main.myBiome, 1024));
    	BiomeManager.addSpawnBiome(Main.myBiome);
    


    	
    }
    

    public void postInit(FMLPostInitializationEvent e) {
    	
    }
    
    
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
    	Codakid.doBiomeRegistry(event);
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	Codakid.doBlockRegistry(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Codakid.doItemRegistry(event);
    }

}
