public class func{
public void tearDown(){
        Runtime rt = Runtime.getRuntime();
        long free = rt.freeMemory() / 1024;
        long total = rt.totalMemory() / 1024;
}
}
