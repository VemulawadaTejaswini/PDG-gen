public class func{
public void connectSocket(final Socket socket,final String host,final int port,final InetAddress localAddress,final int localPort,final HttpParams params){
        addresses.addAll(Arrays.asList(inetadrs));
        Collections.shuffle(addresses);
        for (final InetAddress remoteAddress: addresses) {
            try {
                sock.connect(new InetSocketAddress(remoteAddress, port), timeout);
                break;
            } catch (final SocketTimeoutException ex) {
                throw new ConnectTimeoutException("Connect to " + remoteAddress + " timed out");
            } catch (final IOException ex) {
                sock = new Socket();
                lastEx = ex;
            }
        }
}
}
