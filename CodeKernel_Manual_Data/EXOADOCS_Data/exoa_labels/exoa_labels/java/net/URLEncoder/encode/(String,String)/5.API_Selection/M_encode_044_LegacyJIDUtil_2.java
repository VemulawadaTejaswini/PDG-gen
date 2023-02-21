public class A{
	public String encodedDomain(String domain) {
		try {
			if (null == domain) return null;
			return java.net.URLEncoder.encode(domain, "UTF-8");
		} catch (Exception e) {
			return domain;
		}
	}
}