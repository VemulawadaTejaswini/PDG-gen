public class func{
public void canConnect(Member member){
                    if (log.isDebugEnabled()) {
                        log.debug("HTTP Port=" + httpPort);
                    }
                    if (httpPort != -1) {
                        SocketAddress httpSockaddr = new InetSocketAddress(addr, httpPort);
                        new Socket().connect(httpSockaddr, 10000);
                    }
                    int httpsPort = member.getHttpsPort();
}
}
