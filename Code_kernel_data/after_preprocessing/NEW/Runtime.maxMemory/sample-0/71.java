//71
public class func{
public void logMemoryUsage(){
        Runtime runtime = Runtime.getRuntime();
        long maxMemoryBytes = runtime.maxMemory();
        long freeMemoryBytes = runtime.freeMemory();
        long totalMemoryBytes = runtime.totalMemory();
        long maxMemoryMB = toMB(maxMemoryBytes);
        logger.info("Memory Usage: Using %d MB of %d MB (%.2f%%) [%d MB free]", usedMemoryMB, maxMemoryMB, percentageUsed, availableMemoryMB);
}
}
