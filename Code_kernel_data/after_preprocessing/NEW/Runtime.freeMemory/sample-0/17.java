//17
public class func{
public void getChildTest(){
    Runtime runtime = Runtime.getRuntime();
    LOG.info(String.format("Used Memory = %dB when number of files = %d", runtime.totalMemory()
        - runtime.freeMemory(), nFiles));
}
}
