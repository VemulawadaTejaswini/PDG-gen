//507
public class func{
public void JDKHttpConnection(URL url,Proxy proxy){
    this.wrappedUrlConnection = (HttpURLConnection) url
        .openConnection(proxy);
}
}
