//8
public class func{
public void openConnection(final URL url){
        final String path = url.getPath();
        if ( Strings.isNullOrEmpty( path ) )
        {
            throw new MalformedURLException( "Path can not be null or empty." );
        }
        final ResourceKey key = ResourceKey.from( path );
        final Bundle bundle = getBundle( key.getApplicationKey() );
        final URL resolvedUrl = bundle.getResource( key.getPath() );
        return resolvedUrl != null ? resolvedUrl.openConnection() : null;
}
}
