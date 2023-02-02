//45
public class func{
public void getSizeOfFreeMemory(){
    Runtime r = Runtime.getRuntime();
    long max = r.maxMemory();
    long total = r.totalMemory();
    long free = r.freeMemory();
}
}
