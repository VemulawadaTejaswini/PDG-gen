public class func{
public void testGET_URL(){
        URL url = new URL("http:
        URLConnection conn = url.openConnection();
        conn.connect();
        InputStream in = conn.getInputStream();
        String response = IO.toString(in);
        Assert.assertEquals("Response",expected,response);
}
}
