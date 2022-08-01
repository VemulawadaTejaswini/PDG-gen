//31
public class func{
	public void createEndpoint(String uri,String remaining,Map<String,Object> parameters){
        endpointUri = URISupport.createRemainingURI(
                new URI(scheme,
                        endpointUri.getUserInfo(),
                        endpointUri.getHost(),
                        endpointUri.getPort(),
                        endpointUri.getPath(),
                        endpointUri.getQuery(),
                        endpointUri.getFragment()),
                httpClientParameters);
        String endpointUriString = endpointUri.toString();
        LOG.debug("Creating endpoint uri {}", endpointUriString);
}
}
