public class A{
	protected String encodedResource(String resource) {
		try {
			if (null == resource) return null;
			return (resource == null) ? null : java.net.URLEncoder.encode(resource, "UTF-8");
		} catch (Exception e) {
			return resource;
		}
	}
}