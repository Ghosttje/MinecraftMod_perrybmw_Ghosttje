package be.perrybmwghosttje.examplemod.blocks;

import be.perrybmwghosttje.examplemod.ExampleMod;
import be.perrybmwghosttje.examplemod.core.CreativeTabs;
import be.perrybmwghosttje.examplemod.references.BlockReferences;
import be.perrybmwghosttje.examplemod.references.GuiRefences;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityAutoMiner;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityWirlessCharger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Kevin on 11/07/2015.
 */
public class BlockWirelessCharger extends BlockTileEntityBase {

    public BlockWirelessCharger() {
        super(Material.anvil);
        setHardness(5.0f);
        setBlockName(BlockReferences.WirelessCharger.NAME);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return BlockReferences.WirelessCharger.RenderId;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityWirlessCharger();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float offX, float offY, float offZ) {
        player.openGui(ExampleMod.instance, GuiRefences.WIRLESSCHARGER.ordinal(), world, x, y, z);
        return true;
    }
}