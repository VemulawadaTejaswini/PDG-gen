//24
public class func{
	public void run(){
    Runtime r = Runtime.getRuntime();
    long totalMemory = r.totalMemory();
    long freeMemory = r.freeMemory();
    long maxMemory = r.maxMemory();
    Logger.normal(this, "Memory in use: "+SizeUtil.formatSize((totalMemory-freeMemory)));
    if (totalMemory == maxMemory || maxMemory == Long.MAX_VALUE) {
      // jvm have allocated maximum memory
      // totalMemory never decrease, so check it only for once
      if (avgFreeMemory == null)
        avgFreeMemory = new SimpleRunningAverage(3, freeMemory);
      else
        avgFreeMemory.report(freeMemory);
      
      if (avgFreeMemory.countReports() >= 3 && avgFreeMemory.currentValue() < 4 * 1024 * 1024) {//  average free memory < 4 MB
        Logger.normal(this, "Reached threshold, checking for low memory ...");
        System.gc();
        System.runFinalization();

        try {
          Thread.sleep(10); // Force a context switch, finalization need a CS to complete
        } catch (InterruptedException e) {
        }

        freeMemory = r.freeMemory();
        avgFreeMemory.report(freeMemory);
      }
    }
}
}
