public class func{
public void testCorrectSocketClose(){
            s.connect(new InetSocketAddress(U.getLocalHost(), PORT), 1000);
            if (!(s instanceof SSLSocket)) {
                s.shutdownInput();

                s.shutdownOutput();
            }
            s.close();
}
}
