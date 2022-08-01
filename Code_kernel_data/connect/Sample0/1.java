//0
public class func{
	public void createSocket(InetAddress address,int port,InetAddress myAddress,int myPort){
        if (myAddress != null)
        {
            sock = new Socket(address, port, myAddress, myPort);
        }
        else if (port != 0)
        {
            // myAddress is null (i.e. any) but we have a port number
            sock = new Socket();
            sock.bind(new InetSocketAddress(port));
            sock.connect(new InetSocketAddress(address, port));
        }
        else
        {
            sock = new Socket(address, port);
        }
        setTrafficClass(sock);
}
}
