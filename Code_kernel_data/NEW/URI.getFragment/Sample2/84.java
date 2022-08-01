//83
public class func{
	public void fromUri(URI uri){
    Preconditions.checkArgument(uri.getScheme().equalsIgnoreCase(SCHEME),
        "URI: %s is not a GCS URI", uri);
    Preconditions.checkArgument(uri.getPort() == -1,
        "GCS URI may not specify port: %s (%i)", uri, uri.getPort());
    Preconditions.checkArgument(
        Strings.isNullOrEmpty(uri.getUserInfo()),
        "GCS URI may not specify userInfo: %s (%s)", uri, uri.getUserInfo());
    Preconditions.checkArgument(
        Strings.isNullOrEmpty(uri.getQuery()),
        "GCS URI may not specify query: %s (%s)", uri, uri.getQuery());
    Preconditions.checkArgument(
        Strings.isNullOrEmpty(uri.getFragment()),
        "GCS URI may not specify fragment: %s (%s)", uri, uri.getFragment());
    return fromUri(uri.toString());
}
}
