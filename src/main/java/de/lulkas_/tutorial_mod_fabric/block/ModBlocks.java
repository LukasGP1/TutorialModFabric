package de.lulkas_.tutorial_mod_fabric.block;

import de.lulkas_.tutorial_mod_fabric.TutorialModFabric;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .requiresTool()
    ));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .requiresTool()
    ));

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), AbstractBlock.Settings.create()
            .strength(3f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .requiresTool()
    ));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), AbstractBlock.Settings.create()
            .strength(4f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .requiresTool()
    ));

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), AbstractBlock.Settings.create()
            .strength(2f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .requiresTool()
    ));

    public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), AbstractBlock.Settings.create()
            .strength(4f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .requiresTool()
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialModFabric.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialModFabric.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialModFabric.LOGGER.info("Register Mod Blocks for " + TutorialModFabric.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RUBY_BLOCK);
            entries.add(ModBlocks.RAW_RUBY_BLOCK);
            entries.add(ModBlocks.RUBY_ORE);
            entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
            entries.add(ModBlocks.NETHER_RUBY_ORE);
            entries.add(ModBlocks.END_RUBY_ORE);
        });
    }
}
