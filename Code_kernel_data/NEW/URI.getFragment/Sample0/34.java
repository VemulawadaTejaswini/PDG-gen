//33
public class func{
	public void getLibraryURL(){
    String property = defaultProperties.getProperty( CASCADING_SERVICES_JAR );
    if( property == null )
      return null;
      URI uri = URI.create( property );
      if( !uri.isAbsolute() )
        uri = new URI( "file", uri.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment() );
      return uri.toURL();
}
}
