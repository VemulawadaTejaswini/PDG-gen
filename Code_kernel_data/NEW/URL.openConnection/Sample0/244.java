//243
public class func{
	public void testQuery(){
        URL url = new URL("http://localhost:" + port + path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDefaultUseCaches(false);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                conn.getInputStream()));
        String s = in.readLine();
        assertTrue(s.contains("~kilim"));
        assertTrue(s.contains("desc:Rolls Royce"));
        in.close();
}
}
