public class func{
public void testRunClient(){
            sock.connect(new InetSocketAddress(HOSTNAME, PORT));
            out = sock.getOutputStream();
            in = new BufferedInputStream(sock.getInputStream());
}
}
