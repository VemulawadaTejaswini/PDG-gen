public class func{
public void logMemory(Logger logger,String message){
    Runtime runtime = Runtime.getRuntime();
    long freeMem = runtime.freeMemory() / 1024 / 1024;
    long maxMem = runtime.maxMemory() / 1024 / 1024;
    long totalMem = runtime.totalMemory() / 1024 / 1024;
    logger.info( message + " (mb), free: " + freeMem + ", total: " + totalMem + ", max: " + maxMem );
}
}
