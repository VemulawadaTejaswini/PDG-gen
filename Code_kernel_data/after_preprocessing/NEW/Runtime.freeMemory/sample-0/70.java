//70
public class func{
public void getUsedMemoryMBs(){
  Runtime runtime = Runtime.getRuntime();
  long memory = runtime.totalMemory() - runtime.freeMemory();
}
}
