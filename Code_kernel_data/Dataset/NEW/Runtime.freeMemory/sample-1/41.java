//41
public class func{
public void logMemoryStatistics(){
    Runtime runtime = Runtime.getRuntime();
    long freeBytes = runtime.freeMemory();
    long maxBytes = runtime.maxMemory();
    long totalBytes = runtime.totalMemory();
    log.info("Memory (bytes): {} used, {} heap, {} max", usedBytes, totalBytes,
             maxBytes);
}
}
