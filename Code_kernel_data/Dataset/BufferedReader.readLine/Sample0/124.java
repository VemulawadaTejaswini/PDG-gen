//123
public class func{
	public void testRead(int port){
        String url = new URL("http","localhost",port,"/").toString();
        HttpResponse response = new DefaultHttpClient().execute(new HttpGet(url));
        assertEquals(200, response.getStatusLine().getStatusCode());
        InputStream is = response.getEntity().getContent();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String data = br.readLine();
}
}
