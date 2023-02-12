public class func{
public void pingServer(){
            final Socket socket = new Socket();
            socket.connect(address, 1500);
            socket.close();
}
}
