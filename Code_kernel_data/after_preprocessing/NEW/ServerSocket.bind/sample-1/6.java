//6
public class func{
public void getAvailablePort(){
            ss = new ServerSocket();
            ss.bind(null);
            return ss.getLocalPort();
}
}
