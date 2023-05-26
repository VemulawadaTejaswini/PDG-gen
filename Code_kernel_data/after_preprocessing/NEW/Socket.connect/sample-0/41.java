//41
public class func{
public void testConscryptSSLEngineNPNHandshakeBug(){
        socket.connect(new InetSocketAddress("www.google.com", 443));
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
}
}
