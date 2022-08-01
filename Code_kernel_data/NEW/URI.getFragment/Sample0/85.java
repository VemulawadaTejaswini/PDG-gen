//84
public class func{
	public void safeRelativize(URI baseUri,URI uriToRelativize){
    if (baseUriPathIndex == uriToRelativizePath.length())
      return (new URI(null, null, null, uriToRelativize.getQuery(), uriToRelativize.getFragment())).toString();
    uriToRelativizePath = uriToRelativizePath.substring(i);
}
}
