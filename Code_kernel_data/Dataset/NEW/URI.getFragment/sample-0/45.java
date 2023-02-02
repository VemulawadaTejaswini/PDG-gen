//45
public class func{
public void findBaseLocationURI(URI fileURI,String relativeFileName){
      if (lastSegment.length() > 0 && !lastSegment.equals(".")) { //$NON-NLS-1$
        if (lastSegment.equals("..")) { //$NON-NLS-1$
          // navigating ".." in the other direction is ambiguous, bailing out
          return null;
        } else {
          if (path.endsWith("/" + lastSegment)) { //$NON-NLS-1$
            int pos = path.lastIndexOf("/" + lastSegment); //$NON-NLS-1$
            path = path.substring(0, pos);
            continue;
          } else {
            // ouch, relativeFileName does not match fileURI, bailing out
            return null;
          }
        }
      }
      cwdURI = new URI(fileURI.getScheme(), fileURI.getUserInfo(), fileURI.getHost(),
          fileURI.getPort(), path + '/', fileURI.getQuery(), fileURI.getFragment());
}
}
