public class func{
public void poll(MonitoredService svc,Map<String,Object> parameters){
                socket.connect(new InetSocketAddress(ipv4Addr, port), timeoutTracker.getConnectionTimeout());
                socket.setSoTimeout(timeoutTracker.getSoTimeout());
                LOG.debug("CitrixMonitor: connected to host: {} on port: {}", host, port);
}
}
