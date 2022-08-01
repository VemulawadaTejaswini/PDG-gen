//30
public class func{
	public void start(){
            Thread t = new Thread(new CpuStatRunnable(), "ThreadCpuStatsCollector");
            t.setDaemon(true);
            t.start();
}
}
