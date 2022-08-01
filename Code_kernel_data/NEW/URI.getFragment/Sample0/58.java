//57
public class func{
	public void listEntry(String name,long timeStamp,boolean isDir,long length,URI location,String appendName){
        if (appendName != null) {
          if (!appendName.startsWith("/") && !location.getPath().endsWith("/")) //$NON-NLS-1$  //$NON-NLS-2$
            appendName = "/" + appendName; //$NON-NLS-1$
          location = new URI(location.getScheme(), location.getAuthority(), location.getPath() + appendName, null, location.getFragment());
          if (isDir) {
            location = URIUtil.append(location, ""); //$NON-NLS-1$
          }
        }
}
}
