public class A{
	public static String commEncode (String toEncode){
		try {
			return URLEncoder.encode(toEncode, "utf-8");
		}
		catch (UnsupportedEncodingException ex){
			CAT.error (ex);
			return encode(toEncode);
		}
	}
}