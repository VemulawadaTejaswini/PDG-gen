//6
public class func{
public void logMemoryForTests(){
        Runtime runtime = Runtime.getRuntime();
        log.info("total memory :" + runtime.totalMemory());
        log.info("unit tests free memory :" + runtime.freeMemory());
}
}
