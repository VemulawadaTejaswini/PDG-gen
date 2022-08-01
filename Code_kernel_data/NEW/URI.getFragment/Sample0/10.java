//9
public class func{
	public void testContextualizeUrl(){
    URI tmp = new URI("http://base.com/foo.html#REF");
    String ref = tmp.getFragment();
    assertEquals("REF",ref);
    tmp = new URI("http://base.com/foo.html");
    assertNull(tmp.getFragment());
}
}
