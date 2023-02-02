//2
public class func{
public void stop(){
    Runtime r = Runtime.getRuntime();
    Logs.info("Final Memory: " + (r.totalMemory() - r.freeMemory()) / mb + "M/" + r.totalMemory() / mb + "M");
}
}
