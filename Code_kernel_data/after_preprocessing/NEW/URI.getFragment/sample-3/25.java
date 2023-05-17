//25
public class func{
public void apply(@Nullable final URI input){
                if (input == null)
                    return null;
                final URI uri = input.normalize();
                final String scheme = uri.getScheme();
                final String host = uri.getHost();
                if (scheme == null && host == null)
                    return uri;
                if (uri.isOpaque())
                    try {
                        return new URI(LOWERCASE.apply(scheme),
                            uri.getSchemeSpecificPart(), uri.getFragment());
                    } catch (URISyntaxException e) {
                        throw new IllegalStateException("How did I get there??",
                            e);
                    }
                final String userinfo = uri.getUserInfo();
                final int port = uri.getPort();
                final String path = uri.getPath();
                final String query = uri.getQuery();
                final String fragment = uri.getFragment();
                        LOWERCASE.apply(host), port, path, query, fragment);
                    throw new IllegalStateException("How did I get there??", e);
}
}
