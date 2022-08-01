//76
public class func{
	public void run(HttpServletRequest request,HttpServletResponse response){
    String freeMemory = nf.format(runtime.freeMemory());
    String totalMemory = nf.format(runtime.totalMemory());
    String maxMemory = nf.format(runtime.maxMemory());
}
}
