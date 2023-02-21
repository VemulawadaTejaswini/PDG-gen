public class A{
	public static String base64Encode(String s) {
		return new String(new BASE64Encoder().encode(s.getBytes()));
	}
}