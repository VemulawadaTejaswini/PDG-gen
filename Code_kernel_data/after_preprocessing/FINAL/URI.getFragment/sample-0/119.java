public class func{
public void testSlashInFragment(){
        URI uri = new URI("http://host/file#fragment/path");
        assertEquals("/file", uri.getPath());
        assertEquals("fragment/path", uri.getFragment());
}
}
