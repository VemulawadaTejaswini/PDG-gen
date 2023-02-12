public class func{
public void createURIWithQuery(final URI uri,final String query){
        return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), query, uri.getFragment());
}
}
