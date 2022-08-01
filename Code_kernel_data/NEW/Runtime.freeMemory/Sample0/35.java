//34
public class func{
	public void printMemoryUsage(int cacheSize){
      Runtime runtime = Runtime.getRuntime();
      long usedMemory = runtime.totalMemory() - runtime.freeMemory();
      log.debugf("Used memory = %d, cache size = %d", usedMemory, cacheSize);
}
}
