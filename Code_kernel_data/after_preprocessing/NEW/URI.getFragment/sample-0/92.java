//92
public class func{
public void getAbsoluteUri(final MapModel map,final URI uri){
      return new URI(url.getProtocol(), url.getHost(), url.getPath(), uri.getQuery(), uri.getFragment());
}
}
