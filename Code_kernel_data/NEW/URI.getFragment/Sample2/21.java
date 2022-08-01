//20
public class func{
	public void getMatchingPartitions(String graphId,URI locationToMatch){
    if (locationToMatch == null || locationToMatch.isOpaque()) {
      throw new IllegalArgumentException();
    }
    locationToMatch = locationToMatch.normalize();
    final String scheme = locationToMatch.getScheme();
    final String userinfo = locationToMatch.getUserInfo();
    final String host = locationToMatch.getHost();
    final int port = locationToMatch.getPort();
    final URI path = URI.create(locationToMatch.getPath());
    final String query = locationToMatch.getQuery();
    final String fragment = locationToMatch.getFragment();
}
}
