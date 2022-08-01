//34
public class func{
	public void openConnection(final URL url){
      LOGGER.trace(String.format("Creating stream for resource <%s>, using class loader <%s>...",resource,classLoader));
    final URL resourceURL=classLoader.getResource(resource);
    if(resourceURL==null) {
      throw new IOException(String.format("Resource <%s> could not be found in the classpath.",resource));
    }
    return resourceURL.openConnection();
}
}
