package dev.dekay.moredefaultarmor.item;

import dev.dekay.moredefaultarmor.MoreDefaultArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDefaultArmor.MODID);

    private final RegistryObject<CreativeModeTab> overworld;
    private final RegistryObject<CreativeModeTab> nether;
    private final RegistryObject<CreativeModeTab> end;

    public ModItemTabs(IEventBus eventBus) {
        this.overworld = CREATIVE_MODE_TABS.register("moredefaultarmor1overworldtab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moredefaultarmor.overworld"))
                .icon(() -> MoreDefaultArmor.getItems().getOakChestplate().get().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(MoreDefaultArmor.getItems().getDirtHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getDirtChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getDirtLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getDirtBoots().get());

                    output.accept(MoreDefaultArmor.getItems().getCobblestoneHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getCobblestoneChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getCobblestoneLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getCobblestoneBoots().get());

                    output.accept(MoreDefaultArmor.getItems().getOakHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getOakChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getOakLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getOakBoots().get());

                    output.accept(MoreDefaultArmor.getItems().getAndesiteHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getAndesiteChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getAndesiteLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getAndesiteBoots().get());

                    output.accept(MoreDefaultArmor.getItems().getDioriteHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getDioriteChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getDioriteLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getDioriteBoots().get());

                    output.accept(MoreDefaultArmor.getItems().getGraniteHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getGraniteChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getGraniteLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getGraniteBoots().get());

                    output.accept(MoreDefaultArmor.getItems().getDeepslateCobbleHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getDeepslateCobbleChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getDeepslateCobbleLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getDeepslateCobbleBoots().get());
                }).build()
        );
        this.nether = CREATIVE_MODE_TABS.register("moredefaultarmor2nethertab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moredefaultarmor.nether"))
                .icon(() -> MoreDefaultArmor.getItems().getNetherrackChestplate().get().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(MoreDefaultArmor.getItems().getNetherrackHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getNetherrackChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getNetherrackLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getNetherrackBoots().get());
                }).build()
        );
        this.end = CREATIVE_MODE_TABS.register("moredefaultarmor3endtab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moredefaultarmor.end"))
                .icon(() -> MoreDefaultArmor.getItems().getEndStoneChestplate().get().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(MoreDefaultArmor.getItems().getEndStoneHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getEndStoneChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getEndStoneLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getEndStoneBoots().get());
                }).build()
        );
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
