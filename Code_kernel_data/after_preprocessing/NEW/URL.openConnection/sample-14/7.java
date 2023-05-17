//7
public class func{
public void getStream(URL url){
    URLConnection conn = url.openConnection();
    conn.setDefaultUseCaches(false);
    conn.setUseCaches(false);
    return new InputStreamReader(conn.getInputStream());
}
}
