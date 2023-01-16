//93
public class func{
	public void createNewURIFromPath(URI locationOnSameFilesystem,String path){
      return new URI(uri.getScheme(), uri.getAuthority(), pathBuf.toString(), // replaced!
          uri.getQuery(), uri.getFragment());
}
}
