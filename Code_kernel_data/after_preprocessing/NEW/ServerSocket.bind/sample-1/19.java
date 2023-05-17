//19
public class func{
public void testOpenServerSocket(final String host){
      serverSocket = new ServerSocket();
      serverSocket.bind(socketAddress);
      if (serverSocket != null) {
        try {
          serverSocket.close();
        } catch (Exception e) {
          //ignore
        }
      }
}
}
