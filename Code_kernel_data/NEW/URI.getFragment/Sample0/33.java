//32
public class func{
	public void getProxyUri(URI wsUri,String scheme){
            return new URI(scheme, wsUri.getUserInfo(), wsUri.getHost(), wsUri.getPort(), wsUri.getPath(),
                           wsUri.getQuery(), wsUri.getFragment());
            LOGGER.log(Level.WARNING, String.format("Exception during generating proxy URI '%s'", wsUri), e);
}
}
