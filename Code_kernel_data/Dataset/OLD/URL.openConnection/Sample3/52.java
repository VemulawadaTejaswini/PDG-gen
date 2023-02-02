//51
public class func{
	public void getMimeType(final String name){
    URL resource = getResource(name);
    if (null != resource) {
      try {
        return resource.openConnection().getContentType();
      } catch (final IOException e) {
        return null;
      }
    }
}
}
