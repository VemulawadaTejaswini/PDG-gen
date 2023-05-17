public class func{
public void testBuildFullValidFromEmpty(){
    URI result = classUnderTest.build();
    assertNotNull(result);
    assertEquals("scheme", result.getScheme());
    assertEquals("user:pass", result.getUserInfo());
    assertEquals("host.com", result.getHost());
    assertEquals(1000, result.getPort());
    assertEquals("/test/path/item.foo", result.getPath());
    assertTrue(result.getRawQuery().split("&").length == 2);
    assertTrue(result.getRawQuery().contains("param1=value1"));
    assertTrue(result.getRawQuery().contains("param2"));
    assertEquals("fragment", result.getFragment());
    assertEquals("scheme:
        result.toString());
}
}
