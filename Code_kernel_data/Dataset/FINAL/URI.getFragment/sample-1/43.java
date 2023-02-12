public class func{
public void normalizeSyntax(final URI uri){
            final StringBuilder normalized = new StringBuilder(
                    ref.toASCIIString());
            if (uri.getQuery() != null) {
                normalized.append('?').append(uri.getRawQuery());
            }
            if (uri.getFragment() != null) {
                normalized.append('#').append(uri.getRawFragment());
            }
}
}
