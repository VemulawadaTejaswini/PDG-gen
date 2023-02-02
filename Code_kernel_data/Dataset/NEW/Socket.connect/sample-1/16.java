//16
public class func{
public void borrowSocket(){
    Socket socket = socketBlockingQueue.poll();
    if (socket != null) {
      if (socket.isClosed() || !socket.isConnected() ||
        socket.isInputShutdown() || socket.isOutputShutdown()) {

        try {
          socket.close();
        }
        catch (IOException ioe) {
          if (_log.isWarnEnabled()) {
            _log.warn(ioe, ioe);
          }
        }

        socket = null;
      }
    }
    if (socket == null) {
      socket = new Socket();

      socket.connect(socketAddress);
    }
}
}
