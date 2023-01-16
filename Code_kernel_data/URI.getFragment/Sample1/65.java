//64
public class func{
	public void removeTrailingPath(URL url,String trailingPath){
    URI uri = url.toURI();
    String specificPart = uri.getSchemeSpecificPart();
    if (specificPart == null) {
      return null;
    }
    int index = specificPart.lastIndexOf(trailingPath);
    if (index < 0) {
      return null;
    }
    String partialPart = specificPart.substring(0, index);
    URI trimmedUri = new URI(uri.getScheme(), partialPart, uri.getFragment());
    return trimmedUri.toURL();
}
}
