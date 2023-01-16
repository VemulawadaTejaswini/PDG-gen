//34
public class func{
	public void fromUri(URI uri,String username,String password){
        if (uri.getScheme() == null) {
            try {
                return new DiskReader(new URI("file", uri.getSchemeSpecificPart(), uri.getFragment()).toURL());
            } catch (URISyntaxException e) {
                throw new IllegalStateException(
                    "URI syntax exception while adding the 'file' scheme to a path. This should not have happened.", e);
            }
        } else if (uri.getScheme().equals("file")) {
            return new DiskReader(uri.toURL());
        } else if (uri.getScheme().startsWith("http")) {
            return new HttpReader(uri.toURL(), username, password);
        } else {
            return new UrlReader(uri.toURL());
        }
}
}
