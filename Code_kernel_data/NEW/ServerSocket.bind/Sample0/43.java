//42
public class func{
	public void runNativeSide(String[] args){
            serverSocket.bind(new InetSocketAddress(Utils.getLocalHostAddress(), port));
            if(serverSocket != null) {
              try {
                serverSocket.close();
              } catch(Exception ex) {
              }
            }
        if(serverSocket == null) {
          if(exception == null) {
            throw new IllegalStateException("Failed to create the server socket for native side communication!");
          }
          throw exception;
        }
}
}
