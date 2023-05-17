public class func{
public void processCIFSServerConfig(){
                        InetSocketAddress sockAddr = new InetSocketAddress(winsAddr, RFCNetBIOSProtocol.NAME_PORT);
                        winsSocket.connect(sockAddr, 3000);
                        winsSocket.close();
}
}
