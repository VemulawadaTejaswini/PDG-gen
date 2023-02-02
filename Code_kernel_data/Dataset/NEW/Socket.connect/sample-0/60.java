//60
public class func{
public void sendAndReceive(String input,int port){
        soc.connect(new InetSocketAddress("localhost", port));
            os = soc.getOutputStream();
}
}
