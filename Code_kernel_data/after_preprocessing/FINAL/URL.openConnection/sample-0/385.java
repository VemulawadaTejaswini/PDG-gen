public class func{
public void open(Path path,int i){
    URL url = makeUrl( path );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod( "GET" );
    connection.connect();
    debugConnection( connection );
    return new FSDataInputStream( new FSDigestInputStream( connection.getInputStream(), getMD5SumFor( getConf(), path ) ) );
}
}
