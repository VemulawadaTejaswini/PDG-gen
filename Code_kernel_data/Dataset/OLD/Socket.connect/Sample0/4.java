//3
public class func{
	public void create(String host,int port,StringBuffer otherHeaders,BooleanHolder useFullURL){
                        baseSocket.connect(new InetSocketAddress(host, port), timeout);
                        baseSocket.connect(new InetSocketAddress(host, port), timeout);
                            int i = tunnelInputStream.read();
                            if (i < 0) {
                                throw new IOException("Unexpected EOF from proxy");
                            }
                            if (i == '\n') {
                                headerDone = true;
                                ++newlinesSeen;
                            } else if (i != '\r') {
                                newlinesSeen = 0;
                                if (!headerDone) {
                                    replyStr += String.valueOf((char) i);
                                }
                            }
                        if (!(StringUtils.startsWithIgnoreWhitespaces("HTTP/1.0 200", replyStr)
                                || StringUtils.startsWithIgnoreWhitespaces("HTTP/1.1 200", replyStr))) {
                            throw new IOException();
                        }
                    if (baseSocket != null) {
                        // End of condensed reflective tunnel handshake method
                        s = sslFactory.createSocket(baseSocket, host, port, true);
                        ((SSLSocket) s).startHandshake();
                        break;
                    }
}
}
