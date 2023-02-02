//334
public class func{
public void getConnection(String url){
        URL u = new URL(url);
        return (HttpURLConnection) u.openConnection();
}
}
