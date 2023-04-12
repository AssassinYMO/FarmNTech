package com.asassinymo.farmntech;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(FarmNTech.MOD_ID)
public class FarmNTech {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "farmntech";
    public static final String MOD_NAME = "FarmNTech";
    public static final String VERSION = "1.0.0";

    public FarmNTech() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
