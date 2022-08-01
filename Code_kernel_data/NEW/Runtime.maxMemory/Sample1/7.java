//6
public class func{
	public void getMemoryUsage(MetricsRecordBuilder rb){
    Runtime runtime = Runtime.getRuntime();
      .addGauge(MemMaxM, runtime.maxMemory() / M);
}
}
