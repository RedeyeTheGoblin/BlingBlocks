package BlingBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import BlingBlocks.Modi;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPaperwall extends Block{
	
	public static int ID;
	public static int DEF_ID = 2100;
	public static final String KEY = "Paperwall";
	public static final String UNLOCALIZED = "Paperwall";
	public static final String NAME = "Paper wall";
	public static final String TEXTURE = "paperwall";
	
	
	public BlockPaperwall(int id){
		super(id, Material.cloth);
		
		setCreativeTab(CreativeTabs.tabDecorations);
		setHardness(1F);
		setStepSound(Block.soundClothFootstep);
		setUnlocalizedName(UNLOCALIZED);
	
	}

	@SideOnly(Side.CLIENT)
	private Icon pwallside;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		pwallside = register.registerIcon(Modi.TEXTURES+":"+TEXTURE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta){
		return pwallside; 
	}
	
}
