//110
public class func{
public void analyzeMemory(){
    Runtime runtime = Runtime.getRuntime();  
    double allocatedMemory = runtime.totalMemory() / (double) 1024;  
    double freeMemory = runtime.freeMemory() / (double) 1024;
}
}
