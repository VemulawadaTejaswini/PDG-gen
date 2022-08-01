//89
public class func{
	public void doTest(String uri){
        HttpURLConnection conn = getConnection(uri, PORT);
        assertEquals(200, conn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        return reader.readLine();
}
}
