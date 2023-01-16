//83
public class func{
	public void call(){
      long totalMemory = runtime.totalMemory();
      long memory = totalMemory - runtime.freeMemory();
      log.info("Approximate memory used: {}MB / {}MB", memory / 1000000L, totalMemory / 1000000L);
}
}
