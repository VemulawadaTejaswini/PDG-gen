public class func{
public void checkhost(String host){
    Socket test = new Socket();
    test.connect(sockaddr, timeoutMs);
    test.close();
}
}
