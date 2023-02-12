public class func{
public void getMemory(){
    Runtime runtime = Runtime.getRuntime();
    long presentMemory = (runtime.totalMemory() - runtime.freeMemory());
    while (presentMemory < memory)
    {
      memory = presentMemory;

            doGarbageCollection();

      presentMemory = (runtime.totalMemory() - runtime.freeMemory());
    }
}
}
