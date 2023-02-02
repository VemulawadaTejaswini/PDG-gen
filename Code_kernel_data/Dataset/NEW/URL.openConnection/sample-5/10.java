//10
public class func{
public void doClientSide(){
        http = (HttpsURLConnection)url.openConnection();
        int respCode = http.getResponseCode();
        http.disconnect();
}
}
