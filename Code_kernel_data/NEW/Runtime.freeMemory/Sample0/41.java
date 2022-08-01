//40
public class func{
	public void memoryUsed(){
    final Runtime runtime = Runtime.getRuntime();
    long mem= runtime.totalMemory()-runtime.freeMemory();
    do {
      Thread.sleep(50);
      System.gc();
      mem= newMem; 
      newMem= runtime.totalMemory()-runtime.freeMemory();
    } while (newMem < mem && ++i<5);
}
}
