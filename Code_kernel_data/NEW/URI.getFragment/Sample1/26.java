//25
public class func{
	public void canonicalize(String uriString){
        if ((uriString == null) || (uriString.compareTo("localhost") == 0)) {
            uriString = "//localhost";
            return new URI(uriString);
        }
        URI u = new URI(uriString);
        if (u.isAbsolute()) {
            if (u.isOpaque()) {
                /*
                 * this code is here to deal with a special case. For ease of
                 * use, we'd like to be able to handle the case where the user
                 * specifies hostname:port, not requiring the scheme part.
                 * This introduces some subtleties.
                 *     hostname:port - scheme = hostname
                 *                   - schemespecificpart = port
                 *                   - hostname = null
                 *                   - userinfo=null
                 * however, someone could also enter scheme:hostname:port and
                 * get into this code. the strategy is to consider this
                 * syntax illegal and provide some code to defend against it.
                 * Basically, we test that the string contains only one ":"
                 * and that the ssp is numeric. If we get two colons, we will
                 * attempt to insert the "//" after the first colon and then
                 * try to create a URI from the resulting string.
                 */
                String scheme = u.getScheme();
                String ssp = u.getSchemeSpecificPart();
                String frag = u.getFragment();
                URI u2 = null;

                int c1index = uriString.indexOf(":");
                int c2index = uriString.lastIndexOf(":");
                if (c2index != c1index) {
                    /*
                     * this is the scheme:hostname:port case. Attempt to
                     * transform this to scheme://hostname:port. If a path
                     * part is part of the original strings, it will be
                     * included in the SchemeSpecificPart. however, the
                     * fragment part must be handled separately.
                     */
                    if (frag == null) {
                        u2 = new URI(scheme + "://" + ssp);
                    } else {
                        u2 = new URI(scheme + "://" + ssp + "#" + frag);
                    }
                    return u2;
                }
                /*
                 * here we have the <string>:<string> case, possibly with
                 * optional path and fragment components. we assume that
                 * the part following the colon is a number. we don't check
                 * this condition here as it will get detected later anyway.
                 */
                u2 = new URI("//" + uriString);
                return u2;
            } else {
                return u;
            }
        } else {
            /*
             * This is the case where we were given a hostname followed
             * by a path part, fragment part, or both a path and fragment
             * part. The key here is that no scheme part was specified.
             * For this case, if the scheme specific part does not begin
             * with "//", then we prefix the "//" to the given string and
             * attempt to create a URI from the resulting string.
             */
            String ssp = u.getSchemeSpecificPart();
            if (ssp.startsWith("//")) {
                return u;
            } else {
                return new URI("//" + uriString);
            }
        }
}
}
