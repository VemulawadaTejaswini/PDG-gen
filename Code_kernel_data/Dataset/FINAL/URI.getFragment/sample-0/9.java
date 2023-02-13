public class func{
public void testContextualizeUrl(){
    URI tmp = new URI("http:
    String ref = tmp.getFragment();
    assertEquals("REF",ref);
    tmp = new URI("http:
    assertNull(tmp.getFragment());
}
}
