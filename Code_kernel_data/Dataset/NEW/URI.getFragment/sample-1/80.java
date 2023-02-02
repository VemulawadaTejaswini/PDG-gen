//80
public class func{
public void getXmldbURI(final URI uri){
        if ((uri.getScheme() != null) || (uri.getFragment() != null) || (uri.getQuery() != null)) {
            return new FullXmldbURI(uri);
        }
        return new XmldbURI(uri);
}
}
