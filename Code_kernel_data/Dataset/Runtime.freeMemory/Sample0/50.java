//49
public class func{
	public void getUsedMemory(){
    Runtime r = Runtime.getRuntime();
    long mem = r.totalMemory() - r.freeMemory();
}
}
