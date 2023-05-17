public class func{
public void call(){
            new URL("http:
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty(RMWebServices.DELEGATION_TOKEN_HEADER,
          tokenString);
        setupConn(conn, "DELETE", null, null);
        InputStream response = conn.getInputStream();
        assertEquals(Status.OK.getStatusCode(), conn.getResponseCode());
}
}
