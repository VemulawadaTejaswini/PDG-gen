//310
public class func{
	public void check(){
        final HttpURLConnection conn = HttpURLConnection.class.cast(new URL("http://127.0.0.1:" + port + "/app/api").openConnection());
        assertEquals("ok", IO.slurp(conn.getInputStream()));
        conn.getInputStream().close();
}
}
