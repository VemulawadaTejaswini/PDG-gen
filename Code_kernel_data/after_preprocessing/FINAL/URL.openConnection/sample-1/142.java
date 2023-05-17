public class func{
public void doClientSide(){
        URL url = new URL("https:
        HttpsURLConnection urlc = (HttpsURLConnection)url.openConnection();
        urlc.setHostnameVerifier(this);
        urlc.getInputStream();
        if (urlc.getResponseCode() == -1) {
            throw new RuntimeException("getResponseCode() returns -1");
        }
}
}
