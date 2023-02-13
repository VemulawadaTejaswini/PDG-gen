public class func{
public void testSend(){
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long freeStart = runtime.freeMemory();
        long maxStart = runtime.maxMemory();
}
}
