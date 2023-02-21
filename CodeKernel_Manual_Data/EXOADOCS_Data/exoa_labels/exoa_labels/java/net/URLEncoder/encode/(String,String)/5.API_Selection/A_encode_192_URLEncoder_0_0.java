public class A{
	public String get(String in) {
		//...
		return java.net.URLEncoder.encode(in, "UTF-8");
	}
}