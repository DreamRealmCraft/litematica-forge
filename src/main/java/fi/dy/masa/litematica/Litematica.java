package fi.dy.masa.litematica;

import fi.dy.masa.litematica.config.Configs;
import fi.dy.masa.malilib.event.InitializationHandler;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Litematica
{
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);

    public Litematica()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
    }

    public static void debugLog(String msg, Object... args)
    {
        if (Configs.Generic.DEBUG_LOGGING.getBooleanValue())
        {
            Litematica.logger.info(msg, args);
        }
    }
}
