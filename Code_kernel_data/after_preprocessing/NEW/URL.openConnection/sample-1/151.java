//151
public class func{
public void openConnection(HttpInvokerClientConfiguration config){
    URLConnection con = new URL(config.getServiceUrl()).openConnection();
    if (!(con instanceof HttpURLConnection)) {
      throw new IOException("Service URL [" + config.getServiceUrl() + "] is not an HTTP URL");
    }
    return (HttpURLConnection) con;
}
}
