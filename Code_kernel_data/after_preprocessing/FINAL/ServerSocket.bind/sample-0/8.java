public class func{
public void connect(BusAddress address,int timeout){
            ss.bind(new InetSocketAddress(address.getParameter("host"), Integer.parseInt(address.getParameter("port"))));
            s = ss.accept();
            s.connect(new InetSocketAddress(address.getParameter("host"), Integer.parseInt(address.getParameter("port"))));
         in = s.getInputStream();
         out = s.getOutputStream();
}
}
