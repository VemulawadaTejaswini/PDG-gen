//36
public class func{
	public void serverRunning(String host,int port,Consumer<Throwable> onError){
            socket.connect(new InetSocketAddress(host, port), 500);
            if (socket.isConnected()) {
                try {
                    socket.close();
                } catch (IOException ignored) {
                    log.debug("[IGNORED] Exception closing server test socket: ", ignored);
                }
                return true;
            }
}
}
