//94
public class func{
public void appendPathToSingleUri(final URI uri,final String relativeUri,final String separator){
        return new URI(uri.getScheme(), uri.getAuthority(), pathString.toString(), uri.getQuery(), uri.getFragment());
}
}
