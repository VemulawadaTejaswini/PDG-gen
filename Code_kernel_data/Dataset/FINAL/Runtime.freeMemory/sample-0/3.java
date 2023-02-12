public class func{
public void create(){
        Runtime runtime = Runtime.getRuntime();
        return new MemoryUseMeasurement(runtime.totalMemory() - runtime.freeMemory(), runtime.maxMemory());
}
}
