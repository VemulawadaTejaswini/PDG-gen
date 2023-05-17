//74
public class func{
public void drawJVMStatsBox(HTMLNode jvmStatsInfobox,boolean advancedModeEnabled){
    Runtime rt = Runtime.getRuntime();
    long freeMemory = rt.freeMemory();
    long totalMemory = rt.totalMemory();
    long maxMemory = rt.maxMemory();
    int availableCpus = rt.availableProcessors();
}
}
