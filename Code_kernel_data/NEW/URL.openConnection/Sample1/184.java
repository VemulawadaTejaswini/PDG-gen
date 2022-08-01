//183
public class func{
	public void isRunning(){
            LOG.debug( "Retrieving " + checkStatusURL + " to see if Tomcat is up and running." );
            URL url = new URL( checkStatusURL );
            URLConnection urlConn = url.openConnection();
            urlConn.connect();
}
}
