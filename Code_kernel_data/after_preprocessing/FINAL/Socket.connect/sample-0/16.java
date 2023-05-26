public class func{
public void getServerStats(String server,int timeout){
    InetSocketAddress sockAddr = new InetSocketAddress(host, port);
    socket.connect(sockAddr, timeout);
    socket.setSoTimeout(timeout);
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket
        .getInputStream()));
}
}
