//63
public class func{
	public void memoryUsed(){
        Runtime rt = Runtime.getRuntime();
        return rt.totalMemory() - rt.freeMemory();
}
}
