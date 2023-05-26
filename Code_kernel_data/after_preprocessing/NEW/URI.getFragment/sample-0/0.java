//0
public class func{
public void setPath(final URI initialUri,final String path){
            if (initialUri.getHost() == null && initialUri.getAuthority() != null) {
                return new URI(initialUri.getScheme(), initialUri.getAuthority(), finalPath, initialUri.getQuery(),
                        initialUri.getFragment());
            } else {
                return new URI(initialUri.getScheme(), initialUri.getUserInfo(), initialUri.getHost(), initialUri.getPort(),
                        finalPath, initialUri.getQuery(), initialUri.getFragment());
            }
}
}
