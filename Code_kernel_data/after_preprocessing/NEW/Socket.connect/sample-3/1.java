//1
public class func{
public void test_connect_unresolved(){
        InetSocketAddress unresolved = InetSocketAddress.createUnresolved("www.apache.org", 80);
            socket.connect(unresolved);
            socket.connect(unresolved, 123);
}
}
