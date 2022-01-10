package com.dremoline.longerlogintimes;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

/**
 * Created 7/7/2020 by SuperMartijn642
 */
@Mod("longerlogintimes")
public class LongerLoginTimes {

    public LongerLoginTimes(){
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "IGNORESERVERONLY", (a, b) -> b));
        LongerLoginTimesConfig.init();
    }

}
