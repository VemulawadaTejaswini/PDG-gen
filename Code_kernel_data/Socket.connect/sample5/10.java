//9
public void connect(InetAddress ipAddress,int port,int connectTimeout,ConnectionWatcher watcher,boolean clientToServer,int bufferSize,boolean useSSL_ignored){
    if (connectTimeout > 0) {
      socket.connect(addr, connectTimeout);
    } else {
      socket.connect(addr);
    }
}

