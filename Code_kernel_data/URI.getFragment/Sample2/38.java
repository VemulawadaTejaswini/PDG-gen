//37
public class func{
	public void portUpdate(final URI uri){
      return port != uri.getPort( ) ?
        new URI( uri.getScheme( ), uri.getUserInfo( ), uri.getHost( ), port, uri.getPath( ), uri.getQuery( ), uri.getFragment( ) ) :
        uri;
}
}
