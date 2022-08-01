//82
public class func{
	public void filterHttpRequest(SubmitContext context,HttpRequestInterface<?> request){
                java.net.URI oldUri = httpMethod.getURI();
                String pathToSet = StringUtils.hasContent(oldUri.getRawPath()) && !"/".equals(oldUri.getRawPath()) ? oldUri.getRawPath() + path : path;
                java.net.URI newUri = URIUtils.createURI(oldUri.getScheme(), oldUri.getHost(), oldUri.getPort(),
                        pathToSet, oldUri.getQuery(), oldUri.getFragment());
                httpMethod.setURI(newUri);
                context.setProperty(BaseHttpRequestTransport.REQUEST_URI, new URI(newUri.toString(), request
}
}
