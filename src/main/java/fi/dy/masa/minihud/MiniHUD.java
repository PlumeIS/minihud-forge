package fi.dy.masa.minihud;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;
import fi.dy.masa.minihud.config.Configs;


@Mod("minhud")
public class MiniHUD
{
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
    public static final String CHANNEL_CARPET_CLIENT = "CarpetClient";

    public MiniHUD()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
    }

    public static void printDebug(String key, Object... args)
    {
        if (Configs.Generic.DEBUG_MESSAGES.getBooleanValue())
        {
            logger.info(key, args);
        }
    }
}
