//135
public class func{
public void getFreeMemory(){
    Runtime rt = Runtime.getRuntime();
    return rt.freeMemory() / MBFactor;
}
}
