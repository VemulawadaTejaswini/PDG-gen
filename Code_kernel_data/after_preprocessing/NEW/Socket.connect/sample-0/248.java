//248
public class func{
public void connect(InetAddress ipAddress,int port,int i,ConnectionWatcher watcher,boolean clientToServer){
    SocketAddress addr = new InetSocketAddress(ipAddress, port);
    socket.connect(addr);
}
}
