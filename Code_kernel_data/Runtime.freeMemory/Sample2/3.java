//2
public class func{
	public void getCurrentVertex(){
        Runtime runtime = Runtime.getRuntime();
        timedLogger.info(
            "read " + recordCount + " records. Memory: " +
            (runtime.totalMemory() / gb) +
            "GB total = " +
            ((runtime.totalMemory() - runtime.freeMemory()) / gb) +
            "GB used + " + (runtime.freeMemory() / gb) +
            "GB free, " + (runtime.maxMemory() / gb) + "GB max");
}
}
