public class func{
public void checkVitality(String host,int port,int timeout){
                Socket socket = new Socket();
                socket.connect(socketAddress, timeout);
                socket.close();
}
}
