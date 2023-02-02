//6
public class func{
public void findCredentials(URI target){
        T creds = this.getCredentials(target);
            while (creds == null) {
                if (target.getFragment() != null) {
                    // If it has a fragment strip that off
                    target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(),
                            target.getPath(), target.getQuery(), null);
                } else if (target.getQuery() != null) {
                    // If it has a query string strip that off
                    target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(),
                            target.getPath(), null, null);
                } else if (target.getPath() != null) {
                    // Try and strip off last segment of the path
                    String currPath = target.getPath();
                    if (currPath.endsWith("/")) {
                        currPath = currPath.substring(0, currPath.length() - 1);
                        if (currPath.length() == 0)
                            currPath = null;
                        target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(), currPath,
                                null, null);
                    } else if (currPath.contains("/")) {
                        currPath = currPath.substring(0, currPath.lastIndexOf('/') + 1);
                        if (currPath.length() == 0)
                            currPath = null;
                        target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(), currPath,
                                null, null);
                    } else {
                        // If path is non-null it must always contain a /
                        // otherwise it would be an invalid path
                        // In this case bail out
                        return null;
                    }
                }

                creds = this.getCredentials(target);
            }
}
}
