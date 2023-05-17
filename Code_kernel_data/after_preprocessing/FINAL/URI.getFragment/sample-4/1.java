public class func{
public void getUriWithScheme(final URI uri,final String scheme){
        if (uri == null) {
            return null;
        }
                    uri.getUserInfo(),
                    uri.getHost(),
                    uri.getPort(),
                    uri.getPath(),
                    uri.getQuery(),
                    uri.getFragment());
            throw new RuntimeException("Could not parse URI.", e);
}
}
