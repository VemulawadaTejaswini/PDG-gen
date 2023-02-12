public class func{
public void resolve(String baseUri,String pathToResolve){
            if (pathToResolve.startsWith("?")) {
                if (uri.getFragment() != null) {
                    uri = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null);
                }
                return uri.toString() + pathToResolve;
            }
            uri = uri.resolve(pathToResolve);
            String path = uri.getPath();
            if (path != null) {
                path = JsonLdUrl.removeDotSegments(uri.getPath(), true);
            }
            return new URI(uri.getScheme(), uri.getAuthority(), path, uri.getQuery(),
                    uri.getFragment()).toString();
}
}
