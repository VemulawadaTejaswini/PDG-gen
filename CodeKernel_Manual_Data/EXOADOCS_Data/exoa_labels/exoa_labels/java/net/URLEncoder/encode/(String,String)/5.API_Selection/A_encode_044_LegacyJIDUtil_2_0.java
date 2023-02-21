public class A{
	public String encodedDomain(String domain) {
		//...
		return java.net.URLEncoder.encode(domain, "UTF-8");
	}
}