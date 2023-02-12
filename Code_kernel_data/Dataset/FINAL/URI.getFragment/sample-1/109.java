public class func{
public void createFromURL(String url){
    res.setScheme(uri.getScheme());
    res.setUserInfo(uri.getUserInfo());
    if (uri.getHost() == null && res.getHasScheme())
    {
      try
      {
        java.net.URL u = new java.net.URL(url);
        res.setHost(u.getHost());
        res.setPort(u.getPort());
      }
      catch (java.net.MalformedURLException e)
      {
        URISyntaxException uex = new URISyntaxException(url, e.getMessage());
        uex.initCause(e); // keep the original exception
        throw uex;
      }
    }
    else
    {
      res.setHost(uri.getHost());
      res.setPort(uri.getPort());
    }
    res.setPath(uri.getRawPath());
    res.setFragment(uri.getFragment());
    res.addQuery(uri);
}
}
