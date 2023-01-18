//14
public class func{
	public void setUriParts(URI uri){
        if (uri == null) {
            throw new IllegalArgumentException("uri is null");
        }
        String theScheme = uri.getScheme();
        if (theScheme != null) {
            scheme = theScheme;
        }
        String rawPath = uri.getRawPath();
        if (!uri.isOpaque() 
            && (theScheme != null || rawPath != null && rawPath.startsWith("/"))) {
            port = uri.getPort();
            host = uri.getHost();
            if (rawPath != null) {
                setPathAndMatrix(rawPath);
            }
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                query = JAXRSUtils.getStructuredParams(rawQuery, "&", false, true);
            }
            userInfo = uri.getUserInfo();
            schemeSpecificPart = null;
        } else {
            schemeSpecificPart = uri.getSchemeSpecificPart();
        }
        String theFragment = uri.getFragment();
        if (theFragment != null) {
            fragment = theFragment;
        }
}
}
