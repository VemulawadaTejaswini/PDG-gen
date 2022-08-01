//107
public class func{
	public void getMemoryInUse(){
    Runtime runtime = Runtime.getRuntime();
    long total = runtime.totalMemory();
    long free = runtime.freeMemory();
}
}
