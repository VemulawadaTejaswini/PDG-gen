public class func{
public void invoke(String method,String resource,String queryString,String contentType){
        if (queryString != null) {
            s += "?" + queryString;
        }
        HttpURLConnection conn = (HttpURLConnection) new URL(s).openConnection();
        conn.setRequestProperty("content-type", contentType);
        conn.setRequestMethod(method);
        conn.connect();
        return conn.getResponseCode();
}
}
