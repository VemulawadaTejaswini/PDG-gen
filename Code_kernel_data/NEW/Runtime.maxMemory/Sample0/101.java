//100
public class func{
	public void list(){
        Runtime runtime = Runtime.getRuntime();
        put(l, "os.memory.free",
               Long.toString(runtime.freeMemory() / mb) + "MB");
        put(l, "os.memory.max",
               Long.toString(runtime.maxMemory() / mb) + "MB");
        put(l, "os.memory.total",
               Long.toString(runtime.totalMemory() / mb) + "MB");
}
}
