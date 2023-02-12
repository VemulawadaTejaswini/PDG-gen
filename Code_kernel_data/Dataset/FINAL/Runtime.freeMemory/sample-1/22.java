public class func{
public void logMemoryStats(final Log log){
        final Runtime runtime = Runtime.getRuntime();
        log.info("freeMemory: " + runtime.freeMemory() +
                "; totalMemory: " + runtime.totalMemory() +
                "; maxMemory: " + runtime.maxMemory() +
                "; output buffer size: " + outputBuffer.size() +
                "; duplicate queue size: " + toMarkQueue.size()
        );
}
}
