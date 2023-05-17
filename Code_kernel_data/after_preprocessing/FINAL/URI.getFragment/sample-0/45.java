public class func{
public void findBaseLocationURI(URI fileURI,String relativeFileName){
      if (lastSegment.length() > 0 && !lastSegment.equals(".")) {
        if (lastSegment.equals("..")) {
          return null;
        } else {
          if (path.endsWith("/" + lastSegment)) {
            int pos = path.lastIndexOf("/" + lastSegment);
            path = path.substring(0, pos);
            continue;
          } else {
            return null;
          }
        }
      }
      cwdURI = new URI(fileURI.getScheme(), fileURI.getUserInfo(), fileURI.getHost(),
          fileURI.getPort(), path + '/', fileURI.getQuery(), fileURI.getFragment());
}
}
