//73
public class func{
public void dumpMemStats(){
    Runtime runtime = Runtime.getRuntime();
    final long maxMemory = runtime.maxMemory();
    final long allocatedMemory = runtime.totalMemory();
    final long freeMemory = runtime.freeMemory();
}
}
