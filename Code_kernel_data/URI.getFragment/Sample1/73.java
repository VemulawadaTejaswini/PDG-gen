//72
public class func{
	public void getVirtualRootURI(URI uri){
    if (!ROOT_STRING.equals(uri.getPath()) || uri.getFragment() != null) {
      try {
        uri = new URI(uri.getScheme(), uri.getAuthority(), ROOT_STRING, null, null);
      } catch (URISyntaxException e) {
      }
    }
}
}
