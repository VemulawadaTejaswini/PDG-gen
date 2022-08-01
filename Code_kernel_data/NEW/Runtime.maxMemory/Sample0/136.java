//135
public class func{
	public void printAndLogVersion(){
    Runtime runtime = Runtime.getRuntime();
    Log.info ("Java availableProcessors: " + runtime.availableProcessors());
    Log.info ("Java heap totalMemory: " + String.format("%.2f gb", runtime.totalMemory() / ONE_GB));
    Log.info ("Java heap maxMemory: " + String.format("%.2f gb", runtime.maxMemory() / ONE_GB));
}
}
