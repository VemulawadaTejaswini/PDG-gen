public class func{
public void intParseURL(String str){
        URI uri = new URI(str);
        if (uri.isOpaque()) {
            throw new MalformedURLException(
                "not a hierarchical URL: " + str);
        }
        if (uri.getFragment() != null) {
            throw new MalformedURLException(
                "invalid character, '#', in URL name: " + str);
        } else if (uri.getQuery() != null) {
            throw new MalformedURLException(
                "invalid character, '?', in URL name: " + str);
        } else if (uri.getUserInfo() != null) {
            throw new MalformedURLException(
                "invalid character, '@', in URL host: " + str);
        }
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.equals("rmi")) {
            throw new MalformedURLException("invalid URL scheme: " + str);
        }
        String name = uri.getPath();
        if (name != null) {
            if (name.startsWith("/")) {
                name = name.substring(1);
            }
            if (name.length() == 0) {
                name = null;
            }
        }
        String host = uri.getHost();
        if (host == null) {
            host = "";
            try {
                /*
                 * With 2396 URI handling, forms such as 'rmi://host:bar'
                 * or 'rmi://:<port>' are parsed into a registry based
                 * authority. We only want to allow server based naming
                 * authorities.
                 */
                uri.parseServerAuthority();
            } catch (URISyntaxException use) {
                String authority = uri.getAuthority();
                if (authority != null && authority.startsWith(":")) {
                    authority = "localhost" + authority;
                    try {
                        uri = new URI(null, authority, null, null, null);
                        uri.parseServerAuthority();
                    } catch (URISyntaxException use2) {
                        throw new
                            MalformedURLException("invalid authority: " + str);
                    }
                } else {
                    throw new
                        MalformedURLException("invalid authority: " + str);
                }
            }
        }
        int port = uri.getPort();
        if (port == -1) {
            port = Registry.REGISTRY_PORT;
        }
        return new ParsedNamingURL(host, port, name);
}
}
