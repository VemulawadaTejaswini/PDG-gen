//36
public class func{
	public void test(String[] args){
        Runtime rt = Runtime.getRuntime();
        long freeMin = rt.freeMemory();
        System.out.println("DEBUG: Free1: "+freeMin+", total: "+rt.totalMemory()+", max: "+rt.maxMemory());
}
}
