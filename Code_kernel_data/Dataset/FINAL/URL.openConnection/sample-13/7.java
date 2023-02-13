public class func{
public void getInputStream(URL url,int connectTimeout,int readTimeout){
    URLConnection conn = url.openConnection();
    conn.setConnectTimeout( connectTimeout );
    conn.setReadTimeout( readTimeout );
    conn.connect();
    return conn.getInputStream();
}
}
