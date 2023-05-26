public class func{
public void addQueryString(String url,String... encodedPairs){
        return new URI(aURI.getScheme(), aURI.getAuthority(), aURI.getPath(), query,
                aURI.getFragment()).toString();
}
}
