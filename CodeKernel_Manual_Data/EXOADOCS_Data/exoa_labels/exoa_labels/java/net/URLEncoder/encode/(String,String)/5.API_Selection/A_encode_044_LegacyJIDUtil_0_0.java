public class A{
	protected String encodedResource(String resource) {
		//...
		return (resource == null) ? null : java.net.URLEncoder.encode(resource, "UTF-8");
	}
}