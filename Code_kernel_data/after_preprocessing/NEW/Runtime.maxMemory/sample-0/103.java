//103
public class func{
public void SeededSecureRandom(){
            Runtime runtime = Runtime.getRuntime();
            setSeed(runtime.freeMemory());
            setSeed(runtime.maxMemory());
            setSeed(runtime.totalMemory());
}
}
