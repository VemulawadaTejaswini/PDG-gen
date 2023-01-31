//12
public class func{
	public void checkUri(URI uri){
        if (!uri.getScheme().equalsIgnoreCase(getScheme()))
            throw new IllegalArgumentException("URI does not match this provider");
        if (uri.getAuthority() != null)
            throw new IllegalArgumentException("Authority component present");
        if (uri.getPath() == null)
            throw new IllegalArgumentException("Path component is undefined");
        if (!uri.getPath().equals("/"))
            throw new IllegalArgumentException("Path component should be '/'");
        if (uri.getQuery() != null)
            throw new IllegalArgumentException("Query component present");
        if (uri.getFragment() != null)
            throw new IllegalArgumentException("Fragment component present");
}
}
