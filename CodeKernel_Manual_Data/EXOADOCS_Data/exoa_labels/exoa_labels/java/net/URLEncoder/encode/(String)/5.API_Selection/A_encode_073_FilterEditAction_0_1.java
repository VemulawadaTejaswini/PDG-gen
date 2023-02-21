public class A{
	//...
	public static void main(){
		String param = "?" +"name=" + java.net.URLEncoder.encode(filter.getName()) + "&" +"desc=" + java.net.URLEncoder.encode(filter.getDescription()) + "&" +"pattern=" + java.net.URLEncoder.encode(filter.getPattern());
	}
}