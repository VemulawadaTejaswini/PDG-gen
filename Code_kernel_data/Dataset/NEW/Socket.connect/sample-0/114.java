//114
public class func{
public void pollTimeTcp(MonitoredService svc,Map<String,Object> parameters,PollStatus serviceStatus,TimeoutTracker tracker,InetAddress ipv4Addr,int port,int allowedSkew,boolean persistSkew){
                socket.connect(new InetSocketAddress(ipv4Addr, port), tracker.getConnectionTimeout());
                socket.setSoTimeout(tracker.getSoTimeout());
}
}
