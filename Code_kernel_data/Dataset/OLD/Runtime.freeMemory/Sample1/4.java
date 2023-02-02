//3
public class func{
	public void checkMemory(String name,MockDAGAppMaster mockApp){
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
        + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        + runtime.freeMemory() / mb);
    System.out.println("##### Total Memory:" + runtime.totalMemory() / mb);
    System.out.println("##### Max Memory:" + runtime.maxMemory() / mb);
}
}
