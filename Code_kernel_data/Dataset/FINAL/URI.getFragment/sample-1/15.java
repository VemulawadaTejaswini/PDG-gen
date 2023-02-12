public class func{
public void getAbsoluteUrl(final MapModel map,final URI uri){
    final String path = uri.isOpaque() ? uri.getSchemeSpecificPart() : uri.getPath();
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
    if (!uri.isAbsolute() || uri.isOpaque() || uri.getScheme().length()>0) {
      final URL mapUrl = map.getURL();
      final String scheme = uri.getScheme();
      if (scheme == null || mapUrl.getProtocol().equals(scheme)) {
        final URL url = new URL(mapUrl, sb.toString());
        return url;
      }
    }
    final URL url = new URL(uri.getScheme(), uri.getHost(), uri.getPort(), sb.toString());
}
}
