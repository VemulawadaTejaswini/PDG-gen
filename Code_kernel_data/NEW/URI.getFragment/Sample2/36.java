//35
public class func{
	public void doStart(){
        int port = getConnectorLocalPort(); 
        if (port == -1) {
            port = boundTo.getPort();
        }
        setConnectURI(new URI(boundTo.getScheme(),
                              boundTo.getUserInfo(),
                              boundTo.getHost(),
                              port,
                              boundTo.getPath(),
                              boundTo.getQuery(),
                              boundTo.getFragment()));
        LOG.info("Listening for connections at {}", getConnectURI());
}
}
