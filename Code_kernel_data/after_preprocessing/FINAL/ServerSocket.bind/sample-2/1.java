public class func{
public void testSetReuseAddress(){
        ServerSocket serverSock2 = new ServerSocket();
        serverSock2.setReuseAddress(true);
        serverSock2.bind(addr);
        serverSock2.close();
}
}
