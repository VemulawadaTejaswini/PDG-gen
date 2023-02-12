public class func{
public void debugHeapUsage(){
        Runtime runtime = Runtime.getRuntime();
        X.println('<' + DEBUG_DATE_FMT.format(new Date(System.currentTimeMillis())) + "><DEBUG><" +
            Thread.currentThread().getName() + "> Heap stats [free=" + runtime.freeMemory() / (1024 * 1024) +
            "M, total=" + runtime.totalMemory() / (1024 * 1024) + "M]");
}
}
