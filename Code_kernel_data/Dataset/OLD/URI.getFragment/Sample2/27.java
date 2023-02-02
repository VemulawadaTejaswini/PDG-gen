//26
public class func{
	public void createAlternative(URI endpoint){
          endpoint.getScheme(),
          endpoint.getUserInfo(),
          "ldp4j".concat(endpoint.getHost()),
          endpoint.getPort(),
          endpoint.getPath(),
          endpoint.getFragment(),
          endpoint.getQuery()
      throw new IllegalStateException("Alternative URI creation failed",e);
}
}
