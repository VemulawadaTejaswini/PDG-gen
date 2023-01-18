//131
public class func{
	public void connectSocket(Socket sock,String host,int port,InetAddress localAddress,int localPort,HttpParams params){
        addresses.addAll(Arrays.asList(inetadrs));
        Collections.shuffle(addresses);
        for (InetAddress remoteAddress: addresses) {
            try {
                sock.connect(new InetSocketAddress(remoteAddress, port), timeout);
                break;
            } catch (SocketTimeoutException ex) {
                throw new ConnectTimeoutException("Connect to " + remoteAddress + " timed out");
            } catch (IOException ex) {
                // create new socket
                sock = new Socket();
                // keep the last exception and retry
                lastEx = ex;
            }
        }
}
}
