//75
public class func{
public void getFileFromURL(URL url){
        URI uri = url.toURI();
        if ( uri.getFragment() != null ) {
          uri = new URI( uri.getScheme(), uri.getSchemeSpecificPart(), null );
        }
        return new File( uri );
}
}
