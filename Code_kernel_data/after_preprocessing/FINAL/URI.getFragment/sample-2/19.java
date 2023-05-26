public class func{
public void testToUri(){
      assertEquals("file:
    URI uri = VfsUtil.toUri("file:
    assertNotNull(uri);
    assertEquals("file", uri.getScheme());
    assertEquals("/asd", uri.getPath());
    uri = VfsUtil.toUri("file:
    assertNotNull(uri);
    assertEquals("file", uri.getScheme());
    assertEquals("/asd/ ads/ad", uri.getPath());
    assertEquals("test", uri.getFragment());
    uri = VfsUtil.toUri("file:
    assertNotNull(uri);
    assertEquals("file:
    uri = VfsUtil.toUri("mailto:someone@example.com");
    assertNotNull(uri);
    assertEquals("someone@example.com", uri.getSchemeSpecificPart());
}
}
