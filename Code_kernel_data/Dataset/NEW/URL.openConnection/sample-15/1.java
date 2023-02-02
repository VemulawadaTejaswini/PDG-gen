//1
public class func{
public void getUrlConnection(URL url){
    final URLConnection uc = url.openConnection();
    uc.setConnectTimeout(SOCKET_CONNECTION_TIMEOUT);
    uc.setReadTimeout(mSocketReadTimeout);
    uc.setRequestProperty("Connection", "close");
}
}
