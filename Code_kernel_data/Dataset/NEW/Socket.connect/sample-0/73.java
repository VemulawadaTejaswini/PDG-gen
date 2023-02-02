//73
public class func{
public void checkSocketConnectable(String host,int port){
            mySocket.connect(new InetSocketAddress(host, port), 4000);
            mySocket.close();
}
}
