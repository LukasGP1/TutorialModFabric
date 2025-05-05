package de.lulkas_.tutorial_mod_fabric.item;

import de.lulkas_.tutorial_mod_fabric.TutorialModFabric;
import de.lulkas_.tutorial_mod_fabric.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialModFabric.MOD_ID, "ruby_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.tutorial_mod_fabric.ruby_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.CHISEL);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);
                    })
                    .build()
    );

    public static void registerModItemGroups() {
        TutorialModFabric.LOGGER.info("Registering Mod Item Groups for " + TutorialModFabric.MOD_ID);
    }
}
