//7
public class func{
	public void stripLastComponent(String input){
            URI uri = new URI(input);
            if (uri.getFragment() != null) {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(),
                        null).toString();
            } else if (uri.getQuery() != null) {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), null, null)
                        .toString();
            } else if (uri.getPath() != null) {
                // Try and strip off last segment of the path
                String currPath = uri.getPath();
                if (currPath.endsWith("/")) {
                    currPath = currPath.substring(0, currPath.length() - 1);
                    if (currPath.length() == 0)
                        currPath = null;
                    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), currPath, null, null)
                            .toString();
                } else if (currPath.contains("/")) {
                    currPath = currPath.substring(0, currPath.lastIndexOf('/') + 1);
                    if (currPath.length() == 0)
                        currPath = null;
                    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), currPath, null, null)
                            .toString();
                } else {
                    // If path is non-null it must always contain a /
                    // otherwise it would be an invalid path
                    // In this case there are no further components to strip
                    return null;
                }
            } else {
                // No further components to strip
                return null;
            }
}
}
