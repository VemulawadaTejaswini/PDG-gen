//3
public class func{
	public void LeaseHolder(ThreadGroup threadGroup){
      leaseMonitorThread = new Thread(threadGroup, new LeaseMonitor());
      leaseMonitorThread = new Thread(new LeaseMonitor());
    leaseMonitorThread.start();
}
}
