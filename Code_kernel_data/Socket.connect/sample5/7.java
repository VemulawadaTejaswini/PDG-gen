//6
public void doConnect(InetSocketAddress dest,int timeout){
        if (timeout >= 0) {
            s.connect(dest, timeout);
        } else {
            if (connectTimeout >= 0) {
                s.connect(dest, connectTimeout);
            } else {
                if (defaultConnectTimeout > 0) {
                    s.connect(dest, defaultConnectTimeout);
                } else {
                    s.connect(dest);
                }
            }
        }
}

