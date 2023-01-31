//47
public class func{
	public void normalizeURI(URI uri){
    URI normalizedUri = uri.normalize();
    String normalizedPath = normalizedUri.getPath();
    if ("file".equalsIgnoreCase(uri.getScheme()) && uri.getPath() != null && uri.getPath().startsWith(UNC_PREFIX) && (normalizedPath == null || !normalizedPath.startsWith(UNC_PREFIX))){
    try {
        normalizedUri = new URI(normalizedUri.getScheme(), ensureUNCPath(normalizedUri.getSchemeSpecificPart()), normalizedUri.getFragment());
      } catch (URISyntaxException e) {
        LogUtils.warn(e);
      }
    }
}
}
