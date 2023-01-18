//110
public class func{
	public void poll(MonitoredService svc,Map<String,Object> parameters){
                socket.connect(new InetSocketAddress(ipAddr, port), tracker.getConnectionTimeout());
                socket.setSoTimeout(tracker.getSoTimeout());
                LOG.debug("SmtpMonitor: connected to host: {} on port: {}", ipAddr, port);
}
}
