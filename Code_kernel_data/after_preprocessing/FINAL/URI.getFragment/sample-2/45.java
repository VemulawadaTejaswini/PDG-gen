public class func{
public void statusToFileLocation(URI u){
    String uriPath = u.getPath();
    String prefix = uriPath.substring(0, uriPath.indexOf(GitServlet.GIT_URI));
    uriPath = uriPath.substring(prefix.length() + (GitServlet.GIT_URI + '/' + Status.RESOURCE).length());
    return new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), uriPath, u.getQuery(), u.getFragment());
}
}
