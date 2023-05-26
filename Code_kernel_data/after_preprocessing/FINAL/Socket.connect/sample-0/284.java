public class func{
public void sendcmd(String cmd){
      InetSocketAddress local = new InetSocketAddress(0);
      s.bind(local);
      s.connect(server, PROXY_CONNECT_TIMEOUT);
      InputStream is = s.getInputStream();
      OutputStream os = s.getOutputStream();
}
}
