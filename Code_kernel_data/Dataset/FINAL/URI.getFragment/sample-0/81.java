public class func{
public void listEntry(String name,long timeStamp,boolean isDir,long length,URI location,String appendName){
            jsonObject.put(ProtocolConstants.KEY_CHILDREN_LOCATION, new URI(location.getScheme(), location.getAuthority(), location.getPath(),
                "depth=1", location.getFragment()));
}
}
