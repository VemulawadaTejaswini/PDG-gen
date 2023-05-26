//22
public class func{
public void createURIWithQuery(URI uri,String query){
        if ((!s.contains("#")) && (uri.getFragment() != null)) {
            s = s + "#" + uri.getFragment();
        }
        return new URI(s);
}
}
