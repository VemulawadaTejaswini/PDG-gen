//384
public class func{
public void exists(Path path){
    URL url = makeUrl( path );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod( "HEAD" );
    connection.connect();
    debugConnection( connection );
    return connection.getResponseCode() == 200;
}
}
