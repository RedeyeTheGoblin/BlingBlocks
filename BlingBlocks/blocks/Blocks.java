package BlingBlocks.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class Blocks {

	public static Block paperwall;
	
	public static void init(){
		paperwall = new BlockPaperwall(BlockPaperwall.ID);
		GameRegistry.registerBlock(paperwall, BlockPaperwall.KEY);
	}
	
	public static void addNames(){
		LanguageRegistry.addName(paperwall, BlockPaperwall.NAME);
	}
	
}
