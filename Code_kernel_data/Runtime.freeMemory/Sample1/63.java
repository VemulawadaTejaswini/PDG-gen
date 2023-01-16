//62
public class func{
	public void run(HttpServletRequest req,HttpServletResponse res){
    String freeMemory = nf.format(runtime.freeMemory());
    String totalMemory = nf.format(runtime.totalMemory());
    String maxMemory = nf.format(runtime.maxMemory());
    _log.debug(
      "Memory Usage:\t" + freeMemory + "\t" + totalMemory + "\t" +
        maxMemory);
}
}
