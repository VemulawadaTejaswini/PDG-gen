//51
public class func{
	public void rewriteUrl(String urlString){
      if (uri.getPath() != null)
        newUri.append(uri.getPath());
      newUri.append(query);
      if (uri.getFragment() != null) {
        newUri.append("#");
        newUri.append(uri.getFragment());
      }
}
}
