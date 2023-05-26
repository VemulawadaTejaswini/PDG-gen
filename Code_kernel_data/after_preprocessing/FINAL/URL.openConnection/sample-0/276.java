public class func{
public void doClientSide(){
        URL url = new URL("https:
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
        InputStream is = urlc.getInputStream();
        is.close();
}
}
