//14
public class func{
	public void memoryInfo(){
        Runtime runtime = Runtime.getRuntime();
        return new MemoryInfo(runtime.totalMemory(), runtime.freeMemory(), runtime.maxMemory());
}
}
