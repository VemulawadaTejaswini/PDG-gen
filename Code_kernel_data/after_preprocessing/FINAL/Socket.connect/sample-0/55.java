public class func{
public void validateSendMessage(byte[] msg){
            s.connect(new InetSocketAddress(U.getLocalHost(), PORT), 1000);
                s.getOutputStream().write(msg);
}
}
