public class func{
public void setPolicyDirectoryPath(String dbHome){
            Runtime runtime = Runtime.getRuntime();
            logger.debug("Total memory: " + runtime.totalMemory() / 1024);
            logger.debug("Free memory: " + runtime.freeMemory() / 1024);
            logger.debug("Max memory: " + runtime.maxMemory() / 1024);
}
}
