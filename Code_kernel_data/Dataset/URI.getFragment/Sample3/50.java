//49
public class func{
	public void compareURIs(URI uri1,URI uri2){
        assertEquals("Unexpected fragment", uri1.getFragment(), uri2.getFragment());
            JAXRSUtils.getStructuredParams(uri1.getRawQuery(), "&", false, false);
}
}
