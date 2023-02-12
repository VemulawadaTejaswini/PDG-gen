public class func{
public void used(){
    Runtime runtime = Runtime.getRuntime ();
    return runtime.totalMemory() - runtime.freeMemory();
}
}
