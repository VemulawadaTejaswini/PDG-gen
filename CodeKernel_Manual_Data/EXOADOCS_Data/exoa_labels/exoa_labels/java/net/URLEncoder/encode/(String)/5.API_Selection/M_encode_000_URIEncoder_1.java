public class A{
	public static String encode(String str, String encoding)throws UnsupportedEncodingException {
		if (str == null) {
			return null;
		}
		return encode(str.getBytes(encoding));
	}
}