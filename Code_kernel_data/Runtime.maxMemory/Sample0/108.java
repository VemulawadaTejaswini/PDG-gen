//107
public class func{
	public void dispatchLoop(){
      long currentMemorySize = rt.totalMemory();
      long memoryUsed = currentMemorySize - rt.freeMemory();
      long maxMemory = rt.maxMemory();
      while (memoryUsed > maxMemory * PUSHBACK_THRESHOLD_RATIO) {
        if (lastPushbackLog < (lastPushbackLog = System.currentTimeMillis()) - 60 * 1000) {
          LOG.warn(
              "In pushback, not accepting new work. Using {}MB / {}MB ({}MB currently used by JVM)",
              memoryUsed >> 20, maxMemory >> 20, currentMemorySize >> 20);
          System.gc();
        }
        sleep(10);
      }
}
}
