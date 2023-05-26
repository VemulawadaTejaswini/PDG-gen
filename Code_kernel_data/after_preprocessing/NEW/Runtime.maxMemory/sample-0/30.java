//30
public class func{
public void executeOnSlave(){
      Runtime runtime = Runtime.getRuntime();
      slaveState.putPersistent(INITIAL_FREE_MEMORY, runtime.freeMemory() + runtime.maxMemory() - runtime.totalMemory());
}
}
