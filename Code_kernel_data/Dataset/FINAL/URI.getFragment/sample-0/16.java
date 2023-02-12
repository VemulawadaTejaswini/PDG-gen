public class func{
public void makeURI(final String s){
        URI uri = new URI(s);
        if (uri.getScheme() == null) {
            uri = new URI("file", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        }
}
}
