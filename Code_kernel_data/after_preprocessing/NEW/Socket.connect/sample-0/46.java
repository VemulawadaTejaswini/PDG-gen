//46
public class func{
public void call(){
            final SocketAddress socketAddress = new InetSocketAddress(
                streamHost.getAddress(), streamHost.getPort());
            socket.connect(socketAddress);
            if (!establish(socket)) {

              // initialization failed, close socket
              socket.close();
              throw new XMPPException(
                  "establishing connection to SOCKS5 proxy failed");

            }
}
}
