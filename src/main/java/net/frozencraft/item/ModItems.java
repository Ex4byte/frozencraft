package net.frozencraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frozencraft.Frozencraft;
import net.frozencraft.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ALB_HECKE = registerItem("alb_hecke", new Item(new Item.Settings()));
    public static final Item OG_KUSH = registerItem("og_kush", new Item(new Item.Settings()));
    public static final Item KHALIFA_KUSH = registerItem("khalifa_kush", new Item(new Item.Settings()));
    public static final Item SOUR_DIESEL = registerItem("sour_diesel", new Item(new Item.Settings()));
    public static final Item BLUE_DREAM = registerItem("blue_dream", new Item(new Item.Settings()));
    public static final Item WET_ALB_HECKE = registerItem("wet_alb_hecke", new Item(new Item.Settings()));
    public static final Item WET_BLUE_DREAM = registerItem("wet_blue_dream", new Item(new Item.Settings()));
    public static final Item WET_OG_KUSH = registerItem("wet_og_kush", new Item(new Item.Settings()));
    public static final Item WET_KHALIFA_KUSH = registerItem("wet_khalifa_kush", new Item(new Item.Settings()));
    public static final Item WET_SOUR_DIESEL = registerItem("wet_sour_diesel", new Item(new Item.Settings()));
    public static final Item ROLLING_TRAY = registerItem("rolling_tray", new Item(new Item.Settings().maxCount(1)));



    private static Item registerItem(String name, Item item)  {
        return Registry.register(Registries.ITEM, Identifier.of(Frozencraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Frozencraft.LOGGER.info("Registriege Items von " + Frozencraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ALB_HECKE);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OG_KUSH);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KHALIFA_KUSH);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SOUR_DIESEL);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLUE_DREAM);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ROLLING_TABLE);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.WET_ALB_HECKE);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.WET_BLUE_DREAM);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.WET_KHALIFA_KUSH);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.WET_SOUR_DIESEL);
        });ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.WET_OG_KUSH);
        });
    }
}
