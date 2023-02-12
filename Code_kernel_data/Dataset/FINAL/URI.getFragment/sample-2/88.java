public class func{
public void parseComposite(final URI uri){
        rc.scheme = uri.getScheme();
        final String ssp = stripPrefix(uri.getSchemeSpecificPart().trim(), "//").trim();
        parseComposite(uri, rc, ssp);
        rc.fragment = uri.getFragment();
}
}
