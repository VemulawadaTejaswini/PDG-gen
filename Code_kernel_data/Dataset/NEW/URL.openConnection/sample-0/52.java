//52
public class func{
public void getUrl(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(10000);
            byte[] bytes = Utils.toByteArray(conn.getInputStream());
            return new String(bytes, StandardCharsets.UTF_8);
            conn.disconnect();
}
}
