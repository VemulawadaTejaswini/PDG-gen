public class func{
public void createManager(final String name,final FactoryData data){
                socket.connect(new InetSocketAddress(data.host, data.port), data.connectTimeoutMillis);
                os = socket.getOutputStream();
                return new TcpSocketManager(name, os, socket, inetAddress, data.host, data.port,
                        data.connectTimeoutMillis, data.delayMillis, data.immediateFail, data.layout);
                LOGGER.error("TcpSocketManager (" + name + ") " + ex);
}
}
