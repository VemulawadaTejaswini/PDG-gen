public class A{
	//...
	public static void main(){
		String param = "?=" +"Name=" + idname + "&" +"Path=" + java.net.URLEncoder.encode(dataSource.getPath())+"&"+"Url=" + java.net.URLEncoder.encode(dataSource.getUrl()) + "&" +"SQLProxyServlet_URL=" + java.net.URLEncoder.encode(dataSource.getProxyURL()) + "&" +"Driver=" + java.net.URLEncoder.encode(dataSource.getDriver()) + "&" +"User=" + java.net.URLEncoder.encode(dataSource.getUser()) + "&" +"Password=" + java.net.URLEncoder.encode(dataSource.getPassword());
	}
}