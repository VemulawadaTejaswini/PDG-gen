public class A{
	public String getEncodedId(){
		return java.net.URLEncoder.encode(groupid);
	}
}