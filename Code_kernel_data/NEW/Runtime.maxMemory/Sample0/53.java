//52
public class func{
	public void test(){
        final Runtime runtime = Runtime.getRuntime();
        System.out.println("maxMemory = " + runtime.maxMemory());
        System.out.println("freeMemory = " + runtime.freeMemory());
        System.out.println("totalMemory = " + runtime.totalMemory());
}
}
