public class func{
public void buildRuntimeInfo(LocalizedResource locallangUtil){
        Runtime rt = Runtime.getRuntime();
        rt.gc();
        long totalmem = rt.totalMemory();
        long freemem = rt.freeMemory();
}
}
