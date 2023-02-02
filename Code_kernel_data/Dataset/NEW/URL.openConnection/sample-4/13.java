//13
public class func{
public void getLastModified(final Object templateSource){
    if (templateSource instanceof URL) {
      try {
        final URL url = (URL) templateSource;
        lastModified = url.openConnection().getLastModified();
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
    }
}
}
