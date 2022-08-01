//175
public class func{
	public void test_getRequestProperty_LString_Exception(){
        URL url = new URL("http", "test", 80, "index.html", new NewHandler());
        URLConnection urlCon = url.openConnection();
        urlCon.setRequestProperty("test", "testProperty");
        assertNull(urlCon.getRequestProperty("test"));
        urlCon.connect();
            urlCon.getRequestProperty("test");
}
}
