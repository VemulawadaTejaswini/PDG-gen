//92
public class func{
	public void executeOnSlave(){
         Runtime runtime = Runtime.getRuntime();
         long availableMemory = runtime.freeMemory() + runtime.maxMemory() - runtime.totalMemory();
}
}
