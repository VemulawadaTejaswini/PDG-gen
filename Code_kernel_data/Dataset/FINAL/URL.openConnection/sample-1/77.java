public class func{
public void testServerHello(){
        URL url = new URL("http:
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        String contents = StreamUtility.readToEnd(is);
        is.close();
        assertEquals(contents, "hello");
}
}
