//17
public class func{
	public void process(final String urlStr){
      final URL url = new URL(urlStr);
      final URLConnection con = url.openConnection();
      con.addRequestProperty("Accept-Charset", encoding);
      String enc = con.getContentEncoding();
      if (enc == null) {
        enc = encoding;
      }
      getReceiver().process(new InputStreamReader(con.getInputStream(), enc));
}
}
