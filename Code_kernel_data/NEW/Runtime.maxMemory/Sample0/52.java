//51
public class func{
	public void getMemoryUsage(){
        Runtime rt = Runtime.getRuntime();
        long max = rt.maxMemory();
        long free = rt.freeMemory();
        long total = rt.totalMemory();
}
}
