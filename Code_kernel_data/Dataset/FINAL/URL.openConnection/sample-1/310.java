public class func{
public void check(){
        final HttpURLConnection conn = HttpURLConnection.class.cast(new URL("http:
        assertEquals("ok", IO.slurp(conn.getInputStream()));
        conn.getInputStream().close();
}
}
