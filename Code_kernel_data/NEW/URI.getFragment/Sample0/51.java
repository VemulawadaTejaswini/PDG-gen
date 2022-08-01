//50
public class func{
	public void getURIForLocation(IPath location){
      URI newURI = new URI(projURI.getScheme(), projURI.getUserInfo(),
          projURI.getHost(), projURI.getPort(), location.toString(), projURI.getQuery(), projURI
              .getFragment());
}
}
