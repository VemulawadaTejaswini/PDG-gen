//89
public class func{
	public void availableMemory(){
    Runtime rt = Runtime.getRuntime();
    return rt.maxMemory() - rt.totalMemory() + rt.freeMemory();
}
}
