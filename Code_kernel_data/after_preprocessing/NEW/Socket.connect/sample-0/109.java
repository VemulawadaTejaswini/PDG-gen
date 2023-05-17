//109
public class func{
public void poll(MonitoredService svc,Map<String,Object> parameters){
            socket.connect(new InetSocketAddress((InetAddress) iface.getAddress(), ldapPort), tracker.getConnectionTimeout());
            socket.setSoTimeout(tracker.getSoTimeout());
            LOG.debug("LdapMonitor: connected to host: {} on port: {}", address, ldapPort);
}
}
