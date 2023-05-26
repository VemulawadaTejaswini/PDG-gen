public class func{
public void TcpRpcClient(InetAddress addr,int port,InetAddress fromAddr,int fromPort,int maxRpcSize){
     sock.connect( new InetSocketAddress( addr, port));
    m_client = new TcpRpcPacketHandler(sock, maxRpcSize);
}
}
