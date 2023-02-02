//538
public class func{
public void grab(URL url){
        wmsInterface.urlConn = (HttpURLConnection)url.openConnection();
        wmsInterface.urlConn.setRequestProperty("Connection", "close");
        wmsInterface.urlConn.setRequestMethod("GET");
}
}
