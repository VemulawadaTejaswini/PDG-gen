public class func{
public void testIsMockServerCanUpgradeConnectionToSsl(){
            InetSocketAddress address = new InetSocketAddress("127.0.0.1", server.getAddress().getPort());
            socket.connect(address);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                os.write(mockClientData1);
}
}
