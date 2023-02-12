public class func{
public void fromUri(WindowsFileSystem fs,URI uri){
        if (!uri.isAbsolute())
            throw new IllegalArgumentException("URI is not absolute");
        if (uri.isOpaque())
            throw new IllegalArgumentException("URI is not hierarchical");
        String scheme = uri.getScheme();
        if ((scheme == null) || !scheme.equalsIgnoreCase("file"))
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        if (uri.getFragment() != null)
            throw new IllegalArgumentException("URI has a fragment component");
        if (uri.getQuery() != null)
            throw new IllegalArgumentException("URI has a query component");
        String path = uri.getPath();
        if (path.equals(""))
            throw new IllegalArgumentException("URI path component is empty");
        String auth = uri.getAuthority();
        if (auth != null && !auth.equals("")) {
            String host = uri.getHost();
            if (host == null)
                throw new IllegalArgumentException("URI authority component has undefined host");
            if (uri.getUserInfo() != null)
                throw new IllegalArgumentException("URI authority component has user-info");
            if (uri.getPort() != -1)
                throw new IllegalArgumentException("URI authority component has port number");

            if (host.startsWith("[")) {
                host = host.substring(1, host.length()-1)
                           .replace(':', '-')
                           .replace('%', 's');
                host += IPV6_LITERAL_SUFFIX;
            }

            path = "\\\\" + host + path;
        } else {
            if ((path.length() > 2) && (path.charAt(2) == ':')) {
                path = path.substring(1);
            }
        }
}
}
