//109
public class func{
public void getMemory(){
        Runtime runtime = Runtime.getRuntime();
        long jvmTotal = runtime.totalMemory() / 1024 / 1024;
        long jvmFree = runtime.freeMemory() / 1024 / 1024;
}
}
