//139
public class func{
public void call(){
      URL url = new URL(this.url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("User-Agent", userAgent);
        conn.setConnectTimeout(15000);
        conn.setReadTimeout(15000);
        return new VerificationResponseImpl(conn.getInputStream());
}
}
