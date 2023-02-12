public class func{
public void createHttpConnection(Uri uri){
        return (HttpURLConnection)new URL(uri.toString()).openConnection();
}
}
