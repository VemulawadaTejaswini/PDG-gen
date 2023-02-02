//38
public class func{
	public void getAvailableMemory(){
    final Runtime r = Runtime.getRuntime();
    final long usedMem = r.totalMemory() - r.freeMemory();
    return r.maxMemory() - usedMem;
}
}
