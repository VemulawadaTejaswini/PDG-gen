//17
public class func{
	public void resolve(String baseUri,String pathToResolve){
            if (pathToResolve.startsWith("?")) {
                // drop fragment from uri if it has one
                if (uri.getFragment() != null) {
                    uri = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null);
                }
                // add query to the end manually (as URI.resolve does it wrong)
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
