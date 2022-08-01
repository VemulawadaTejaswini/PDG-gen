//28
public class func{
	public void getFile(URI absoluteURI){
    if(absoluteURI != null) {
      if(!"file".equals(absoluteURI.getScheme()) || absoluteURI.getFragment() != null) {
        return null;
      }
      try {
        if(absoluteURI.getRawPath().startsWith("//")) {
          return new File("\\\\"+absoluteURI.normalize().getPath());
        }
        else {
          return new File(absoluteURI.normalize());
        }
      }
      catch (Exception e) {
        LogUtils.info("Exception in "+ URIUtils.class+".getFile(URI): "+ e.getMessage());
      }
    }
}
}
