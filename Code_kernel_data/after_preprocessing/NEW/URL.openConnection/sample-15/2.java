//2
public class func{
public void getContent(URL url,int timeOut){
    URLConnection openConnection = url.openConnection();
    openConnection.setConnectTimeout(timeOut);
    openConnection.setReadTimeout(timeOut);
}
}
