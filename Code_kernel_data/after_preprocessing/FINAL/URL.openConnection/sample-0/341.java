public class func{
public void getHttpURLConnection(String strUrl){
    URL url = new URL(strUrl);
    HttpURLConnection httpURLConnection = (HttpURLConnection) url
        .openConnection();
}
}
