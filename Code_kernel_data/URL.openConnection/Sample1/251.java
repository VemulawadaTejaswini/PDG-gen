//250
public class func{
	public void testLoadingOfApplicationImage(){
    String uri = getAbsoluteUrl("/public/images/favicon.png");
    Logger.debug("Testing loading of image at '%s'", uri);
    URL url = new URL(uri);
    URLConnection connection = url.openConnection();
    assertTrue(connection.getContentLength() > 0);
    assertEquals("image/png", connection.getContentType());
}
}
