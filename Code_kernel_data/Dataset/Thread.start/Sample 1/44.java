//43
public class func{
	public void startLJTHealthMonitor(){
       new LocalJobTrackerHealthMonitor();
   Thread ljtHealthMonitorThread = new Thread(ljtHealthMonitor);
   ljtHealthMonitorThread.setDaemon(true);
   ljtHealthMonitorThread.setName("Local JobTracker Health Monitor");
   ljtHealthMonitorThread.start();
}
}
