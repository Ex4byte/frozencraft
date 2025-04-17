package net.frozencraft.block;

import net.frozencraft.Frozencraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ROLLING_TABLE = registerBlock("rolling_table",
            new RollingTableBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block ALB_PLANT = registerBlock("alb_plant",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.GRASS)));

    public static final Block CELLULOSE_ORE = registerBlock("cellulose_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.LANTERN)));
    public static final Block DEEPSLATE_CELLULOSE_ORE = registerBlock("deepslate_cellulose_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.LANTERN)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Frozencraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Frozencraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Frozencraft.LOGGER.info("Registriert Modblocks" + Frozencraft.MOD_ID);
    }
}
