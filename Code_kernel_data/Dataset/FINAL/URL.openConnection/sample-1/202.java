public class func{
public void getHttpsURLConnection(String strUrl){
    URL url = new URL(strUrl);
    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url
        .openConnection();
}
}
