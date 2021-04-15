package me.wilux.blockshelf_playground._delete_nmsblocks;

import net.minecraft.server.v1_16_R3.BlockMobSpawner;
import net.minecraft.server.v1_16_R3.Blocks;
import net.minecraft.server.v1_16_R3.Item;

public class OverideSpawner extends BlockMobSpawner {
    public OverideSpawner(net.minecraft.server.v1_16_R3.Block.Info block_info) {
        super(block_info);
    }

    public Item getItem(){
        return Item.getItemOf(Blocks.SPONGE);
    }

}
