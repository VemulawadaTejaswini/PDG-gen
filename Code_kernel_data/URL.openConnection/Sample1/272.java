//271
public class func{
	public void login(){
          + URLEncoder.encode(username, "UTF-8") + "&password="
          + URLEncoder.encode(password, "UTF-8");
      URL loginurl = new URL(url);
      URLConnection connection = loginurl.openConnection();
      cookies = connection.getHeaderFields().get("Set-Cookie");
}
}
