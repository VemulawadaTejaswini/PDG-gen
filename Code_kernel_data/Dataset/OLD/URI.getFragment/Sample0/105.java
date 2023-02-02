//104
public class func{
	public void removeQueryString(String url,String... keys){
        return new URI(aURI.getScheme(), aURI.getAuthority(), aURI.getPath(),
                StringUtils.join(pairStrings, "&"), aURI.getFragment()).toString();
}
}
