//68
public class func{
	public void buildPingUrl(){
        return new URI(
                uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                uri.getPath(), query, uri.getFragment()
        ).toURL();
}
}
