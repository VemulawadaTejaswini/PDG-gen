public class func{
public void start(){
                        serverSocket.bind(new InetSocketAddress(this.inetAddress, this.port), this.backlog);
                serverSocket.setSoTimeout(this.timeout);
                int serverPort = serverSocket.getLocalPort();
}
}
