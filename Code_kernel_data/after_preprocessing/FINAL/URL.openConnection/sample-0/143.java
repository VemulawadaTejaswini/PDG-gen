public class func{
public void prepareRequest(){
        HttpURLConnection conn = (HttpURLConnection) new URL(URL).openConnection();
        conn.setRequestMethod(HTTP_POST_METHOD);
        conn.setRequestProperty("Content-Type", CONTENT_TYPE);
        request = new HttpURLConnectionRequestAdapter(conn);
}
}
