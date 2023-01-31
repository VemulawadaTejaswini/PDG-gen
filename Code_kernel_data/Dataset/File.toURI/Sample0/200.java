//199
public class func{
	public void testGetExtension(){
        assertEquals("tar:" + new File(fileName).toURI() + "!/saved/profile.xml",
                tarResource.getIdentifier().getUri().toString());
        assertEquals(metaData, tarResource.getRequestMetaData());
}
}
