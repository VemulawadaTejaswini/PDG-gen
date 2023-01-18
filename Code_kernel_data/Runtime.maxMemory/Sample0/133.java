//132
public class func{
	public void execute(JobExecutionContext jobExecutionContext){
      m_datastore.putDataPoint("kairosdb.jvm.free_memory",
          tags, m_dataPointFactory.createDataPoint(timestamp, runtime.freeMemory()));
      m_datastore.putDataPoint("kairosdb.jvm.total_memory",
          tags, m_dataPointFactory.createDataPoint(timestamp, runtime.totalMemory()));
      m_datastore.putDataPoint("kairosdb.jvm.max_memory",
          tags, m_dataPointFactory.createDataPoint(timestamp, runtime.maxMemory()));
}
}
