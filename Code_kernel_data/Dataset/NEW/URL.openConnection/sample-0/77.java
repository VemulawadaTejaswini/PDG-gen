//77
public class func{
public void getRedirectURL(String url){
      HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
      conn.setInstanceFollowRedirects(false);
      if(conn.getResponseCode() == HttpServletResponse.SC_TEMPORARY_REDIRECT)
        redirectUrl = conn.getHeaderField("Location");
}
}
