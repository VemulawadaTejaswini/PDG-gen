public class func{
public void findCredentials(URI target){
        T creds = this.getCredentials(target);
            while (creds == null) {
                if (target.getFragment() != null) {
                    target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(),
                            target.getPath(), target.getQuery(), null);
                } else if (target.getQuery() != null) {
                    target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(),
                            target.getPath(), null, null);
                } else if (target.getPath() != null) {
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
                        return null;
                    }
                }

                creds = this.getCredentials(target);
            }
}
}
