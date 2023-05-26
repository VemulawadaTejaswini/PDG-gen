public class func{
public void stopMemoryUsage(String message){
        Runtime rt = Runtime.getRuntime();
        long bytes = rt.totalMemory() - rt.freeMemory() - start.longValue();
        trace(
            "{0} bytes for {1}", new Object[] { Long.valueOf(bytes), message });
}
}
