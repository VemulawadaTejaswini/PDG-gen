//110
public class func{
public void testDecodingPlus(){
        assertEquals("a+b", new URI("http://foo#a+b").getFragment());
}
}
