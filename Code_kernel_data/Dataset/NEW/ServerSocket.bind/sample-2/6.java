//6
public class func{
public void testSetReuseAddress(){
        final ServerSocket serverSock = new ServerSocket();
        serverSock.setReuseAddress(true);
        serverSock.bind(addr);
}
}
