//139
public class func{
public void getMemInfo(){
    rt = Runtime.getRuntime();
    rt.gc();
        + rt.totalMemory()
        + rt.freeMemory();
}
}
