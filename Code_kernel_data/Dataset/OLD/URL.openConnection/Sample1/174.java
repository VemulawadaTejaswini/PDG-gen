//173
public class func{
	public void testContentLength(){
        File f = new File("test/webresources/war-url-connection.war");
        String fileUrl = f.toURI().toURL().toString();
        URL indexHtmlUrl = new URL("jar:war:" + fileUrl +
                "*/WEB-INF/lib/test.jar!/META-INF/resources/index.html");
        URLConnection urlConn = indexHtmlUrl.openConnection();
        urlConn.connect();
        int size = urlConn.getContentLength();
        Assert.assertEquals(137, size);
}
}
