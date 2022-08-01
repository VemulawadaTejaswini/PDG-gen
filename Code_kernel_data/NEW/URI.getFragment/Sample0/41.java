//40
public class func{
	public void changeScheme(URI bindAddr,String scheme){
        return new URI(scheme, bindAddr.getUserInfo(), bindAddr.getHost(), bindAddr.getPort(), bindAddr
            .getPath(), bindAddr.getQuery(), bindAddr.getFragment());
}
}
