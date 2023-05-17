public class func{
public void reportStatus(final HTTPRequestContext context,final HttpServletRequest request,final HttpServletResponse response){
        final Runtime runtime = Runtime.getRuntime();
        memory.put("totoal", runtime.totalMemory() / mb);
        memory.put("free", runtime.freeMemory() / mb);
        memory.put("used", (runtime.totalMemory() - runtime.freeMemory()) / mb);
        memory.put("max", runtime.maxMemory() / mb);
}
}
