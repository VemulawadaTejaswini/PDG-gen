//39
public class func{
public void usedMemory(){
    Runtime runtime = Runtime.getRuntime();
    return runtime.totalMemory() - runtime.freeMemory();
}
}
