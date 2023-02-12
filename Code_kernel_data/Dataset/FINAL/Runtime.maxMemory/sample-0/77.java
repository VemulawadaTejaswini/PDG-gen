public class func{
public void put(Key key,Value value){
      Runtime runtime = Runtime.getRuntime();
      long freeMem = runtime.freeMemory() / 1024 / 1024;
      long maxMem = runtime.maxMemory() / 1024 / 1024;
      long totalMem = runtime.totalMemory() / 1024 / 1024;
      LOG.info( "mem on flush (mb), free: " + freeMem + ", total: " + totalMem + ", max: " + maxMem );
}
}
