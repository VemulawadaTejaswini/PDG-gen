//7
public class func{
public void getLink(){
    URL url = new URL( link );
    HttpURLConnection ucon = (HttpURLConnection) url.openConnection();
    ucon.setInstanceFollowRedirects( false );
    URL secondURL = new URL( ucon.getHeaderField( "Location" ) );
    return secondURL.toString();
}
}
