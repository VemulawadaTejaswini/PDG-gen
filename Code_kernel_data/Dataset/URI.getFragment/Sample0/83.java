//82
public class func{
	public void getNextPageLocation(){
      return new URI(location.getScheme(), location.getAuthority(), location.getPath(), query, location.getFragment());
}
}
