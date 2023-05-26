public class func{
public void Acceptor(LogConfig config,Queue<SocketChannel> acceptQueue,Selector selector){
            serverSocket.bind(new InetSocketAddress(config.port),
                    config.listenQSize);
}
}
