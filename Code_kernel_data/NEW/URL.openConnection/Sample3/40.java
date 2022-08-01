//39
public class func{
	public void openConnection(final URL url){
        final ResourceKey key = ResourceKey.from( url.getPath() );
        final URL newUrl = this.registry.getUrl( key );
        if ( newUrl != null )
        {
            return newUrl.openConnection();
        }
}
}
