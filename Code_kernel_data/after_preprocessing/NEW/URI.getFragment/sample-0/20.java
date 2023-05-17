//20
public class func{
public void updateQuery(String uriString,String query){
         URI uri = new URI(uriString);
         return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment()).toString();
}
}
