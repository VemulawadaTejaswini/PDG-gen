//201
public class func{
public void testStringToURL(){
        assertEquals( new File( "/foo/bar").toURI().toURL() , c.convert( "/foo/bar", URL.class ) );
}
}
