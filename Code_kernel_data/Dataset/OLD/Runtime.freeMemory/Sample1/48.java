//47
public class func{
	public void calculateMemoryAndTimeUsage(ContentReader reader,long startTime){
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        return String.format(USAGE_PATTERN, this.getClass().getName(), reader, (totalMemory - runtime.freeMemory()) / MEGABYTES, totalMemory / MEGABYTES, runtime.maxMemory()
}
}
