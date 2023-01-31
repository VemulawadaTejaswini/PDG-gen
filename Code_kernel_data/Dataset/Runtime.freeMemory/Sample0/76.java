//75
public class func{
	public void SysInfo(){
        final Runtime runtime = Runtime.getRuntime();
        freeMB = runtime.freeMemory()/MB;
        totalMB = runtime.totalMemory()/MB;
        maxMB = runtime.maxMemory()/MB;
}
}
