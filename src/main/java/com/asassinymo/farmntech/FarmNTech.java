package com.asassinymo.farmntech;

import java.util.Optional;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.language.IModInfo;

@Mod(FarmNTech.MODID)
public class FarmNTech {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "farmntech";
    public static final String MOD_NAME = "FarmNTech";
    public static ArtifactVersion VERSION = null;

    public FarmNTech() {
		Optional<? extends ModContainer> opt = ModList.get().getModContainerById(MODID);
		if (opt.isPresent()) {
			IModInfo modInfo = opt.get().getModInfo();
			VERSION = modInfo.getVersion();
		} else {
			LOGGER.warn("Cannot get version from mod info");
		}
    	
        MinecraftForge.EVENT_BUS.register(this);
    }
}
