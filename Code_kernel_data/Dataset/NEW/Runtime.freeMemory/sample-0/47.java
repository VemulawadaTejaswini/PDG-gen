//47
public class func{
public void getUsedMemory(){
        Runtime r = Runtime.getRuntime();
        return r.totalMemory()-r.freeMemory();
}
}
