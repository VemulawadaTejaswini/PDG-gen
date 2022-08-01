//49
public class func{
	public void extendPath(final Path parent,final String extension){
      final URI extendedUri = new URI(parentUri.getScheme(),
        ((parentUri.getAuthority() != null) ? parentUri.getAuthority() : ""), extendedPath,
        parentUri.getQuery(), parentUri.getFragment());
      return new Path(extendedUri);
}
}
