public class A{
	public String encodedNode(String node) {
		//...
		return java.net.URLEncoder.encode(node, "UTF-8");
	}
}