//23
public class func{
	public void addTrailingSlashes(URI uri){
        if(uri.getPath() == null){
            uri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), "/", uri.getQuery(), uri.getFragment());
        }else if (!uri.getPath().endsWith("/") && !uri.getPath().endsWith(".html")) {
            uri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath() + "/", uri.getQuery(), uri.getFragment());

        }
}
}
