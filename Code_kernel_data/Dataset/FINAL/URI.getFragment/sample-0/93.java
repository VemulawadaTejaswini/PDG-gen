public class func{
public void createNewURIFromPath(URI locationOnSameFilesystem,String path){
      return new URI(uri.getScheme(), uri.getAuthority(), pathBuf.toString(),
          uri.getQuery(), uri.getFragment());
}
}
