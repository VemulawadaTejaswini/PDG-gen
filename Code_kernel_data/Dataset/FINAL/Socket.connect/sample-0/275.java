public class func{
public void portReachable(){
            socket.connect(
                new InetSocketAddress(componentConfiguration.getAddress(), componentConfiguration.getPort()),
                CONNECTION_TIMEOUT);
}
}
