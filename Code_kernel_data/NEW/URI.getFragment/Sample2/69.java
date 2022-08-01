//68
public class func{
	public void joinURI(String baseURI,String relativeURI){
        if (baseURI != null) {
            if (baseURI.endsWith("..")) {
                baseURI = baseURI + "/";
            }
            URI base = new URI(baseURI);
            bscheme = base.getScheme();
            bauthority = base.getAuthority();
            bpath = base.getPath();
            bquery = base.getQuery();
            bfragment = base.getFragment();
        }
}
}
