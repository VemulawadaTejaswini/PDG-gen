//89
public class func{
	public void makeQualified(URI defaultUri,Path workingDir){
      path = new Path(workingDir, this);
    URI pathUri = path.toUri();
    String scheme = pathUri.getScheme();
    String authority = pathUri.getAuthority();
    String fragment = pathUri.getFragment();
}
}
