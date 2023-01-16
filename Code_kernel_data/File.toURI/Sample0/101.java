//100
public class func{
	public void setUp(){
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent userAgent = fopFactory.newFOUserAgent();
        userAgent.setAccessibility(true);
}
}
