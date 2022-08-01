//9
public class func{
	public void getAbsoluteUrl(final URI base,final URI uri){
    final String path = uri.isOpaque() ? uri.getSchemeSpecificPart() : uri.getRawPath();
    final StringBuilder sb = new StringBuilder(path);
    final String query = uri.getQuery();
    if (query != null) {
      sb.append('?');
      sb.append(query);
    }
    final String fragment = uri.getFragment();
    if (fragment != null) {
      sb.append('#');
      sb.append(fragment);
    }
    final String scheme = uri.getScheme();
    if("file".equals(scheme)) {
      if(sb.toString().startsWith("//") && !sb.toString().startsWith("////")) {
        sb.insert(0, "//");
      }
    }
    if (!uri.isAbsolute() || uri.isOpaque() || uri.getScheme().length()>0) {
      final URL baseUrl = base.toURL();
      if (scheme == null || baseUrl.getProtocol().equals(scheme)) {
        final URL url = new URL(baseUrl, sb.toString());
        return url;
      }
    }
    final URL url = new URL(uri.getScheme(), uri.getHost(), uri.getPort(), sb.toString());
}
}
