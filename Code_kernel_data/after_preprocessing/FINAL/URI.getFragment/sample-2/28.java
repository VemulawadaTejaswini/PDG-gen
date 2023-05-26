public class func{
public void setContentLocation(URI contentURI){
    if (contentURI.getUserInfo() == null) {
      contentLocation = contentURI;
    } else {
      try {
        contentLocation = new URI(contentURI.getScheme(), null, contentURI.getHost(), contentURI.getPort(), contentURI.getPath(), contentURI.getQuery(), contentURI.getFragment());
      } catch (URISyntaxException e) {
        throw new RuntimeException(e);
      }
    }
}
}
