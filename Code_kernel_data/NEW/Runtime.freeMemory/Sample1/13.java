//12
public class func{
	public void getHeapMemoryUsage(){
  Runtime runtime = Runtime.getRuntime();
  long totalMem = runtime.totalMemory();
  return new MemoryUsage(-1L, totalMem - runtime.freeMemory(), totalMem,
          runtime.maxMemory());
}
}
