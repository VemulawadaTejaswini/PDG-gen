public class func{
public void invoke(Varargs args){
        Runtime rt = Runtime.getRuntime();
        long used = rt.totalMemory() - rt.freeMemory();
        return varargsOf(valueOf(used/1024.), valueOf(used%1024));
}
}
