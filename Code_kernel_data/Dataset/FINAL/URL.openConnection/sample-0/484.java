public class func{
public void getHttpURLConnection(URL url){
            (HttpURLConnection) (new URL(url.toString() + tokenString)).openConnection();
        this.connectionConf.configure(httpURLConnection);
}
}
