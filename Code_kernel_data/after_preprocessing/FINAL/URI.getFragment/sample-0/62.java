public class func{
public void getDiffs(){
      result.put(ProtocolConstants.KEY_LENGTH, l.size());
      if (i < l.size()) {
        URI diffLocation = createDiffLocation(revCommit.getName(), fromName, "");
        URI nextLocation = new URI(diffLocation.getScheme(), diffLocation.getUserInfo(), diffLocation.getHost(), diffLocation.getPort(),
            diffLocation.getPath(), "pageSize=" + pageSize + "&page=" + (page + 1), diffLocation.getFragment());
        result.put(ProtocolConstants.KEY_NEXT_LOCATION, nextLocation);
      }
}
}
