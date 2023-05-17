public class func{
public void onReceive(Container.StartupEvent event){
                    appendInfo(
                            "info.memory.usage",
                            FileUtils.byteCountToDisplaySize((r.totalMemory() - r.freeMemory())),
                            FileUtils.byteCountToDisplaySize(r.maxMemory())
                    );
                    appendInfo("info.jmx.enabled", Messages.get("info.enabled." + isJmxEnabled()));
                    appendInfo("info.app.mode", Messages.get("info.app.mode." + getMode().name().toLowerCase()));
                            .append(Messages.get("info.locations"));
}
}
