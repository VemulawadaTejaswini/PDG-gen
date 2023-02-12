public class func{
public void getConnection(final String url){
        final URL u = new URL(url);
        return (HttpURLConnection) u.openConnection();
}
}
