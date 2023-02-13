public class func{
public void listEntry(String name,long timeStamp,boolean isDir,long length,URI location,String appendName){
        if (appendName != null) {
          if (!appendName.startsWith("/") && !location.getPath().endsWith("/"))
            appendName = "/" + appendName;
          location = new URI(location.getScheme(), location.getAuthority(), location.getPath() + appendName, null, location.getFragment());
          if (isDir) {
            location = URIUtil.append(location, "");
          }
        }
}
}
