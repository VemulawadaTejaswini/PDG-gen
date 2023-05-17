public class func{
public void getValue(){
        Runtime runtime = Runtime.getRuntime();
        return Long.valueOf(runtime.freeMemory());
}
}
