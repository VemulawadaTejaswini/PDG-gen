public class func{
public void passTcpFileDescriptor(LocalSocket fdSocket,OutputStream outputStream,String dstIp,int dstPort,int connectTimeout){
                    sock.connect(new InetSocketAddress(dstIp, dstPort), connectTimeout);
}
}
