package mymod._02_PowerOre;

import mymod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe; 

public class CustomPickaxe2 extends ItemPickaxe{
	
	public CustomPickaxe2() {
		super(Main.myToolMaterial2);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
