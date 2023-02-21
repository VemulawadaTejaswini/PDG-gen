public class A{
	public static String encode(String str) {
		if (str == null) {
			return null;
		}
		String encoding = Encoding.getDefault().getJavaEncoding();
		
		if (encoding == null) {
			return null;
		}
		String s = null;
		
		try {
			s = encode(str, encoding);
		} catch (UnsupportedEncodingException excpt) {
			System.err.println(excpt.toString());
			return null;
		}
		return s;
	}
}