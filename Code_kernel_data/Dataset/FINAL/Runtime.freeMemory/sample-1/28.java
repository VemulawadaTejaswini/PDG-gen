public class func{
public void getPhysicalMemInfo(){
        final Runtime runTime = Runtime.getRuntime();
        final long maxMemory = runTime.maxMemory();
        final long totalMemory = runTime.totalMemory();
        final long freeMemory = runTime.freeMemory();
        return NbBundle.getMessage(PlatformUtil.class,
                "PlatformUtil.getPhysicalMemInfo.usageText",
                Long.toString(maxMemory), Long.toString(totalMemory), Long.toString(freeMemory));
}
}
