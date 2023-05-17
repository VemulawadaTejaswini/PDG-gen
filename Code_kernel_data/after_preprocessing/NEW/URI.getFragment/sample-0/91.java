//91
public class func{
public void toHttpUrl(final URI url){
      return new URI("http", null, fHttpd.getHost(), fHttpd.getPort(),
          path, url.getQuery(), url.getFragment());
}
}
