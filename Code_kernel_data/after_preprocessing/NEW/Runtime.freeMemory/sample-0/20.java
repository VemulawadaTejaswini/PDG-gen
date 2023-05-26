//20
public class func{
public void reportMemoryUsage(){
        Runtime r = Runtime.getRuntime();
        return String.valueOf((r.totalMemory() - r.freeMemory()) / (1024 * 1024)) + " MB";
}
}
