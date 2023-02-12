public class func{
public void testGetExtension(){
        assertEquals("zip:" + new File(droidZipFileName).toURI() + "!/profile.xml",
                zipResource.getIdentifier().getUri().toString());
        assertEquals(metaData, zipResource.getRequestMetaData());
}
}
