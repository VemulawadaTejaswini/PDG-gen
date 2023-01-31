//54
public class func{
	public void getMemoryUsed(){
        Runtime rt = Runtime.getRuntime();
        long mem = rt.totalMemory() - rt.freeMemory();
}
}
