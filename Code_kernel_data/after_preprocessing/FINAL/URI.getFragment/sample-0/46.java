public class func{
public void toPortableUrl(final URI url){
    if (isDynamic(url)) {
      String path = url.getPath();
      if (path != null && path.startsWith("/rhelp")) {
        path = path.substring(6);
      }
      return new URI(PORTABLE_URL_SCHEME, null, null, -1,
          path, url.getQuery(), url.getFragment());
    }
}
}
