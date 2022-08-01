//28
public class func{
	public void setContentLocation(URI contentURI){
    if (contentURI.getUserInfo() == null) {
      contentLocation = contentURI;
    } else {
      try {
        //strip out credential information
        contentLocation = new URI(contentURI.getScheme(), null, contentURI.getHost(), contentURI.getPort(), contentURI.getPath(), contentURI.getQuery(), contentURI.getFragment());
      } catch (URISyntaxException e) {
        //should never happen because we are stripping info from a valid URI
        throw new RuntimeException(e);
      }
    }
}
}
