//9
public class func{
	public void reportMemoryStats(final String stage){
        final Runtime runtime = Runtime.getRuntime();
        log.info(stage + " freeMemory: " + runtime.freeMemory() + "; totalMemory: " + runtime.totalMemory() +
                "; maxMemory: " + runtime.maxMemory());
}
}
