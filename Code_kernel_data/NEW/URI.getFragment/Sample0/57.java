//56
public class func{
	public void getEntry(String key){
        if ((requestedUri.getScheme().equals("http") && requestedUri.getPort() == 80)
                || (requestedUri.getScheme().equals("https") && requestedUri.getPort() == 443)) {
            // Strip away default http ports
            try {
                requestedUri = new URI(requestedUri.getScheme(), requestedUri.getHost(),
                        requestedUri.getPath(), requestedUri.getFragment());
            } catch (final URISyntaxException e) {
            }
        }
}
}
