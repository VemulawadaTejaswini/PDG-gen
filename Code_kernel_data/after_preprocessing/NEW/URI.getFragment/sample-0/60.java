//60
public class func{
public void normalizePath(Path path){
    URI uri = path.toUri();
    if (uri.getScheme() == null) {
      try {
        uri = new URI("file", uri.getHost(), uri.getPath(), uri.getFragment());
        path = new Path(uri.toString());
      } catch (URISyntaxException e) {
        throw new IllegalArgumentException("path is invalid", e);
      }
    }
}
}
