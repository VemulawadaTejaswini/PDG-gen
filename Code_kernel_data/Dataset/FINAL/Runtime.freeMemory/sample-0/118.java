public class func{
public void retrieve(){
        Runtime runtime = Runtime.getRuntime();
        model.put("total", new Long(runtime.totalMemory()));
        model.put("free", new Long(runtime.freeMemory()));
}
}
