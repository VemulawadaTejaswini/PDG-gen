//19
public class func{
public void testToUri(){
      assertEquals("file:///asd%20/sd", VfsUtil.toUri(new File("/asd /sd")).toASCIIString());
    URI uri = VfsUtil.toUri("file:///asd");
    assertNotNull(uri);
    assertEquals("file", uri.getScheme());
    assertEquals("/asd", uri.getPath());
    uri = VfsUtil.toUri("file:///asd/ ads/ad#test");
    assertNotNull(uri);
    assertEquals("file", uri.getScheme());
    assertEquals("/asd/ ads/ad", uri.getPath());
    assertEquals("test", uri.getFragment());
    uri = VfsUtil.toUri("file:///asd/ ads/ad#");
    assertNotNull(uri);
    assertEquals("file:///asd/%20ads/ad#", uri.toString());
    uri = VfsUtil.toUri("mailto:someone@example.com");
    assertNotNull(uri);
    assertEquals("someone@example.com", uri.getSchemeSpecificPart());
}
}
