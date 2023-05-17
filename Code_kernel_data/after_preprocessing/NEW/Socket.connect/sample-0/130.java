//130
public class func{
public void test_getInputStream(){
            pingClient.connect(new InetSocketAddress(
                    InetAddress.getLocalHost(), pingServer.getLocalPort()));
            Socket worker = pingServer.accept();
            pingServer.close();
}
}
