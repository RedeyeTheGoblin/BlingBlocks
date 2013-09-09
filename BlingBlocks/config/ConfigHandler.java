package BlingBlocks.config;

import java.io.File;

import BlingBlocks.blocks.BlockPaperwall;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	public static void init(File file){
	Configuration config = new Configuration(file);
	
	BlockPaperwall.ID = config.getBlock(BlockPaperwall.KEY, BlockPaperwall.DEF_ID).getInt();
	
	config.load();
	
	
	
	config.save();
	
	}
}
