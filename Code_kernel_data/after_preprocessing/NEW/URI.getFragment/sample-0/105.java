//105
public class func{
public void testQuestionMarkInFragment(){
        URI uri = new URI("http://host/file#fragment?query");
        assertEquals("/file", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals("fragment?query", uri.getFragment());
}
}
