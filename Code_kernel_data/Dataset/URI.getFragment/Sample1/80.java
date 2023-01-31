//79
public class func{
	public void getXmldbURI(final URI uri,final boolean mustHaveXMLDB){
        if ((uri.getScheme() != null) || (uri.getFragment() != null) || (uri.getQuery() != null)) {
            return new FullXmldbURI(uri, mustHaveXMLDB);
        }
        return new XmldbURI(uri, mustHaveXMLDB);
}
}
