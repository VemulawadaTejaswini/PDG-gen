public class A{
	public String encode(String pValue) throws UnsupportedEncodingException {
		return java.net.URLEncoder.encode(pValue, "UTF8");
	}
}