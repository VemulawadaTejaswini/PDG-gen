//113
public class func{
	public void setQueryParams(final URI initialUri,final Multimap<String,String> queryParams){
                return new URI(initialUri.getScheme(), initialUri.getAuthority(), initialUri.getPath(), queryString.toString(),
                        initialUri.getFragment());
}
}
