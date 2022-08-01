//21
public class func{
	public void removeEldestEntry(Map.Entry<Key,Value> eldest){
          Runtime runtime = Runtime.getRuntime();
          long freeMem = runtime.freeMemory() / 1024 / 1024;
          long maxMem = runtime.maxMemory() / 1024 / 1024;
          long totalMem = runtime.totalMemory() / 1024 / 1024;
          LOG.info( "mem on flush (mb), free: " + freeMem + ", total: " + totalMem + ", max: " + maxMem );
          float percent = (float) totalMem / (float) maxMem;
          if( percent < 0.80F )
            LOG.info( "total mem is {}% of max mem, to better utilize unused memory consider increasing the cache size", (int) ( percent * 100.0F ) );
}
}
