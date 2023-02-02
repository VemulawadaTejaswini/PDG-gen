//60
public class func{
	public void getUsedMemory(){
    Runtime runtime = Runtime.getRuntime();
    return runtime.totalMemory() - runtime.freeMemory();
}
}
