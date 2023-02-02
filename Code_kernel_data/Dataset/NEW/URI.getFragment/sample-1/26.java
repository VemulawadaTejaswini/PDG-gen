//26
public class func{
public void canonicalize(String uriString){
        if (uriString == null) {
            uriString = "local://0@localhost";
            return new URI(uriString);
        }
        URI u = new URI(uriString);
        if (u.isAbsolute()) {
            if (u.isOpaque()) {
                /*
                 * rmi:1234@hostname/path#fragment converted to
                 * rmi://1234@hostname/path#fragment
                 */
                u = new URI(u.getScheme(), "//" + u.getSchemeSpecificPart(),
                            u.getFragment());
            }
        } else {
            /*
             * make the uri absolute, if possible. A relative URI doesn't
             * specify the scheme part, so it's safe to prepend a "//" and
             * try again.
             */
            if (!uriString.startsWith("//")) {
                if (u.getFragment() == null) {
                    u = new URI("//" + u.getSchemeSpecificPart());
                } else {
                    u = new URI("//" + u.getSchemeSpecificPart() + "#"
                                + u.getFragment());
                }
            }
        }
}
}
