public class func{
public void testSlashInFragment(){
        URI uri = new URI("http:
        assertEquals("/file", uri.getPath());
        assertEquals("fragment/path", uri.getFragment());
}
}
