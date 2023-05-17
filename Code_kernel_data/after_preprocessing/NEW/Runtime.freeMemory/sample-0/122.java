//122
public class func{
public void checkMemoryUsage(){
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
    long memory = runtime.totalMemory() - runtime.freeMemory();
}
}
