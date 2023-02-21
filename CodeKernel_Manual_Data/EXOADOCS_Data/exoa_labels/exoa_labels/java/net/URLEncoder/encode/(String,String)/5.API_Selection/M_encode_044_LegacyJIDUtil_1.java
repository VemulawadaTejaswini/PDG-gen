public class A{
	public String encodedNode(String node) {
		try {
			if (null == node) return null;
			return java.net.URLEncoder.encode(node, "UTF-8");
		} catch (Exception e) {
			return node;
		}
	}
}