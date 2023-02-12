public class func{
public void openDocument(final URI location){
      final String scheme = location.getScheme();
      final String host = location.getHost();
      final String path = location.isOpaque() ? location.getSchemeSpecificPart() : location.getPath();
      final int port = location.getPort();
      final String query = location.getQuery();
      final String fragment = location.getFragment();
      final StringBuilder file = new StringBuilder(path);
      if(query != null){
        file.append('?');
        file.append(query);
      }
      if(fragment != null){
        file.append('#');
        file.append(fragment);
      }
      final URL url = new URL(scheme, host, port, file.toString());
      openDocument(url);
}
}
