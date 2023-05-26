//7
public class func{
public void getUriWithDefaultPath(final URI uri,final String path){
        if (uri == null) {
            return null;
        }
                    uri.getScheme(),
                    uri.getUserInfo(),
                    uri.getHost(),
                    uri.getPort(),
                    isNullOrEmpty(uri.getPath()) ? path : uri.getPath(),
                    uri.getQuery(),
                    uri.getFragment());
            throw new RuntimeException("Could not parse URI.", e);
}
}
