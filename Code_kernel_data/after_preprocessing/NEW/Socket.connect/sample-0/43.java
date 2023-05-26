//43
public class func{
public void connectAndGetResponse(final InetAddress address,final Integer port,final int timeout){
                final InetSocketAddress inetSocketAddress = new InetSocketAddress(address, port.intValue());
                socket.connect(inetSocketAddress, timeout);
                socket.setSoTimeout(timeout);
                isr = new InputStreamReader(socket.getInputStream());
                lineRdr = new BufferedReader(isr);
                final String banner = lineRdr.readLine();
}
}
