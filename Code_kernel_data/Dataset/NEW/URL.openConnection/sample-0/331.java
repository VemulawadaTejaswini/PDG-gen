//331
public class func{
public void isInternetReachable(){
            URL url = new URL("http://checkstyle.sourceforge.net/");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            Object objData = urlConnect.getContent();
}
}
