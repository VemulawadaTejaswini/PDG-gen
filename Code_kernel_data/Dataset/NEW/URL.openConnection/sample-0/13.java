//13
public class func{
public void http(String method,String uri){
      URL url = new URL(uri);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod(method);
        Object content = conn.getContent();
        if(content instanceof InputStream)
            return new Response(conn.getResponseCode(), IOUtils.toString((InputStream) content, "UTF-8"));
        else if(content instanceof String)
            return new Response(conn.getResponseCode(), (String) content);
        else
            return new Response(conn.getResponseCode(), "unknown");
}
}
