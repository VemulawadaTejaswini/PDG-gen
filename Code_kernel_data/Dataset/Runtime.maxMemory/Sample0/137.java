//136
public class func{
	public void testSend(){
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // i know, i know...
        long freeStart = runtime.freeMemory();
        long maxStart = runtime.maxMemory();
}
}
