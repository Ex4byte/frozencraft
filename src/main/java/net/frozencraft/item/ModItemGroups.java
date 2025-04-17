package net.frozencraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frozencraft.Frozencraft;
import net.frozencraft.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FROZENCRAFT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Frozencraft.MOD_ID, "frozencraft_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ALB_HECKE))
                    .displayName(Text.translatable("itemgroup.frozencraft.frozencraft_items"))
                    .entries((displayContext, entries) -> {
                        entries.add((ModItems.BLUE_DREAM));
                        entries.add((ModItems.ALB_HECKE));
                        entries.add((ModItems.KHALIFA_KUSH));
                        entries.add((ModItems.OG_KUSH));
                        entries.add((ModItems.SOUR_DIESEL));
                        entries.add((ModItems.WET_ALB_HECKE));
                        entries.add((ModItems.WET_BLUE_DREAM));
                        entries.add((ModItems.WET_OG_KUSH));
                        entries.add((ModItems.WET_KHALIFA_KUSH));
                        entries.add((ModItems.WET_SOUR_DIESEL));

                    })
                    .build());
    public static final ItemGroup FROZENCRAFT_ITEM_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Frozencraft.MOD_ID, "frozencraft_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ALB_HECKE))
                    .displayName(Text.translatable("itemgroup.frozencraft.frozencraft_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add((ModBlocks.ROLLING_TABLE));
                        entries.add((ModBlocks.CELLULOSE_ORE));
                        entries.add((ModBlocks.DEEPSLATE_CELLULOSE_ORE));

                    })
                    .build());

    public static void registerItemGroups() {
        Frozencraft.LOGGER.info("Registriere Itemgruppen" + Frozencraft.MOD_ID);
    }
}
