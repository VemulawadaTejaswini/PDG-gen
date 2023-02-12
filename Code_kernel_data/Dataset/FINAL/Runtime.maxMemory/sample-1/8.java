public class func{
public void getMaxMemory(){
    Runtime rt = Runtime.getRuntime();
    return rt.maxMemory() / MBFactor;
}
}
