//94
public class func{
public void testSocketSimple(){
        for (port = 9900; port < 9999; port++) {
            try {
                ss.bind(new InetSocketAddress("127.0.0.1", port));
                lastEx = null;
                break;
            } catch (IOException ex) {
                lastEx = ex;
            }
        }
}
}
