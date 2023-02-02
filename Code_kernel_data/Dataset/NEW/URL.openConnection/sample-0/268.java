//268
public class func{
public void testHeaderEcho(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/headerEcho").openConnection();
    c.setRequestProperty("Header2", "bar");
    assertEquals(c.getHeaderField("header1"), "foo");
    assertEquals(c.getHeaderField("header2"), "bar");
}
}
