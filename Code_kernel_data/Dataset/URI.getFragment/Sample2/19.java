//18
public class func{
	public void updateHeaders(RequestContext context,Multimap<String,String> headers){
                    String initial = context.request().uri();
                    URI uri = URI.create(initial);
                        URI newURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                                location.getPath(), location.getQuery(), location.getFragment());
                        headers.remove(h.getKey(), h.getValue());
}
}
