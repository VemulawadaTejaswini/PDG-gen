//38
public class func{
	public void updateMem(){
    Runtime rt = Runtime.getRuntime();
    long vmAlloc = rt.totalMemory() - rt.freeMemory();
}
}
