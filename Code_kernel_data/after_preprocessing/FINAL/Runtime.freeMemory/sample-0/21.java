public class func{
public void evaluate(){
                Runtime rt = Runtime.getRuntime();
                long usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024;
                LOG.info("Memory used {}", usedKB);
}
}
