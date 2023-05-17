public class func{
public void connect(Connection remoteConn){
                int proxyPort = ss.length > 1 ? Integer.parseInt(ss[1]) : 8080;
                s.connect(new InetSocketAddress(ss[0], proxyPort), connectTimeout);
                    doProxyHandshake(s, remoteHostname, remotePort, userauth,
                            connectTimeout);
                    SafeClose.close(s);
}
}
