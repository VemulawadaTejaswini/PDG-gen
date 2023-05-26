public class func{
public void resolveURI(URI base,URI uri){
            return new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), uri.getFragment());
}
}
