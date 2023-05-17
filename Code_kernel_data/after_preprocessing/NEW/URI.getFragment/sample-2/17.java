//17
public class func{
public void getAuthenticatedUrl(String mirrorRepoUrl,String username,String password){
        if (!mirrorRepoUrl.toLowerCase().startsWith("http")) {
            return mirrorRepoUrl;
        }
        URI uri = URI.create(mirrorRepoUrl);
        return new URI(uri.getScheme(), userInfo, uri.getHost(), uri.getPort(),
                uri.getPath(), uri.getQuery(), uri.getFragment()).toString();
}
}
