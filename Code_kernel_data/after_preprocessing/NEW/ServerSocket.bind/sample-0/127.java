//127
public class func{
public void createServerSocket(int port,int backlog,InetAddress ifAddress){
        serverSocket.bind(new InetSocketAddress(ifAddress, port), backlog);
}
}
