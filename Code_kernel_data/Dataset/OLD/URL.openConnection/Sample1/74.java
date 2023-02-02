//73
public class func{
	public void testReqResp(){
        URL url = new URL("http://localhost:" + port + path);
        URLConnection conn = url.openConnection();
        conn.setDefaultUseCaches(false);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                conn.getInputStream()));
        String s = in.readLine();
        assertTrue(s.contains(path));
        in.close();
}
}
