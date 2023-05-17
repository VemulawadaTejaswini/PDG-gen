public class func{
public void toJSON(IFileStore store,IFileInfo info,URI location){
            result.put(ProtocolConstants.KEY_CHILDREN_LOCATION, new URI(location.getScheme(), location.getAuthority(), location.getPath(), "depth=1", location.getFragment()));
}
}
