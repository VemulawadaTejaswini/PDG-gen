public class func{
public void getXML(String url,XMLHandler handler){
            Proxy proxy = DefaultToolOptions.getDefaultProxy();
            if (proxy != null) {
                connection = (HttpURLConnection) endpoint.openConnection(proxy);
            } else {
                connection = (HttpURLConnection) endpoint.openConnection();
            }
}
}
