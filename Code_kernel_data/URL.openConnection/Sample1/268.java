//267
public class func{
	public void get(final Object key){
    final Matcher matcher = VAR_PATTERN.matcher(url);
      final URL url = new URL(matcher.replaceAll(key.toString()));
      final URLConnection con = url.openConnection();
      return (String) con.getContent();
}
}
