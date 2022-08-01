//65
public class func{
	public void memUsage(){
    Runtime rt = Runtime.getRuntime();
    return rt.totalMemory() - rt.freeMemory();
}
}
