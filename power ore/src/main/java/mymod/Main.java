/*************************************************************
 ****************CODAKID MINECRAFT MODDING********************
 *************************************************************/

package mymod;

import org.apache.logging.log4j.Logger;

import com.jcraft.jorbis.Block;

import mymod.CodakidFiles.Codakid;
import mymod._01_ForgeYourSword.CustomSword;
import mymod._02_PowerOre.CustomIngot;
import mymod._02_PowerOre.CustomOre;
import mymod._02_PowerOre.CustomPickaxe;
import mymod._03_MagicArmor.CustomArmor;
import mymod._05_LuckyBlock.LuckyBlock;
import mymod._06_BrandNewBiomes.CustomBiome;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, useMetadata = true)
public class Main {

    public static final String MODID = "foundations";
    public static final String MODNAME = "Squirrel Mod";
    public static final String VERSION = "0.0.1";
    public static final String ACCEPTED_VERSIONS = "(1.12.2)";
    
    @SidedProxy(clientSide = "mymod.CodakidFiles.ClientProxy", serverSide = "mymod.CodakidFiles.ServerProxy")
    public static CommonProxy proxy;
    @Mod.Instance
    public static Main instance;
    public static Logger logger;
    
    //************* DECLARE VARIABLES ***************
    public static CustomIngot myIngot;
    public static CustomIngot myIngot2;
    public static ToolMaterial myToolMaterial2;
    public static ToolMaterial myToolMaterial;
    public static CustomOre myOre;
    public static CustomPickaxe myPickaxe;
    public static CustomBiome myBiome;
    public static CustomOre myOre2;
    public static CustomPickaxe myPickaxe2;
    public static CustomSword mySword;
    public static LuckyBlock LuckyBlock;
    public static LuckyBlock LuckyBlock2;
    public static CustomArmor myHelmet;
   
   

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    	
    	//************* INITIALIZE MATERIALS ***************
    	myToolMaterial = EnumHelper.addToolMaterial("squirrelium material", 5, 1000000, 30F, 44F, 30);
    	myToolMaterial2 = EnumHelper.addToolMaterial("cursed squirrelium material", 2, 10, 27F, 41F, 27);
           	
    	//************* INITIALIZE VARIABLES ***************
    	myOre = new CustomOre();
    	myIngot = new CustomIngot();
    	myPickaxe = new CustomPickaxe();
    	myBiome = new CustomBiome();
    	myIngot2 = new CustomIngot();
    	myOre2 = new CustomOre();
    	myPickaxe2 = new CustomPickaxe();
    	mySword = new CustomSword();
    	LuckyBlock = new LuckyBlock();
    	LuckyBlock2 = new LuckyBlock();

    								
    	
    	
        proxy.preInit(event);
    }
    

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	Codakid.initModels();
    }

}