public class A{
	public static String encode(String s) {
		try {
			return encode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new AssertionError(e);
		}
	}
}