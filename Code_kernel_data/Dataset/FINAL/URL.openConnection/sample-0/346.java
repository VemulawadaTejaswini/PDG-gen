public class func{
public void getGDataUrlConnection(String urlString){
    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
}
}
