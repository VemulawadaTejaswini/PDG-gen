//134
public class func{
	public void followRedirects(URLConnection connection){
        if ( ( (HttpURLConnection) connection).getResponseCode() == 301 || ( (HttpURLConnection) connection).getResponseCode() == 302 )
        {
            String newLocation = connection.getHeaderField( "Location" );
            URL download = new URL( newLocation );
            connection = download.openConnection();
            connection.connect();
        }
}
}
