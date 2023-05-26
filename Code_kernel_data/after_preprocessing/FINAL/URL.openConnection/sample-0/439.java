public class func{
public void testOriginServerSends407(){
        server.enqueue(new MockResponse().setResponseCode(407));
        server.play();
        URL url = server.getUrl("/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.getResponseCode();
}
}
