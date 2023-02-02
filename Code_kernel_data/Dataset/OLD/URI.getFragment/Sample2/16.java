//15
public class func{
	public void resolve(Object key){
      headers.put("authority", uri.getAuthority());
      headers.put("fragment", uri.getFragment());
      headers.put("host", uri.getHost());
      headers.put("path", uri.getPath());
      headers.put("port", String.valueOf(uri.getPort()));
      headers.put("query", uri.getQuery());
      if(null != uri.getQuery()) {
        try {
          String query = URLDecoder.decode(uri.getQuery(), "ISO-8859-1");
          for(String s : query.split("&")) {
            String[] parts = s.split("=");
            headers.put(parts[0], parts[1]);
          }
        } catch(UnsupportedEncodingException e) {
          throw new IllegalArgumentException(e);
        }
      }
      headers.put("scheme", uri.getScheme());
      headers.put("userInfo", uri.getUserInfo());
}
}
