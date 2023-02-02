//103
public class func{
public void poll(MonitoredService svc,Map<String,Object> parameters){
                socket.connect(new InetSocketAddress(ipv4Addr, port), tracker.getConnectionTimeout());
                socket.setSoTimeout(tracker.getSoTimeout());
                LOG.debug("TcpMonitor: connected to host: {} on port: {}", ipv4Addr, port);
}
}
