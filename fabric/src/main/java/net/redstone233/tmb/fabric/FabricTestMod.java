package net.redstone233.tmb.fabric;

import net.redstone233.tmb.core.TestMod;
import net.redstone233.tmb.annotation.Fabric;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Fabric平台入口点
 */
@Fabric
public class FabricTestMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(TestMod.MOD_ID);
    
    @Override
    public void onInitialize() {
        // Fabric特定的初始化
        initializeFabricSpecific();
    }
    
    @Fabric
    private void initializeFabricSpecific() {
        // 这里是Fabric平台特定的初始化代码
        LOGGER.info("Fabric平台初始化成功！");
    }
}