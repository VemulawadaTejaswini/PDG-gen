//112
public class func{
	public void setQueryParams(final URI initialUri,final Multimap<String,String> queryParams){
                return new URI(initialUri.getScheme(), initialUri.getUserInfo(), initialUri.getHost(), initialUri.getPort(),
                        initialUri.getPath(),
                        queryString.toString(), initialUri.getFragment());
}
}
