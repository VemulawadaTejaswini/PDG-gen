//205
public class func{
	public void test_getRequestProperties_Exception(){
        URL url = new URL("http", "test", 80, "index.html", new NewHandler());
        URLConnection urlCon = url.openConnection();
        urlCon.connect();
            urlCon.getRequestProperties();
}
}
