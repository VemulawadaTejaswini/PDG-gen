//66
public class func{
public void runGCUsedMemory(){
    Runtime runtime = Runtime.getRuntime();
    long usedMem1 = runtime.totalMemory() - runtime.freeMemory();
}
}
