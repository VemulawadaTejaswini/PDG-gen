//120
public class func{
	public void translate(final URI source){
        URI uri = URIUtils.normalizeURI(namespace.resolve(source));
        final String fragment = uri.getFragment();
            uri = new URI(uri.getScheme(), uri.getSchemeSpecificPart(), null);
}
}
