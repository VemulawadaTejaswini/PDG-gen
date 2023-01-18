//96
public class func{
	public void BenchmarkCreator(String label){
    Runtime runtime = Runtime.getRuntime();
    properties.setProperty("java.memory.free",
        String.valueOf(runtime.freeMemory()));
    properties.setProperty("java.memory.total",
        String.valueOf(runtime.totalMemory()));
    properties.setProperty("java.memory.max",
        String.valueOf(runtime.maxMemory()));
    properties.setProperty("java.processors.available",
        String.valueOf(runtime.availableProcessors()));
}
}
