public class func{
public void checkMemoryReleased(){
         Runtime runtime = Runtime.getRuntime();
         currentFreeMemory = runtime.freeMemory() + runtime.maxMemory() - runtime.totalMemory();
}
}
