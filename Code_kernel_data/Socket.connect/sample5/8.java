//7
public void doConnect(InetSocketAddress dest,int timeout){
                if (defaultConnectTimeout > 0) {
                    s.connect(dest, defaultConnectTimeout);
                } else {
                    s.connect(dest);
                }
}

