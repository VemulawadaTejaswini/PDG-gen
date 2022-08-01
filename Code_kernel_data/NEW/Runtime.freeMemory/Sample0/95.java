//94
public class func{
	public void describeMemoryUsage(){
        Runtime runtime = Runtime.getRuntime();
        long free = runtime.freeMemory();
        return String.format(
            "%sM used, %sM free, %sM max",
            (runtime.totalMemory() - free) / 1000000,
            free / 1000000,
            runtime.maxMemory() / 1000000
        );
}
}
