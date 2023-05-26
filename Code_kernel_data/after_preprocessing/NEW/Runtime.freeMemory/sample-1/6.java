//6
public class func{
public void getAbout(){
  final Runtime runtime = getRuntime();  
  final long freeMemory = runtime.freeMemory();
  vMProperties.setTotalMemory(runtime.totalMemory());
  vMProperties.setUsedMemory(runtime.totalMemory() - freeMemory);
  vMProperties.setFreeMemory(freeMemory);
  vMProperties.setMaxMemory(runtime.maxMemory());
}
}
