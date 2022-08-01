//90
public class func{
	public void printMemoryFootprint(){
      Runtime run = Runtime.getRuntime();
      String memoryInfo = "Memory - free: " + kbString(run.freeMemory()) + " - max:" + kbString(run.maxMemory()) + "- total:" + kbString(run.totalMemory());
}
}
