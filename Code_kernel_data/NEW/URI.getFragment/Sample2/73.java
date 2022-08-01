//72
public class func{
	public void relativize(URI uri){
      if (uri.getScheme() == null && uri.getHost() == null)
      {
         to = getBaseUriBuilder().replaceQuery(null).path(uri.getPath()).replaceQuery(uri.getQuery()).fragment(uri.getFragment()).build();
      }
      return ResteasyUriBuilder.relativize(from, to);
}
}
