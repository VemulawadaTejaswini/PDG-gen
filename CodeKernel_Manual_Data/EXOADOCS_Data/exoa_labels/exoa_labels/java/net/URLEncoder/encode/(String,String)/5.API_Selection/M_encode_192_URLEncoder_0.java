public class A{
	public String get(String in) {
		try {
			return java.net.URLEncoder.encode(in, "UTF-8");
		} catch (UnsupportedEncodingException ex) {
			return null;
		}
	}
}