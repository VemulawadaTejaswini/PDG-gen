public class func{
public void run(){
            serverSocket.bind(new InetSocketAddress(port));
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            socket.shutdownOutput();
}
}
