//43
public class func{
	public void normalizeSyntax(final URI uri){
            final StringBuilder normalized = new StringBuilder(
                    ref.toASCIIString());
            if (uri.getQuery() != null) {
                // query string passed through unchanged
                normalized.append('?').append(uri.getRawQuery());
            }
            if (uri.getFragment() != null) {
                // fragment passed through unchanged
                normalized.append('#').append(uri.getRawFragment());
            }
}
}
