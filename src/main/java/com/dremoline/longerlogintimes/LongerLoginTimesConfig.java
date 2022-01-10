package com.dremoline.longerlogintimes;

import com.supermartijn642.configlib.ModConfigBuilder;

import java.util.function.Supplier;

/**
 * Created 3/25/2021 by SuperMartijn642
 */
public class LongerLoginTimesConfig {

    public static final Supplier<Integer> loginTimeout;

    static {
        ModConfigBuilder builder = new ModConfigBuilder("longerlogintimes");

        loginTimeout = builder.comment("How long it takes to get a timeout in ticks (20 ticks is 1 second).").define("loginTimeout", 3600, 20, 50000);

        builder.build();
    }

    public static void init() {
        // just to cause this class to load
    }

}
