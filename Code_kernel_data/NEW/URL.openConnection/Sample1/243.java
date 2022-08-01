//242
public class func{
	public void testService(){
        URL url = new URL("http://localhost:" + RegressionTestSupport.HTTP_PORT + "/test/services");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write("This is a test");
        wr.flush();
}
}
