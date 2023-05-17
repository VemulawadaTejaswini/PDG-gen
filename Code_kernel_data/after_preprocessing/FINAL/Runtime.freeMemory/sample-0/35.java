public class func{
public void updateWorkerMetricsToZK(List<MetricInfo> metricList,boolean metricPerf){
          Runtime rt=Runtime.getRuntime();
          long usedMem = rt.totalMemory() - rt.freeMemory();
          workerMetricInfo.setUsedMem(usedMem);   
}
}
