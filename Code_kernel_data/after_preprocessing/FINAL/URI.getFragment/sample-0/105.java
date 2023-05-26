public class func{
public void testQuestionMarkInFragment(){
        URI uri = new URI("http:
        assertEquals("/file", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals("fragment?query", uri.getFragment());
}
}
