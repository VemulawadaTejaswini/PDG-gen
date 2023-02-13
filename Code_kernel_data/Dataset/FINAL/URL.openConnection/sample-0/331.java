public class func{
public void isInternetReachable(){
            URL url = new URL("http:
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            Object objData = urlConnect.getContent();
}
}
