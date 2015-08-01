package be.perrybmwghosttje.examplemod.handlers;

import be.perrybmwghosttje.examplemod.client.gui.GuiDynamo;
import be.perrybmwghosttje.examplemod.client.gui.GuiEngine;
import be.perrybmwghosttje.examplemod.containers.ContainerDynamo;
import be.perrybmwghosttje.examplemod.references.GuiRefences;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityDynamo;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Kevin on 19/07/2015.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        if (id == GuiRefences.DYNAMO.ordinal())
        {
            TileEntityDynamo tileEntityDynamo = (TileEntityDynamo) world.getTileEntity(x, y, z);
            return new ContainerDynamo(entityPlayer.inventory, tileEntityDynamo);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        if (id == GuiRefences.ENGINE.ordinal())
        {
            return new GuiEngine();
        }
        else if (id == GuiRefences.DYNAMO.ordinal())
        {
            TileEntityDynamo tileEntityDynamo = (TileEntityDynamo) world.getTileEntity(x, y, z);
            return new GuiDynamo(entityPlayer.inventory, tileEntityDynamo);
        }
        return null;
    }
}