//20
public class func{
public void test_LocalPort(){
        ss2.bind(new InetSocketAddress("127.0.0.1", 4343));
        assertEquals(ss2.getLocalPort(), 4343);
        ss2.close();
}
}
