//91
public class func{
	public void parseComposite(URI uri){
        rc.scheme = uri.getScheme();
        String ssp = stripPrefix(uri.getRawSchemeSpecificPart().trim(), "//").trim();
        parseComposite(uri, rc, ssp);
        rc.fragment = uri.getFragment();
}
}
