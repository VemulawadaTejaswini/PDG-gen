public class func{
public void getRemoteContent(String urlString,Writer writer){
        URL url = new URL(getWithSessionIdUrl(urlString));
    URLConnection conn = url.openConnection();
        setConnectionHeaders(urlString, conn);
        InputStream input = conn.getInputStream();
          Reader reader = new InputStreamReader(input,Utils.getContentEncoding(conn,response));
          Utils.copy(reader,writer);
          if(input != null) input.close();
}
}
